package com.jskierbi.daggertest.dagger;

import com.jskierbi.daggertest.MainActivity;
import dagger.Subcomponent;

/**
 * Created by jakub on 01/06/15.
 */
@Subcomponent(modules = {ActivityModule.class})
@ActivityScope
public interface ActivitySubcomponent {

  void inject(MainActivity mainActivity);
}
