package com.masterwok.opensubtitlesandroid.extensions

import kotlin.reflect.KProperty1


/**
 * Get value of a [KProperty1] belonging to some [instance].
 */
@Suppress("UNCHECKED_CAST")
internal fun <T> KProperty1<out Any, Any?>.getValue(
        instance: Any
): T? = (this as? KProperty1<Any, T>)?.get(instance)
