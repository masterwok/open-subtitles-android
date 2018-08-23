package com.masterwok.opensubtitlesandroid

import com.masterwok.opensubtitlesandroid.extensions.getValue
import kotlin.reflect.KProperty1
import kotlin.reflect.KVisibility
import kotlin.reflect.full.memberProperties


/**
 * Open Subtitles language codes represented as ISO639-2.
 * See: https://www.opensubtitles.org/addons/export_languages.php
 */
@Suppress("unused")
class Subtitle private constructor() {

    annotation class DisplayName(val name: String)

    data class Language constructor(
            val displayName: String
            , val subLanguageId: String
    ) {
        override fun toString(): String = displayName
    }

    companion object {

        // I'm not a fan of reflection, but doing this makes the list of
        // languages easier to maintain.
        private val supportedLanguagesLazy: List<Language> by lazy {
            this::class
                    .memberProperties
                    .filter { it.visibility == KVisibility.PUBLIC && it.isConst }
                    .sortedBy { it.name }
                    .map { toLanguage(it) }
        }

        private fun toLanguage(
                it: KProperty1<out Subtitle.Companion, Any?>
        ): Language = Language(
                (it.annotations.first() as DisplayName).name
                , it.getValue<String>(Subtitle.Companion)!!
        )

        /**
         * Get a list of names of supported languages.
         */
        @JvmStatic
        val supportedLanguages: List<Language>
            get() = supportedLanguagesLazy


        @DisplayName("Hello, World!")
        const val Derp = "123"


    }
}
