package com.masterwok.opensubtitlesandroid.extensions

import java.util.zip.ZipEntry
import java.util.zip.ZipFile


/**
 * Get a [ZipEntry] from within the [ZipFile] if the name matches [name]. If
 * no entry matches, then null is returned.
 */
internal fun ZipFile.getByName(name: String): ZipEntry? = entries()
        .toList()
        .first { it.name == name }

