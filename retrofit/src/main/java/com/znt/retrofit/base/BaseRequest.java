package com.znt.retrofit.base;

import com.znt.retrofit.base.presenter.IRaindropPresenter;
import com.znt.retrofit.base.view.RaindropView;

/**
 * @author: Kern Hu
 * @emali: create at: 2019/6/3 11:44.
 * modify at: 2019/6/3 11:44.
 * develop version name :
 * modify version name :
 * description: This's ...
 */
public abstract class BaseRequest<P extends IRaindropPresenter> implements RaindropView {

    protected P presenter;

    public void onCreate() {
        presenter = initPresenter();
    }

    public void onDestroy() {
        if (presenter != null) {
            presenter.detach();//在presenter中解绑释放view
            presenter = null;
        }
    }

    /**
     * 在子类中初始化对应的presenter
     *
     * @return 相应的presenter
     */
    public abstract P initPresenter();

}
