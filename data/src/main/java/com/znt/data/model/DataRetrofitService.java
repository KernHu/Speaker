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

public interface DataRetrofitService extends ReportRetrofitService {

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

}
