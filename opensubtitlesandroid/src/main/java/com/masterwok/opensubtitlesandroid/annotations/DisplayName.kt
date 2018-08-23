package com.masterwok.opensubtitlesandroid.annotations


/**
 * A simple annotation for adding a display name to a field.
 */
@Target(AnnotationTarget.FIELD)
annotation class DisplayName(val name: String)
