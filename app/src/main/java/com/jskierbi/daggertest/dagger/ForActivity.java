package com.jskierbi.daggertest.dagger;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by jakub on 01/06/15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface ForActivity {
}
