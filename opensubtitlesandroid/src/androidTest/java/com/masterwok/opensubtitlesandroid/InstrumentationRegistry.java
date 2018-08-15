package android.support.test;

import android.content.Context;

/**
 * Hack to get mockito working with androidx.
 * See: https://github.com/mockito/mockito/issues/1472
 */
@SuppressWarnings("unused")
public class InstrumentationRegistry {
    public static Context getTargetContext() {
        return androidx.test.InstrumentationRegistry.getTargetContext();
    }
}