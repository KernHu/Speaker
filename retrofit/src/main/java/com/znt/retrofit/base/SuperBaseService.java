package com.znt.retrofit.base;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import com.znt.retrofit.base.presenter.IRaindropPresenter;
import com.znt.retrofit.base.view.RaindropView;

import io.reactivex.annotations.Nullable;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/8/20 8:58 PM
 * describe: This is...
 */

public abstract class SuperBaseService<P extends IRaindropPresenter> extends Service implements RaindropView {

    protected P presenter;
    public Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        presenter = initPresenter();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        if (presenter != null) {
            presenter.detach();//在presenter中解绑释放view
            presenter = null;
        }
        super.onDestroy();
    }

    /**
     * 在子类中初始化对应的presenter
     *
     * @return 相应的presenter
     */
    public abstract P initPresenter();
}