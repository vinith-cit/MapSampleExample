package com.example.vinith.maptask;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by sony on 20-Oct-16.
 */

public class MapsApplication extends Application{

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }
    @Override
    public void onCreate() {
        super.onCreate();

    }

}
