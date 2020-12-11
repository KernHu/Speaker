package com.znt.data.request;

import com.google.gson.Gson;
import com.znt.data.RespBody;
import com.znt.data.body.AddboxRequestBody;
import com.znt.data.body.InitRequestBody;
import com.znt.data.body.LastVersionRequestBody;
import com.znt.data.body.LoginRequestBody;
import com.znt.data.body.RegisterRequestBody;
import com.znt.data.body.StatusRequestBody;
import com.znt.data.body.UpdateRequestBody;
import com.znt.data.body.WifiRequestBody;
import com.znt.data.contact.ConfigContact;
import com.znt.data.entity.InitConfigInfo;
import com.znt.data.presenter.ConfigPresenter;
import com.znt.retrofit.base.BaseRequest;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/11/20 8:17 PM
 * describe: This is...
 */

public class ConfigRequest extends BaseRequest<ConfigContact.presenter> implements ConfigContact.view {

    private static ConfigRequest mConfigRequest;

    private InitRequestBody initRequestBody;
    private AddboxRequestBody addboxRequestBody;
    private RegisterRequestBody registerRequestBody;
    private LoginRequestBody loginRequestBody;
    private StatusRequestBody statusRequestBody;
    private LastVersionRequestBody lastVersionRequestBody;
    private WifiRequestBody wifiRequestBody;
    private UpdateRequestBody updateRequestBody;

    public static ConfigRequest getInstance() {
        if (mConfigRequest == null) {
            mConfigRequest = new ConfigRequest();
        }
        return mConfigRequest;
    }

    public ConfigRequest setInitRequestBody(InitRequestBody initRequestBody) {
        this.initRequestBody = initRequestBody;
        return this;
    }

    public ConfigRequest setAddboxRequestBody(AddboxRequestBody addboxRequestBody) {
        this.addboxRequestBody = addboxRequestBody;
        return this;
    }

    public ConfigRequest setRegisterRequestBody(RegisterRequestBody registerRequestBody) {
        this.registerRequestBody = registerRequestBody;
        return this;
    }

    public ConfigRequest setLoginRequestBody(LoginRequestBody loginRequestBody) {
        this.loginRequestBody = loginRequestBody;
        return this;
    }

    public ConfigRequest setStatusRequestBody(StatusRequestBody statusRequestBody) {
        this.statusRequestBody = statusRequestBody;
        return this;
    }

    public ConfigRequest setLastVersionRequestBody(LastVersionRequestBody lastVersionRequestBody) {
        this.lastVersionRequestBody = lastVersionRequestBody;
        return this;
    }

    public ConfigRequest setWifiRequestBody(WifiRequestBody wifiRequestBody) {
        this.wifiRequestBody = wifiRequestBody;
        return this;
    }

    public ConfigRequest setUpdateRequestBody(UpdateRequestBody updateRequestBody) {
        this.updateRequestBody = updateRequestBody;
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
        return initRequestBody;
    }

    @Override
    public AddboxRequestBody getAddboxRequestBody() {
        return addboxRequestBody;
    }

    @Override
    public RegisterRequestBody getRegisterRequestBody() {
        return registerRequestBody;
    }

    @Override
    public LoginRequestBody getLoginRequestBody() {
        return loginRequestBody;
    }

    @Override
    public StatusRequestBody getStatusRequestBody() {
        return statusRequestBody;
    }

    @Override
    public LastVersionRequestBody getLastVersionRequestBody() {
        return lastVersionRequestBody;
    }

    @Override
    public WifiRequestBody getWifiRequestBody() {
        return wifiRequestBody;
    }

    @Override
    public UpdateRequestBody getUpdateRequestBody() {
        return updateRequestBody;
    }

    @Override
    public void setTerminalInitSuccess(RespBody data) {

        if (data.getResultcode() == "200") {
            InitConfigInfo info = new Gson().fromJson(data.getData(), InitConfigInfo.class);
        }

    }

    @Override
    public void setTerminalInitFailure(String tag, String error) {

    }

    @Override
    public void setTerminalAddboxSuccess(RespBody data) {

    }

    @Override
    public void setTerminalAddboxFailure(String tag, String error) {

    }

    @Override
    public void setTerminalRegisterSuccess(RespBody data) {

    }

    @Override
    public void setTerminalRegisterFailure(String tag, String error) {

    }

    @Override
    public void setTerminalLoginSuccess(RespBody data) {

    }

    @Override
    public void setTerminalLoginFailure(String tag, String error) {

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
