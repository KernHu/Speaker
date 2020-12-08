package com.znt.retrofit.mvp.impl;

import android.content.Context;
import android.os.Bundle;

import com.znt.retrofit.mvp.SuperBasePresenter;
import com.znt.retrofit.mvp.SuperBaseView;
import com.znt.retrofit.tools.ActivityManager;

import androidx.appcompat.app.AppCompatActivity;

/*
 * 项目名:    BaseLib
 * 包名       com.zhon.baselib.mvpbase.baseImpl
 * 文件名:    BaseActivity
 * 创建者:    ZJB
 * 创建时间:  2017/9/7 on 14:17
 * 描述:     TODO 基类Activity
 */
public abstract class SuperBaseActivity<P extends SuperBasePresenter> extends AppCompatActivity
        implements SuperBaseView {

    protected P presenter;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        ActivityManager.getAppInstance().addActivity(this);//将当前activity添加进入管理栈
        presenter = initPresenter();
    }

    @Override
    protected void onDestroy() {
        ActivityManager.getAppInstance().removeActivity(this);//将当前activity移除管理栈
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
