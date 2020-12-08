package com.znt.data.model;

import com.znt.retrofit.proto.RespBody;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/7/20 6:45 PM
 * describe: This is...
 */

public interface ReportRetrofitService extends ConfigRetrofitService {

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
     * 获取插播列表
     *
     * @return
     */
    @POST("api/terminal/pushlist")
    Observable<RespBody> terminalPushList(
            @Query("id") String id

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
