package com.jskierbi.daggertest.dagger;

import android.content.Context;
import com.jskierbi.daggertest.App;
import dagger.Module;
import dagger.Provides;

/**
 * Created by jakub on 01/06/15.
 */
@Module
public class AppModule {

  private App mApp;

  public AppModule(App mApp) {
    this.mApp = mApp;
  }

  @Provides
  @ApplicationScope
  App provideApp() {
    return mApp;
  }

  @Provides
  @ForApplication
  Context provideAppContext() {
    return mApp.getApplicationContext();
  }
}
