package com.znt.data.api;

import com.znt.data.CmdConnector;
import com.znt.data.model.DataRetrofitService;
import com.znt.retrofit.retroft.SuperBaseApiImpl;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/7/20 7:14 PM
 * describe: This is...
 */

class DataApi extends SuperBaseApiImpl {

    private static DataApi api = new DataApi(CmdConnector.getCommonHost());

    public DataApi(String baseUrl) {
        super(baseUrl);
    }

    public static DataRetrofitService getInstance() {
        return api.getRetrofit().create(DataRetrofitService.class);
    }
}