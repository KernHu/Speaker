package com.znt.data;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import io.reactivex.android.BuildConfig;
import okhttp3.OkHttpClient;

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

    //请求超时
    private static final long TIME_OUT = 10000L;

    /**
     * 测试版本则测试网，反之正式网，默认为0，0为测试网
     */
    private static int hostType = BuildConfig.DEBUG ? 0 : 1;


    /**
     * 因为牵扯到第三方的服务器，
     * HOST_SEARCH为360推荐词搜索的host
     * HOST_LOCAL为本地服host
     */
    public enum HostType {

        HOST_SEARCH, HOST_LOCAL
    }


    /**
     * 初始化配置
     *
     * @param context
     */
    public static void initOkhttp(Context context) {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(TIME_OUT, TimeUnit.MILLISECONDS)
                .readTimeout(TIME_OUT, TimeUnit.MILLISECONDS)
                //.cookieJar(new CookieJarImpl(new PersistentCookieStore(context)))//cookie配置
                //.addInterceptor(new LoggerInterceptor(TAG))//log日志
                //.sslSocketFactory(SSLSocketClient.getSSLSocketFactory())//配置
                //.hostnameVerifier(SSLSocketClient.getHostnameVerifier())//配置
                .build();

        //OkHttpUtils.initClient(okHttpClient);

    }

    /**
     * 区分正式网还是测试网
     *
     * @return
     */
    private static String getHost() {

        return hostType == 0 ? HOST_TEST : HOST_OFFICIAL;
    }


    public static String getHttpUrl() {

        return getHttpUrl(HostType.HOST_LOCAL);
    }

    /**
     * 区分host为自己服务器的还是第三方服务器的
     *
     * @param type
     * @return
     */
    public static String getHttpUrl(HostType type) {
        //如果是第反方服务器，则返回第三方服务器的host，反之，自己本地的；
        //注意替换后面的HTTP + getHost()
        return type.equals(HostType.HOST_LOCAL) ? HTTP + getHost() : HTTP + getHost();
    }

    /**
     * 适用于retrofit的url
     *
     * @return
     */
    public static String getCommonHost() {
        return getHttpUrl() + "/api/";
    }
}
