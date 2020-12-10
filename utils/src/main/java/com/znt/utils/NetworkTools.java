package com.znt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 2019/6/19 10:26 AM
 * describe: This is...
 */
public class NetworkTools {

    //未找到合适匹配网络类型
    public static final int TYPE_NONE = 0;
    //GPRS网络
    public static final int TYPE_GPRS = 1;
    //WIFI网络
    public static final int TYPE_WIFI = 2;

    /**
     * 获取当前手机连接的网络类型
     *
     * @param context 上下文
     * @return int 网络类型
     */
    public static int getNetworkState(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        @SuppressLint("MissingPermission") NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isAvailable()) {
            int currentNetWork = networkInfo.getType();
            if (currentNetWork == ConnectivityManager.TYPE_MOBILE) {//手机网络类型
                Log.i("NetworkTools", "手机网络类型");
                return TYPE_GPRS;
            } else if (currentNetWork == ConnectivityManager.TYPE_WIFI) { //WIFI网络类型
                Log.i("NetworkTools", "WIFI网络类型");
                return TYPE_WIFI;
            }
        }
        Log.i("NetworkTools", "当前网络为不是我们考虑的网络");
        return TYPE_NONE;
    }


    /**
     * 判断网络是否连接
     *
     * @param context 上下文
     * @return boolean 网络连接状态
     */
    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        @SuppressLint("MissingPermission") NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
        //获取连接对象
        if (mNetworkInfo != null) {
            if (ConnectivityManager.TYPE_MOBILE == mNetworkInfo.getType()) { //判断是TYPE_MOBILE网络
                //判断移动网络连接状态
                @SuppressLint("MissingPermission") NetworkInfo.State STATE_MOBILE = mConnectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState();
                if (STATE_MOBILE == NetworkInfo.State.CONNECTED) {
                    Log.i("AppNetworkMgrd", "网络连接类型为：TYPE_MOBILE, 网络连接状态CONNECTED成功！");
                    return mNetworkInfo.isAvailable();
                }
            } else if (ConnectivityManager.TYPE_WIFI == mNetworkInfo.getType()) { //判断是TYPE_WIFI网络
                //判断WIFI网络状态
                @SuppressLint("MissingPermission") NetworkInfo.State STATE_WIFI = mConnectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState();
                if (STATE_WIFI == NetworkInfo.State.CONNECTED) {
                    Log.i("AppNetworkMgr", "网络连接类型为：TYPE_WIFI, 网络连接状态CONNECTED成功！");
                    return mNetworkInfo.isAvailable();
                }
            }
        }
        return false;
    }
}
