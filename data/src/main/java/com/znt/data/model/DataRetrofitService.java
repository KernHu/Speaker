package com.znt.data.model;


import com.znt.data.RespBody;
import com.znt.data.body.AddboxRequestBody;
import com.znt.data.body.InitRequestBody;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/7/20 6:45 PM
 * describe: This is...
 */

public interface DataRetrofitService {

    /**
     * 初始化
     *
     * @return
     */
    @POST("api/terminal/init")
    Observable<RespBody> terminalInit(
            @Body InitRequestBody body
    );

    /**
     * 盒子注册接口 AddboxRequestBody
     *
     * @return
     */
    @POST("api/terminal/addbox")
    Observable<RespBody> terminalAddbox(
            @Body AddboxRequestBody body
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
    /******************************************************************************************/
    /******************************************************************************************/
    /******************************************************************************************/

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


    /**
     * 获取完整计划接口
     *
     * @return
     */
    @POST("api/terminal/plan")
    Observable<RespBody> terminalPlan(
            @Query("planId") String planId
    );

    /**
     * 获取计划时段所有歌曲列表接口
     *
     * @return
     */
    @POST("api/terminal/planschemusic")
    Observable<RespBody> terminalPlansCheMusic(
            @Query("planId") String planId
    );


    /**
     * 获取插播列表
     *
     * @return
     */
    @POST("api/terminal/pushlist")
    Observable<RespBody> terminalPushList(
            @Query("id") String id

    );

    /**
     * 获取广告计划
     *
     * @return
     */
    @POST("api/terminal/adplan")
    Observable<RespBody> terminalAdPlan(
            @Query("adplanId") String adplanId
    );
    /******************************************************************************************/
    /******************************************************************************************/
    /******************************************************************************************/

    /**
     * 播放历史上报接口
     *
     * @return
     */
    @POST("api/terminal/play")
    Observable<RespBody> terminalPlay(
            @Query("dataId") String dataId,
            @Query("terminalId") String terminalId,
            @Query("playType") String playType,
            @Query("dataType") String dataType,
            @Query("playOnline") String playOnline

    );

    /**
     * 问题反馈接口
     *
     * @return
     */
    @POST("api/merch/advince")
    Observable<RespBody> terminalAdvince(
            @Query("shopId") String shopId

    );

}
