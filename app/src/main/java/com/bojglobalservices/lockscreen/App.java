package com.bojglobalservices.lockscreen;

import android.app.Application;
import android.content.Intent;

/**
 * Created by Dosh on 11/17/2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        startService(new Intent(this, Backgound.class));
    }
}