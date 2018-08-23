package com.masterwok.opensubtitlesandroid

import android.Manifest
import android.content.pm.PackageManager
import android.net.Uri
import android.os.AsyncTask
import android.os.Bundle
import android.os.Environment
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.masterwok.opensubtitlesandroid.extensions.appCompatRequestPermissions
import com.masterwok.opensubtitlesandroid.extensions.isPermissionGranted
import com.masterwok.opensubtitlesandroid.services.OpenSubtitlesService
import java.io.File

class MainActivity : AppCompatActivity() {

    companion object {
        const val Tag = "OpenSubtitlesDemo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (!isPermissionGranted(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            appCompatRequestPermissions(
                    arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    , 0
            )

            return
        }

        AsyncTask.execute { downloadHackersMovieSubtitles() }
    }

    override fun onRequestPermissionsResult(
            requestCode: Int
            , permissions: Array<out String>
            , grantResults: IntArray
    ) {
        val permissionWasDenied = grantResults.any { it != PackageManager.PERMISSION_GRANTED }

        if (permissionWasDenied) {
            throw Exception("WRITE_EXTERNAL_STORAGE permission must be granted to run demo.")
        }

        AsyncTask.execute { downloadHackersMovieSubtitles() }
    }

    private fun downloadHackersMovieSubtitles() {
        val downloadLocation = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
        val subtitleService = OpenSubtitlesService()

        val url = OpenSubtitlesUrlBuilder()
                .query("The Hunt for Red October")
                .subLanguageId(SubtitleLanguage.Finnish)
                .build()

        val searchResults = subtitleService.search(
                OpenSubtitlesService.TemporaryUserAgent
                , url
        )

        val firstSubtitleItem = searchResults.firstOrNull()

        if (firstSubtitleItem == null) {
            Log.w(Tag, "No subtitles found. Try changing the language or query.")
            return
        }

        val outputFile = File(downloadLocation, firstSubtitleItem.SubFileName)

        subtitleService.downloadSubtitle(
                this
                , firstSubtitleItem
                , Uri.fromFile(outputFile)
        )

    }
}
