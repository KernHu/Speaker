package com.znt.data.contact;

import com.znt.data.body.RespBody;
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


        int getCatId();

        String getChannel();

        int getPageIndex();

        int getPageSize();

        void setVideoInfo(RespBody data);

        void setVideoInfoError(String tag, String error);


    }

    public interface presenter extends IRaindropPresenter {

        void getVideoInfo();

        void getRelatedList();


    }
}
