package com.znt.data.request;

import android.util.Log;

import com.google.gson.Gson;
import com.znt.data.RespBody;
import com.znt.data.body.AddboxRequestBody;
import com.znt.data.body.InitRequestBody;
import com.znt.data.body.LastVersionRequestBody;
import com.znt.data.body.StatusRequestBody;
import com.znt.data.body.UpdateRequestBody;
import com.znt.data.body.WifiRequestBody;
import com.znt.data.contact.ConfigContact;
import com.znt.data.entity.InitConfigInfo;
import com.znt.data.presenter.ConfigPresenter;
import com.znt.retrofit.base.BaseRequest;
import com.znt.retrofit.common.ExceptionTags;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/11/20 8:17 PM
 * describe: This is...
 */

public class ConfigRequest<T extends Object> extends BaseRequest<ConfigContact.presenter> implements ConfigContact.view {

    public enum Type {

        REQ_INIT,
        REQ_ADDBOX,
        REQ_STATUS,
        REQ_LAST_VERSION,
        REQ_WIFI,
        REQ_UPDATE,

    }

    private static ConfigRequest mConfigRequest;
    private T requestBody;
    private Type type;

    public static ConfigRequest getInstance() {
        if (mConfigRequest == null) {
            mConfigRequest = new ConfigRequest();
        }
        return mConfigRequest;
    }

    public ConfigRequest setRequestBody(T requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    public ConfigRequest setType(Type type) {
        this.type = type;
        return this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public ConfigContact.presenter initPresenter() {
        return new ConfigPresenter(this);
    }

    @Override
    public InitRequestBody getInitRequestBody() {
        return (InitRequestBody) requestBody;
    }

    @Override
    public AddboxRequestBody getAddboxRequestBody() {
        return (AddboxRequestBody) requestBody;
    }

    @Override
    public StatusRequestBody getStatusRequestBody() {
        return (StatusRequestBody) requestBody;
    }

    @Override
    public LastVersionRequestBody getLastVersionRequestBody() {
        return (LastVersionRequestBody) requestBody;
    }

    @Override
    public WifiRequestBody getWifiRequestBody() {
        return (WifiRequestBody) requestBody;
    }

    @Override
    public UpdateRequestBody getUpdateRequestBody() {
        return (UpdateRequestBody) requestBody;
    }

    public void build() {

        switch (type) {

            case REQ_INIT:

                if (presenter != null)
                    presenter.getTerminalInit();

                break;
            case REQ_ADDBOX:

                if (presenter != null)
                    presenter.getTerminalAddbox();

                break;
            case REQ_STATUS:

                if (presenter != null)
                    presenter.getTerminalStatus();

                break;
            case REQ_UPDATE:

                if (presenter != null)
                    presenter.getTerminalUpdate();

                break;
            case REQ_WIFI:

                if (presenter != null)
                    presenter.getTerminalWifi();

                break;
            case REQ_LAST_VERSION:

                if (presenter != null)
                    presenter.getTerminalLastVersion();

                break;
        }
    }

    /*******************************************************************/
    @Override
    public void setTerminalInitSuccess(RespBody data) {
        Log.e("sos", "InitConfigInfo>111>>" + data.toString());
        if (!RespBody.CODE_SUCCESS.equals(data.getResultcode())) {
            setTerminalInitFailure(ExceptionTags.API_ERROR, data.getMessage());
        } else {
            InitConfigInfo info = new Gson().fromJson(data.getData().toString(), InitConfigInfo.class);
            Log.e("sos", "InitConfigInfo>>>" + info.toString());
            //
        }
    }

    @Override
    public void setTerminalInitFailure(String tag, String error) {
        Log.e("sos", "setTerminalInitFailure>>>" + tag + ";;error>>>" + error);
    }

    @Override
    public void setTerminalAddboxSuccess(RespBody data) {

    }

    @Override
    public void setTerminalAddboxFailure(String tag, String error) {

    }

    @Override
    public void setTerminalStatusSuccess(RespBody data) {

    }

    @Override
    public void setTerminalStatusFailure(String tag, String error) {

    }

    @Override
    public void setTerminalLastVersionSuccess(RespBody data) {

    }

    @Override
    public void setTerminalLastVersionFailure(String tag, String error) {

    }

    @Override
    public void setTerminalWifiSuccess(RespBody data) {

    }

    @Override
    public void setTerminalWifiFailure(String tag, String error) {

    }

    @Override
    public void setTerminalUpdateSuccess(RespBody data) {

    }

    @Override
    public void setTerminalUpdateFailure(String tag, String error) {

    }
}
