package com.znt.data.contact;

import com.znt.retrofit.mvp.SuperBasePresenter;
import com.znt.retrofit.mvp.SuperBaseView;
import com.znt.retrofit.proto.RespBody;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/7/20 7:08 PM
 * describe: This is...
 */

public class ConfigContact {

    public interface view extends SuperBaseView {


        int getCatId();

        String getChannel();

        int getPageIndex();

        int getPageSize();

        void setVideoInfo(RespBody data);

        void setVideoInfoError(String tag, String error);


    }

    public interface presenter extends SuperBasePresenter {

        void getVideoInfo();

        void getRelatedList();


    }
}
