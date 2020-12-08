package com.znt.retrofit.mvp.impl;


/*
 * 项目名:    BaseLib
 * 包名       com.zhon.baselib.mvpbase.baseImpl
 * 文件名:    BaseBean
 * 创建者:    ZJB
 * 创建时间:  2017/9/7 on 14:17
 * 描述:     TODO 请求结果基础bean；仅用于判断操作是否成功
 */
public class SuperBaseBean<T> {

    private String status;
    private String code;
    private String msg;
    private T body;

    public String getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getBody() {
        return body;
    }
}
