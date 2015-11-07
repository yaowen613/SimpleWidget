package com.yaowen.widget;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by HelloWorld on 2015/11/7.
 */
public class TiemerService extends Service {
    private Timer timer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                updateView();
            }
        },0,1000);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        timer=null;
    }
}
