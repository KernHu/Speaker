package com.znt.data.app;

import com.znt.data.constants.SharePrefConstants;
import com.znt.utils.SharedPrefUtils;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/8/20 7:08 PM
 * describe: This is...
 */

public class AppBase extends AppSdk {

    private static AppBase appBase;
    private long id;


    @Override
    public void onCreate() {
        super.onCreate();
        appBase = this;
        id = SharedPrefUtils.getLong(getBaseContext(), SharePrefConstants.KEY_ID, 0);
    }

    public static AppBase getApp() {
        return appBase;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
