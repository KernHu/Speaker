package com.znt.data;

import android.content.Intent;
import android.os.IBinder;

import com.znt.retrofit.mvp.SuperBasePresenter;
import com.znt.retrofit.mvp.impl.SuperBaseService;

import androidx.annotation.Nullable;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/6/20 5:37 PM
 * describe: This is...
 */

public class DataService extends SuperBaseService {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    @Override
    public SuperBasePresenter initPresenter() {
        return null;
    }
}
