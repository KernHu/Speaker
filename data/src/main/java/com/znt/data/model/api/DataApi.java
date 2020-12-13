package com.znt.data.model.api;

import com.znt.data.CmdConnector;
import com.znt.data.model.DataRetrofitService;
import com.znt.retrofit.retroft.RaindropRetrofitFactory;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/7/20 7:14 PM
 * describe: This is...
 */

public class DataApi extends RaindropRetrofitFactory {

    private static DataApi api = new DataApi(CmdConnector.getBaseUrl());

    public DataApi(String baseUrl) {
        super(baseUrl);
    }

    public static DataRetrofitService getInstance() {
        return api.getRetrofit().create(DataRetrofitService.class);
    }
}