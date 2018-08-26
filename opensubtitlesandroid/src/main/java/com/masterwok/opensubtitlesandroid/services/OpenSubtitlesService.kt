package com.masterwok.opensubtitlesandroid.services

import android.content.Context
import android.net.Uri
import com.github.kittinunf.fuel.httpGet
import com.masterwok.opensubtitlesandroid.models.OpenSubtitleItem
import com.masterwok.opensubtitlesandroid.services.contracts.OpenSubtitlesService
import java.net.HttpURLConnection
import java.net.URL
import java.util.zip.GZIPInputStream


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
        val url = URL(subtitleItem.SubDownloadLink)
        val urlConnection = url.openConnection() as HttpURLConnection
        val inputStream = GZIPInputStream(urlConnection.inputStream)

        val outputStream = context
                .contentResolver
                .openOutputStream(destinationUri)
                ?: throw RuntimeException("Failed to open output stream for Uri: $destinationUri")

        inputStream.copyTo(outputStream)

        // Clean up resources
        inputStream.close()
        outputStream.close()
    }

}