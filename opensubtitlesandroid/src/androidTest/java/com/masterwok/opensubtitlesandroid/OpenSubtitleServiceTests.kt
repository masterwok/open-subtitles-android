package com.masterwok.opensubtitlesandroid

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import com.masterwok.opensubtitlesandroid.services.OpenSubtitlesService
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import java.io.File


@RunWith(MockitoJUnitRunner::class)
class OpenSubtitleServiceTests {

    @Mock
    lateinit var context: Context

    @Mock
    lateinit var contentResolver: ContentResolver

    @Before
    fun before() {
        MockitoAnnotations.initMocks(this)

        Mockito.`when`(context.contentResolver).thenReturn(contentResolver)
    }

    private fun getUrl(): String = OpenSubtitlesUrlBuilder()
            .query("Hackers 1995")
            .subLanguageId("eng")
            .build()

    @Test
    fun searchReturnsItems() {
        val service = OpenSubtitlesService()

        val result = service.search(OpenSubtitlesService.TemporaryUserAgent, getUrl())

        assertTrue(result.isNotEmpty())
    }

    @Test
    fun downloadsSubtitleToDestinationUri() {
        val service = OpenSubtitlesService()

        val result = service.search(OpenSubtitlesService.TemporaryUserAgent, getUrl())

        val tmpFile = File.createTempFile("sub", "srt")

        service.downloadSubtitle(
                context
                , result.first()
                , Uri.fromFile(tmpFile)
        )

        assertTrue(tmpFile.length() > 0)
    }

}