package com.jskierbi.daggertest;

import android.app.FragmentManager;
import android.content.Context;
import com.jskierbi.daggertest.dagger.ForActivity;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by jakub on 01/06/15.
 */
public class ProviderService {

  @Inject
  App mApp;

  @Inject
  @ForActivity
  Context mContext;

  @Inject
  @Named("port")
  Integer mPort;

  @Inject
  FragmentManager mFragmentManager;

  @Inject
  public ProviderService() {

  }
}
