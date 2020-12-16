package com.znt.speaker;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

import com.znt.data.DataBindingBinder;
import com.znt.data.DataBindingService;
import com.znt.data.app.AppBase;
import com.znt.utils.EmptyUtils;

public class MainActivity extends BaseActivity {

    public static final int MAX_COUNT = 12;
    private boolean connection;
    private DataBindingBinder mDataBindingBinder;
    private int counter = 1;
    private boolean isInit;

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
        startService();
    }

    @Override
    protected void bindEvent() {
        super.bindEvent();

    }

    @Override
    protected void bindDate() {
        super.bindDate();
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
        connection = false;
    }

    /**********************************************************************************************/
    /**********************************************************************************************/
    /**********************************************************************************************/


    /**
     * 心跳 12s/count
     */
    @Override
    protected void onTicktack() {
        super.onTicktack();
        if (!connection) {
            startService();
        } else {
            if (counter % MAX_COUNT == 1) {
                counter = 0;
                counter++;
                loadData();
            }
        }
    }


    private void startService() {
        mIntent = new Intent(this, DataBindingService.class);
        bindService(mIntent, mServiceConnection, Context.BIND_AUTO_CREATE);
    }

    ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            connection = true;
            mDataBindingBinder = DataBindingBinder.Stub.asInterface(iBinder);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            connection = false;
        }
    };
    /**********************************************************************************************/
    /**********************************************************************************************/
    /**********************************************************************************************/

    private void loadData() {

        //无id时则请求id
        if (EmptyUtils.isEmpty(AppBase.getApp().getId())) {
            loadInit();
            loadAddBox();
            return;
        }


    }

    /**
     *  第一次初始化
     */
    private void loadInit() {
        if (isInit) {
            return;
        }
        isInit = true;
        try {
            if (mDataBindingBinder != null) {
                mDataBindingBinder.getTerminalInit();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     *  第一次添加盒子
     */
    private void loadAddBox() {
        try {
            if (mDataBindingBinder != null) {
                mDataBindingBinder.getTerminalAddbox();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}