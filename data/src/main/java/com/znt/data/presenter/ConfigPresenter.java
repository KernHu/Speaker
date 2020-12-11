package com.znt.data.presenter;

import android.annotation.SuppressLint;

import com.znt.data.RespBody;
import com.znt.data.api.DataApi;
import com.znt.data.body.InitRequestBody;
import com.znt.data.contact.ConfigContact;
import com.znt.retrofit.base.presenter.RaindropPresenter;
import com.znt.retrofit.common.ExceptionTags;
import com.znt.retrofit.exception.ExceptionHelper;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/11/20 8:45 PM
 * describe: This is...
 */

public class ConfigPresenter extends RaindropPresenter<ConfigContact.view> implements ConfigContact.presenter {


    public ConfigPresenter(ConfigContact.view view) {
        super(view);
    }

    @SuppressLint("CheckResult")
    @Override
    public void getTerminalInit() {

        InitRequestBody body = view.getInitRequestBody();

        DataApi
                .getInstance()
                .terminalInit(body.getId(), body.getSoftVersion(), body.getSoftVersion())
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        addDisposable(disposable);
                    }
                })
                .map(new Function<RespBody, RespBody>() {

                    @Override
                    public RespBody apply(RespBody resp) throws Exception {
                        return resp;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<RespBody>() {

                    @Override
                    public void accept(RespBody resp) throws Exception {
                        view.setTerminalInitSuccess(resp);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        view.setTerminalInitFailure(ExceptionTags.THROWABLE, throwable.toString());
                        ExceptionHelper.handleException(throwable);
                    }
                });

    }

    @Override
    public void getTerminalAddbox() {

    }

    @Override
    public void getTerminalRegister() {

    }

    @Override
    public void getTerminalLogin() {

    }

    @Override
    public void getTerminalStatus() {

    }

    @Override
    public void getTerminalLastVersion() {

    }

    @Override
    public void getTerminalWifi() {

    }

    @Override
    public void getTerminalUpdate() {

    }
}
