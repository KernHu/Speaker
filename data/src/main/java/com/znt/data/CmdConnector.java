package com.znt.data;

import io.reactivex.android.BuildConfig;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/7/20 7:15 PM
 * describe: This is...
 */

public class CmdConnector {

    private static final String TAG = "cmd_connector";

    private static final String HTTP = "http://";
    private static final String HTTPS = "https://";

    //测试网host
    private static final String HOST_TEST = "192.168.1.148:10401";
    //正式网host
    private static final String HOST_OFFICIAL = "ad.szprize.cn";


    public static String getBaseUrl() {
        return BuildConfig.DEBUG ? HTTP + HOST_TEST : HTTP + HOST_OFFICIAL;
    }

}
