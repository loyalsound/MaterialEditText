package com.rengwuxian.materialedittext.validation;

import android.support.annotation.NonNull;

/**
 * Base preprocessor class to transform text before validation
 */
public abstract class MetTextPreprocessor {

    public abstract String transform(@NonNull CharSequence text);
}
