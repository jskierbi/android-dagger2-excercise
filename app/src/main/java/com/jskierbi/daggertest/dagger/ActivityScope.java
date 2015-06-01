package com.jskierbi.daggertest.dagger;

import javax.inject.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by jakub on 01/06/15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface ActivityScope {
}
