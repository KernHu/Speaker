package com.znt.data.model;



import com.znt.data.RespBody;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/7/20 6:45 PM
 * describe: This is...
 */

public interface ConfigRetrofitService {

    /**
     * 初始化
     *
     * @return
     */
    @POST("api/terminal/init")
    Observable<RespBody> terminalInit(
            @Query("id") String id,
            @Query("softVersion") String softVersion,
            @Query("hardVersion") String hardVersion
    );

    /**
     * 盒子注册接口
     *
     * @return
     */
    @POST("api/terminal/addbox")
    Observable<RespBody> terminalAddbox(
            @Query("code") String code,
            @Query("softCode") String softCode,
            @Query("softVersion") String softVersion,
            @Query("hardVersion") String hardVersion,
            @Query("terminalType") String terminalType,  //1-pc 2-box 3-tv，4-ipad不传服务根据softcode判断
            @Query("longitude") String longitude,
            @Query("latitude") String latitude
    );


    /**
     * 注册接口
     *
     * @return
     */
    @POST("api/terminal/register")
    Observable<RespBody> terminalRegister(
            @Query("id") String id,
            @Query("shopName") String shopName,
            @Query("bindCode") String bindCode,
            @Query("softCode") String softCode,
            @Query("softVersion") String softVersion,
            @Query("hardVersion") String hardVersion,
            @Query("longitude") String longitude,
            @Query("latitude") String latitude
    );

    /**
     * 登陆接口
     *
     * @return
     */
    @POST("api/terminal/login")
    Observable<RespBody> terminalLogin(
            @Query("id") String id
    );

    /**
     * 轮询获取状态接口
     *
     * @return
     */
    @POST("api/terminal/status")
    Observable<RespBody> terminalStatus(
            @Query("id") String id,
            @Query("playingSongId") String playingSongId,
            @Query("playingSong") String playingSong,
            @Query("playingSongType") String playingSongType,
            @Query("playingPos") String playingPos,
            @Query("playSeek") String playSeek,
            @Query("netInfo") String netInfo
    );


    /**
     * 获取最新软件版本接口
     *
     * @return
     */
    @POST("api/terminal/lastversion")
    Observable<RespBody> terminalLastVersion(
            @Query("id") String id,
            @Query("softCode") String softCode,//软件代码（DianYinMusicPC, DianYinMusicBox）
            @Query("versionCode") String versionCode,
            @Query("versionName") String versionName,
            @Query("hardVersion") String hardVersion
    );

    /**
     * 获取店铺wifi
     *
     * @return
     */
    @POST("api/terminal/wifi")
    Observable<RespBody> terminalWifi(
            @Query("shopCode") String shopCode,
            @Query("id") String id
    );

    /**
     * 更新店铺及设备信息接口
     *
     * @return
     */
    @POST("api/terminal/update")
    Observable<RespBody> terminalUpdate(
            @Query("id") String id,
            @Query("softCode") String softCode,
            @Query("softVersion") String softVersion,
            @Query("hardVersion") String hardVersion,
            @Query("volume") String volume,
            @Query("videoWhirl") String videoWhirl,
            @Query("wifiName") String wifiName,
            @Query("wifiPassword") String wifiPassword,
            @Query("ip") String ip,
            @Query("netInfo") String netInfo,
            @Query("longitude") String longitude,
            @Query("latitude") String latitude,
            @Query("address") String address,
            @Query("name") String name
    );


}
