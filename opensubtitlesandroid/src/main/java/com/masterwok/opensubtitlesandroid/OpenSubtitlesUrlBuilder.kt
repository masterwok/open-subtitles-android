package com.masterwok.opensubtitlesandroid

import java.net.URLEncoder


@Suppress("unused")
/**
 * This class can be used to generate a URL for the Open Subtitles REST API.
 * See: https://forum.opensubtitles.org/viewtopic.php?f=8&t=16453#p39771
 */
class OpenSubtitlesUrlBuilder constructor(
        private val basePath: String = "https://rest.opensubtitles.org/search"
) {
    private var episode: Int? = null
    private var imdbId: String? = null
    private var movieByteSize: Long? = null
    private var movieHash: String? = null
    private var query: String? = null
    private var season: Int? = null
    private var subLanguageId: String? = null
    private var tag: String? = null

    fun episode(episode: Int): OpenSubtitlesUrlBuilder {
        this.episode = episode
        return this
    }

    fun imdbId(imdbId: Long): OpenSubtitlesUrlBuilder {
        this.imdbId = String.format("%07d", imdbId)
        return this
    }

    fun movieByteSize(movieByteSize: Long): OpenSubtitlesUrlBuilder {
        this.movieByteSize = movieByteSize
        return this
    }

    fun movieHash(movieHash: String): OpenSubtitlesUrlBuilder {
        this.movieHash = movieHash
        return this
    }

    fun query(query: String): OpenSubtitlesUrlBuilder {
        this.query = URLEncoder.encode(query, "utf-8")
        return this
    }

    fun season(season: Int): OpenSubtitlesUrlBuilder {
        this.season = season
        return this
    }

    fun subLanguageId(subLanguageId: String): OpenSubtitlesUrlBuilder {
        this.subLanguageId = subLanguageId
        return this
    }

    fun tag(tag: String): OpenSubtitlesUrlBuilder {
        this.tag = tag
        return this
    }

    /**
     * Build the URL by using the set parameters. According to the documentation,
     * it's important to order these options alphabetically or a redirect will
     * occur.
     */
    fun build(): String {
        var queryString = basePath

        if (episode != null) {
            queryString = "$queryString/episode-$episode"
        }

        if (imdbId != null) {
            queryString = "$queryString/imdbid-$imdbId"
        }

        if (movieByteSize != null) {
            queryString = "$queryString/moviebytesize-$movieByteSize"
        }

        if (movieHash != null) {
            queryString = "$queryString/moviehash-$movieHash"
        }

        if (query != null) {
            queryString = "$queryString/query-$query"
        }

        if (season != null) {
            queryString = "$queryString/season-$season"
        }

        if (subLanguageId != null) {
            queryString = "$queryString/sublanguageid-$subLanguageId"
        }

        if (tag != null) {
            queryString = "$queryString/tag-$tag"
        }

        return queryString
    }
}