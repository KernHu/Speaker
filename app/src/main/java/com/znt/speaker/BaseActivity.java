package com.znt.speaker;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

import com.znt.utils.DateTimeTools;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/10/20 8:31 PM
 * describe: This is...
 */

public class BaseActivity extends AppCompatActivity implements Handler.Callback {

    protected Intent mIntent;

    private Handler mHandler = new Handler(this);

    private ScheduledExecutorService mScheduledExecutorService = Executors.newScheduledThreadPool(1);


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mScheduledExecutorService
                .scheduleAtFixedRate(mScheduleRunnable, 0, 5000, TimeUnit.MILLISECONDS);
    }


    @Override
    protected void onResume() {
        super.onResume();


    }

    @Override
    protected void onPause() {
        super.onPause();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mScheduledExecutorService != null) {
            mScheduledExecutorService.shutdownNow();
            mScheduledExecutorService = null;
        }
    }

    protected void initView() {

    }

    protected void bindEvent() {

    }

    protected void bindDate() {


    }

    /**
     *
     */
    private Runnable mScheduleRunnable = new Runnable() {
        @Override
        public void run() {

            mHandler.sendEmptyMessage(110);
        }
    };


    @Override
    public boolean handleMessage(Message msg) {

        switch (msg.what) {

            case 110:

                onTicktack();

                break;
        }
        return false;
    }

    /**
     * 定时器的心跳
     */
    protected void onTicktack() {

        Log.d("Ticktack", "onTicktack=" + DateTimeTools.todayHhMmSs());

    }
}
