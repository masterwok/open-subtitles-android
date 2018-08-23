package com.masterwok.opensubtitlesandroid.extensions

import java.util.zip.ZipEntry
import java.util.zip.ZipFile


/**
 * Get a [ZipEntry] from within the [ZipFile] if the name matches [name]. If
 * no entry matches, then null is returned.
 */
internal fun ZipFile.getByName(name: String): ZipEntry? = entries()
        .toList()
        .firstOrNull { it.name == name }

/**
 * Get the largest [ZipEntry] with the provided [extension]from the [ZipFile].
 * If the [ZipFile] doesn't contain any entries, then null is returned. If no
 * [extension] is provided, the entries are not filtered by [extension].
 */
internal fun ZipFile.getLargestEntry(extension: String?): ZipEntry? {
    var largestEntry: ZipEntry? = null
    var maxEntrySize = 0L

    var entries = entries().toList()

    if (extension != null) {
        entries = entries.filter { it.name.toLowerCase().endsWith(extension) }
    }

    entries.forEach {
        if (it.size > maxEntrySize) {
            maxEntrySize = it.size
            largestEntry = it
        }
    }

    return largestEntry
}

/**
 * Get [ZipEntry] by name or default to the largest [ZipEntry] with the provided [extension].
 */
internal fun ZipFile.getByNameOrDefaultToLargest(
        name: String
        , extension: String?
): ZipEntry? = getEntry(name) ?: getLargestEntry(extension)