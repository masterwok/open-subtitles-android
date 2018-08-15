package com.masterwok.opensubtitlesandroid.services.contracts

import android.content.Context
import android.net.Uri
import com.masterwok.opensubtitlesandroid.models.OpenSubtitleItem


/**
 * This contract provides a simple interface to the Open Subtitles REST API.
 */
interface OpenSubtitlesService {

    /**
     * Search the Open Subtitles API using the provided [userAgent] and [url].
     * The [url] should be generated using the [@see OpenSubtitlesUrlBuilder].
     * The [userAgent] should be the user agent you registered with Open Subtitles.
     * The [@see OpenSubtitlesService.TemporaryUserAgent] value should only be used
     * during development.
     */
    fun search(userAgent: String, url: String): Array<OpenSubtitleItem>

    /**
     * Download the provided [subtitleItem] to the provided [destinationUri].
     */
    fun downloadSubtitle(
            context: Context
            , subtitleItem: OpenSubtitleItem
            , destinationUri: Uri
    )


}