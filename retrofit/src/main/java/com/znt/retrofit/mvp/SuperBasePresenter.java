package com.znt.retrofit.mvp;

import io.reactivex.disposables.Disposable;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 2018/9/25 上午10:29
 * describe: This is...
 */

public interface SuperBasePresenter {

    //默认初始化
    void start();

    //Activity关闭把view对象置为空
    void detach();

    //将网络请求的每一个disposable添加进入CompositeDisposable，再退出时候一并注销
    void addDisposable(Disposable subscription);

    //注销所有请求
    void unDisposable();

}
