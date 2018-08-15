package com.masterwok.opensubtitlesandroid

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

class OpenSubtitlesServiceOpenSubtitlesUrlBuilderTest {

    private val basePath = "https://rest.opensubtitles.org/search"

    @Test
    fun correctlyBuildsEpisodeUrl() {
        val episode = 6

        val url = OpenSubtitlesUrlBuilder()
                .episode(episode)
                .build()

        assertEquals("$basePath/episode-$episode", url)
    }

    @Test
    fun correctlyBuildsIMdbIdUrl() {
        val imdbId = 1000L

        val url = OpenSubtitlesUrlBuilder()
                .imdbId(imdbId)
                .build()

        val expectedImdbId = String.format("%07d", imdbId)

        assertEquals("$basePath/imdbid-$expectedImdbId", url)
    }

    @Test
    fun correctlyBuildsByteSizeUrl() {
        val byteSize = 6L

        val url = OpenSubtitlesUrlBuilder()
                .movieByteSize(byteSize)
                .build()

        assertEquals("$basePath/moviebytesize-$byteSize", url)
    }

    @Test
    fun correctlyBuildsMovieHashUrl() {
        val movieHash = "666"

        val url = OpenSubtitlesUrlBuilder()
                .movieHash(movieHash)
                .build()

        assertEquals("$basePath/moviehash-$movieHash", url)
    }

    @Test
    fun correctlyBuildsQueryUrl() {
        val query = "666"

        val url = OpenSubtitlesUrlBuilder()
                .query(query)
                .build()

        assertEquals("$basePath/query-$query", url)
    }

    @Test
    fun correctlyBuildsSeasonUrl() {
        val season = 666

        val url = OpenSubtitlesUrlBuilder()
                .season(season)
                .build()

        assertEquals("$basePath/season-$season", url)
    }

    @Test
    fun correctlyBuildsSubLanguageUrl() {
        val subLanguageId = "eng"

        val url = OpenSubtitlesUrlBuilder()
                .subLanguageId(subLanguageId)
                .build()

        assertEquals("$basePath/sublanguageid-$subLanguageId", url)
    }

    @Test
    fun correctlyBuildsTagQuery() {
        val tag = "masterwok"

        val url = OpenSubtitlesUrlBuilder()
                .tag(tag)
                .build()

        assertEquals("$basePath/tag-$tag", url)
    }

    @Test
    fun correctlyBuildsUrlInOrder() {
        val url = OpenSubtitlesUrlBuilder()
                .episode(1)
                .imdbId(1L)
                .movieByteSize(1L)
                .movieHash("masterwok")
                .query("masterwok")
                .season(1)
                .subLanguageId("eng")
                .tag("masterwok")
                .build()

        assertTrue(url.indexOf("episode") < url.indexOf("imdbid"))
        assertTrue(url.indexOf("imdbid") < url.indexOf("moviebytesize"))
        assertTrue(url.indexOf("moviebytesize") < url.indexOf("moviehash"))
        assertTrue(url.indexOf("moviehash") < url.indexOf("query"))
        assertTrue(url.indexOf("query") < url.indexOf("season"))
        assertTrue(url.indexOf("season") < url.indexOf("sublanguageid"))
        assertTrue(url.indexOf("sublanguageid") < url.indexOf("tag"))
    }
}