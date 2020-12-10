package com.znt.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/10/20 8:16 PM
 * describe: This is...
 */

public class InitConfigInfo implements Parcelable {

    private long id;
    private String serverIp;


    protected InitConfigInfo(Parcel in) {
        id = in.readLong();
        serverIp = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(serverIp);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<InitConfigInfo> CREATOR = new Creator<InitConfigInfo>() {
        @Override
        public InitConfigInfo createFromParcel(Parcel in) {
            return new InitConfigInfo(in);
        }

        @Override
        public InitConfigInfo[] newArray(int size) {
            return new InitConfigInfo[size];
        }
    };
}
