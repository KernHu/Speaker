package com.znt.data;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.znt.data.app.AppBase;
import com.znt.data.body.InitRequestBody;
import com.znt.data.request.ConfigRequest;
import com.znt.utils.AppUtils;
import com.znt.utils.SystemUtils;

import androidx.annotation.Nullable;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/6/20 5:37 PM
 * describe: This is...
 */

public class DataBindingService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        ConfigRequest.getInstance().onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new DataBindingStub();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ConfigRequest.getInstance().onDestroy();
    }


    private class DataBindingStub extends DataBindingBinder.Stub {

        @Override
        public void getTerminalInit() throws RemoteException {

            InitRequestBody body = new InitRequestBody();
            body.setId(String.valueOf(AppBase.getApp().getId()));
            body.setHardVersion(SystemUtils.getSystemVersion());
            body.setSoftVersion(String.valueOf(AppUtils.getVersionCode(getBaseContext())));

            ConfigRequest
                    .getInstance()
                    .setType(ConfigRequest.Type.REQ_INIT)
                    .setInitRequestBody(body)
                    .build();
        }

        @Override
        public void getTerminalAddbox() throws RemoteException {

        }

        @Override
        public void getTerminalRegister() throws RemoteException {

        }

        @Override
        public void getTerminalLogin() throws RemoteException {

        }

        @Override
        public void getTerminalStatus() throws RemoteException {

        }

        @Override
        public void getTerminalLastVersion() throws RemoteException {

        }

        @Override
        public void getTerminalWifi() throws RemoteException {

        }

        @Override
        public void getTerminalUpdate() throws RemoteException {

        }
    }
}
