package com.jskierbi.daggertest;

import android.app.Application;
import com.jskierbi.daggertest.dagger.AppComponent;
import com.jskierbi.daggertest.dagger.AppModule;
import com.jskierbi.daggertest.dagger.DaggerAppComponent;

/**
 * Created by jakub on 01/06/15.
 */
public class App extends Application {

  private AppComponent mAppComponent;

  @Override
  public void onCreate() {
    super.onCreate();

    mAppComponent = DaggerAppComponent.builder()
        .appModule(new AppModule(this))
        .build();

    mAppComponent.inject(this);
  }

  public AppComponent getAppComponent() {
    return mAppComponent;
  }
}

