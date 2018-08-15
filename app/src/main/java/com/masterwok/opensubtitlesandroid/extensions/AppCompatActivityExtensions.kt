package com.masterwok.opensubtitlesandroid.extensions

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat


/**
 * Request an array of [permissions] with the provided [requestCode].
 */
fun AppCompatActivity.appCompatRequestPermissions(
        permissions: Array<String>
        , requestCode: Int
) = ActivityCompat.requestPermissions(
        this
        , permissions
        , requestCode
)


/**
 * Determine whether or not the provided [permission] is granted.
 */
fun AppCompatActivity.isPermissionGranted(permission: String): Boolean = ActivityCompat
        .checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
