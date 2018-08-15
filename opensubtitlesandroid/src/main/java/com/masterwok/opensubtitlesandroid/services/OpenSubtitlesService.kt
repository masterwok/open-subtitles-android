package com.masterwok.opensubtitlesandroid.services

import android.content.Context
import android.net.Uri
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.httpGet
import com.masterwok.opensubtitlesandroid.extensions.getByName
import com.masterwok.opensubtitlesandroid.models.OpenSubtitleItem
import com.masterwok.opensubtitlesandroid.services.contracts.OpenSubtitlesService
import java.io.File
import java.io.OutputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipFile


class OpenSubtitlesService : OpenSubtitlesService {

    companion object {
        const val TemporaryUserAgent = "TemporaryUserAgent"
    }

    /**
     * Blocking search of the Open Subtitles REST API.
     */
    override fun search(userAgent: String, url: String): Array<OpenSubtitleItem> = url
            .httpGet()
            .header("User-Agent" to userAgent)
            .responseObject(OpenSubtitleItem.Deserializer)
            .third
            .get()

    /**
     * Blocking download of a subtitle from the REST API.
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

        // Get the subtitle zip entry for the file name specified by the subtitle item.
        val subtitleZipEntry: ZipEntry? = zipFile.getByName(subtitleItem.SubFileName)
                ?: throw RuntimeException("Subtitle zip did not contain promised file.")

        // Copy file to destination.
        val inputStream = zipFile.getInputStream(subtitleZipEntry)

        val outputStream: OutputStream = context
                .contentResolver
                .openOutputStream(destinationUri)
                ?: throw RuntimeException("Failed to open output stream for Uri: $destinationUri")

        inputStream.copyTo(outputStream)

        // Clean up resources
        inputStream.close()
        outputStream.close()
        tmpZipFile.delete()
    }

}