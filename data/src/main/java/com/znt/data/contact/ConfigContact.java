package com.znt.data.contact;

import com.znt.data.body.AddboxRequestBody;
import com.znt.data.body.InitRequestBody;
import com.znt.data.body.LastVersionRequestBody;
import com.znt.data.body.LoginRequestBody;
import com.znt.data.body.RegisterRequestBody;
import com.znt.data.RespBody;
import com.znt.data.body.StatusRequestBody;
import com.znt.data.body.UpdateRequestBody;
import com.znt.data.body.WifiRequestBody;
import com.znt.retrofit.base.presenter.IRaindropPresenter;
import com.znt.retrofit.base.view.RaindropView;


/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/7/20 7:08 PM
 * describe: This is...
 */

public class ConfigContact {

    public interface view extends RaindropView {


        InitRequestBody getInitRequestBody();

        AddboxRequestBody getAddboxRequestBody();

        RegisterRequestBody getRegisterRequestBody();

        LoginRequestBody getLoginRequestBody();

        StatusRequestBody getStatusRequestBody();

        LastVersionRequestBody getLastVersionRequestBody();

        WifiRequestBody getWifiRequestBody();

        UpdateRequestBody getUpdateRequestBody();


        void setTerminalInitSuccess(RespBody data);

        void setTerminalInitFailure(String tag, String error);

        void setTerminalAddboxSuccess(RespBody data);

        void setTerminalAddboxFailure(String tag, String error);

        void setTerminalRegisterSuccess(RespBody data);

        void setTerminalRegisterFailure(String tag, String error);

        void setTerminalLoginSuccess(RespBody data);

        void setTerminalLoginFailure(String tag, String error);

        void setTerminalStatusSuccess(RespBody data);

        void setTerminalStatusFailure(String tag, String error);

        void setTerminalLastVersionSuccess(RespBody data);

        void setTerminalLastVersionFailure(String tag, String error);

        void setTerminalWifiSuccess(RespBody data);

        void setTerminalWifiFailure(String tag, String error);

        void setTerminalUpdateSuccess(RespBody data);

        void setTerminalUpdateFailure(String tag, String error);


    }

    public interface presenter extends IRaindropPresenter {

        void getTerminalInit();

        void getTerminalAddbox();

        void getTerminalRegister();

        void getTerminalLogin();

        void getTerminalStatus();

        void getTerminalLastVersion();

        void getTerminalWifi();

        void getTerminalUpdate();

    }
}
