package com.jskierbi.daggertest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import com.jskierbi.daggertest.dagger.ActivityModule;
import com.jskierbi.daggertest.dagger.ActivitySubcomponent;
import com.jskierbi.daggertest.dagger.ForApplication;

import javax.inject.Inject;
import javax.inject.Named;


public class MainActivity extends ActionBarActivity {

  @Inject
  App mApp;

  @Inject
  ProviderService mProviderService;

  @Inject
  LayoutInflater mLayoutInflater;

  @Inject
  @Named("port")
  Integer mPortNumber;

  @Inject
  @ForApplication
  Context mContext;

  private ActivitySubcomponent mActivityModule;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mActivityModule =
        ((App) getApplication())
            .getAppComponent()
            .plusActivity(new ActivityModule(this));

    mActivityModule.inject(this);

    setContentView(R.layout.activity_main);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
