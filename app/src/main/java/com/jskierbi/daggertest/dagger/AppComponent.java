package com.jskierbi.daggertest.dagger;

import com.jskierbi.daggertest.App;
import dagger.Component;

/**
 * Created by jakub on 01/06/15.
 */
@Component(modules = {AppModule.class})
@ApplicationScope
public interface AppComponent {

  ActivitySubcomponent plusActivity(ActivityModule activityModule);

  void inject(App app);
}
