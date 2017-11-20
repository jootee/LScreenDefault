package com.bojglobalservices.lockscreen;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Dosh on 11/17/2017.
 */

public class Backgound extends Service {
    MediaPlayer mediaPlayer;



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.jjj);

        mediaPlayer.start();
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // do your jobs here

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.jjj);

        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }
}