package com.znt.data;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.znt.data.request.ConfigRequest;

import androidx.annotation.Nullable;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/6/20 5:37 PM
 * describe: This is...
 */

public class DataBindingService extends Service {


    @Override
    public void onCreate() {
        super.onCreate();
        ConfigRequest.getInstance().onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ConfigRequest.getInstance().onDestroy();
    }


}
