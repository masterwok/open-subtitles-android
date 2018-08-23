package com.masterwok.opensubtitlesandroid.extensions


/**
 * Get the extension of some path represented as a [String]. If no extension exists,
 * then an empty [String] is returned.
 */
internal fun String.getPathExtension(): String = substringAfterLast('.', "")