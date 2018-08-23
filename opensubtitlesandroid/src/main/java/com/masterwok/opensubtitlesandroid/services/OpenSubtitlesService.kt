package com.masterwok.opensubtitlesandroid.services

import android.content.Context
import android.net.Uri
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.httpGet
import com.masterwok.opensubtitlesandroid.extensions.getByNameOrDefaultToLargest
import com.masterwok.opensubtitlesandroid.extensions.getPathExtension
import com.masterwok.opensubtitlesandroid.models.OpenSubtitleItem
import com.masterwok.opensubtitlesandroid.services.contracts.OpenSubtitlesService
import java.io.File
import java.io.InputStreamReader
import java.io.OutputStream
import java.io.OutputStreamWriter
import java.nio.charset.Charset
import java.util.zip.ZipFile


class OpenSubtitlesService : OpenSubtitlesService {

    companion object {
        const val TemporaryUserAgent = "TemporaryUserAgent"
    }

    /**
     * Blocking search of the Open Subtitles REST API.
     */
    override fun search(
            userAgent: String
            , url: String
    ): Array<OpenSubtitleItem> = url
            .httpGet()
            .header("User-Agent" to userAgent)
            .responseObject(OpenSubtitleItem.Deserializer)
            .third
            .get()

    /**
     * Blocking download of a subtitle from the REST API. Sometimes the filename
     * specified in the [OpenSubtitleItem] does not exist within the zip file. When
     * this happens, the largest file with the same extension within the zip file is
     * downloaded.
     */
    override fun downloadSubtitle(
            context: Context
            , subtitleItem: OpenSubtitleItem
            , destinationUri: Uri
    ) {
        val tmpZipFile = File.createTempFile("sub", ".zip")

        // Download zip file specified in subtitle item.
        Fuel.download(subtitleItem.ZipDownloadLink).destination { _, _ ->
            tmpZipFile
        }.response()

        val zipFile = ZipFile(tmpZipFile)

        val zipEntry = zipFile.getByNameOrDefaultToLargest(
                subtitleItem.SubFileName
                , subtitleItem.SubFileName.getPathExtension()
        ) ?: throw RuntimeException("Subtitle zip did not contain promised file.")

        // Copy file to destination.
        val inputStream = InputStreamReader(zipFile.getInputStream(zipEntry))

        val outputStream: OutputStream = context
                .contentResolver
                .openOutputStream(destinationUri)
                ?: throw RuntimeException("Failed to open output stream for Uri: $destinationUri")

        inputStream.copyTo(OutputStreamWriter(
                outputStream
                , Charset.forName("UTF-8").newEncoder()
        ))

        // Clean up resources
        inputStream.close()
        outputStream.close()
        tmpZipFile.delete()
    }

}