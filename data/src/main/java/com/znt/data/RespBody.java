package com.znt.data;

import com.google.gson.JsonElement;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/8/20 8:19 PM
 * describe: This is...
 */

public class RespBody {

    public static final String CODE_SUCCESS = "1";
    public static final String CODE_FAILURE = "0";
    public static final String CODE_TOKEN_INVALID = "-10";

    String resultcode;

    String message;

    JsonElement data;


    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JsonElement getData() {
        return data;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }
}
