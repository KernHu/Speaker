package com.znt.speaker;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;

import com.znt.data.DataBindingService;

public class MainActivity extends BaseActivity {

    private boolean connection;
    private IDataBindingAidl mDataBindingAidl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        bindEvent();
        bindDate();
    }

    @Override
    protected void initView() {
        super.initView();
    }

    @Override
    protected void bindEvent() {
        super.bindEvent();

    }

    @Override
    protected void bindDate() {
        super.bindDate();
        //mDataBindingAidl.basicTypes();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(mServiceConnection);
    }

    @Override
    protected void onTicktack() {
        super.onTicktack();
        if (!connection) {
            startService();
        }
    }


    private void startService() {
        mIntent = new Intent(this, DataBindingService.class);
        bindService(mIntent, mServiceConnection, Context.BIND_AUTO_CREATE);
    }

    /**********************************************************************************************/
    /**********************************************************************************************/
    /**********************************************************************************************/
    ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            connection = true;
            mDataBindingAidl = IDataBindingAidl.Stub.asInterface(iBinder);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            connection = false;
        }
    };
    /**********************************************************************************************/
    /**********************************************************************************************/
    /**********************************************************************************************/

}