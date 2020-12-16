package com.znt.data;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.znt.data.app.AppBase;
import com.znt.data.body.AddboxRequestBody;
import com.znt.data.body.InitRequestBody;
import com.znt.data.request.ConfigRequest;
import com.znt.utils.AppUtils;
import com.znt.utils.DeviceUtils;
import com.znt.utils.LocationUtils;
import com.znt.utils.SystemUtils;
import com.znt.utils.WifiConnectionManager;

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
                    .setRequestBody(body)
                    .build();

        }

        @Override
        public void getTerminalAddbox() throws RemoteException {

            AddboxRequestBody body = new AddboxRequestBody();
            body.setCode(DeviceUtils.getMacAddress(getBaseContext()));
            body.setSoftCode(String.valueOf(AppUtils.getVersionCode(getBaseContext())));
            body.setHardVersion(SystemUtils.getSystemVersion());
            body.setTerminalType(AddboxRequestBody.TYPE_BOX);
            body.setVolume("10");
            body.setVideoWhirl("0");
            body.setWifiName(WifiConnectionManager.getInstance(getBaseContext()).getSSID());
            body.setWifiPassword(WifiConnectionManager.getInstance(getBaseContext()).getPassword());
            body.setIp(WifiConnectionManager.getInstance(getBaseContext()).getLocalIp());
            body.setNetInfo("");
            double[] location = LocationUtils.getLastKnownLocation(getBaseContext());
            body.setLatitude(String.valueOf(location[0]));
            body.setLongitude(String.valueOf(location[1]));
            body.setAddress("SHE");
            body.setCountry("China");
            body.setProvince("ShenZhen");
            body.setRegion("123");
            body.setOldId(String.valueOf(AppBase.getApp().getId()));

            ConfigRequest
                    .getInstance()
                    .setType(ConfigRequest.Type.REQ_ADDBOX)
                    .setRequestBody(body)
                    .build();
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
