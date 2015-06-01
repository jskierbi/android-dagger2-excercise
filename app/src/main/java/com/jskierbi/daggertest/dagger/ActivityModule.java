package com.jskierbi.daggertest.dagger;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.view.LayoutInflater;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

/**
 * Created by jakub on 01/06/15.
 */
@Module
public class ActivityModule {

  private Activity mActivity;

  public ActivityModule(Activity mActivity) {
    this.mActivity = mActivity;
  }

  @Provides
  @ActivityScope
  public FragmentManager provideFragmentManager() {
    return mActivity.getFragmentManager();
  }

  @Provides
  @ActivityScope
  public LayoutInflater provideLayoutInflater() {
    return LayoutInflater.from(mActivity);
  }

  @Provides
  @Named("port")
  public Integer providePortNumber() {
    return 80;
  }

  @Provides
  @ForActivity
  public Context provideActivityContext() {
    return mActivity;
  }

}
