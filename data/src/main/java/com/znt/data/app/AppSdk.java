package com.znt.data.app;

import android.app.Application;

import com.znt.data.BuildConfig;
import com.znt.data.CmdConnector;
import com.znt.retrofit.RaindropConfig;

import okhttp3.logging.HttpLoggingInterceptor;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/8/20 7:07 PM
 * describe: This is...
 */

public class AppSdk extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RaindropConfig
                .getInstance()
                .setContext(this)
                .setReadTimeout(12)
                .setWriteTimeout(12)
                .setConnectTimeout(12)
                .setLogTag("http-sos")
                .setRetrofitLockable(true)
                .setRetryOnConnectionFailure(true)
                .setLogPrintable(BuildConfig.DEBUG)
                .setBaseUrl(CmdConnector.getBaseUrl())
                .setLogLevel(HttpLoggingInterceptor.Level.BODY)
                .build();

    }
}
