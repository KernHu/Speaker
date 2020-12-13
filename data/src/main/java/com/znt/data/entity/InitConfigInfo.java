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

    private String id;
    private String serverIp;
    private String systemTime;
    private TbTerminalRunstatus trs;
    private String customize;
    private String companyname;


    public InitConfigInfo(String id, String serverIp, String systemTime, TbTerminalRunstatus trs, String customize, String companyname) {
        this.id = id;
        this.serverIp = serverIp;
        this.systemTime = systemTime;
        this.trs = trs;
        this.customize = customize;
        this.companyname = companyname;
    }

    public InitConfigInfo() {
    }

    protected InitConfigInfo(Parcel in) {
        id = in.readString();
        serverIp = in.readString();
        systemTime = in.readString();
        trs = in.readParcelable(TbTerminalRunstatus.class.getClassLoader());
        customize = in.readString();
        companyname = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(serverIp);
        parcel.writeString(systemTime);
        parcel.writeParcelable(trs, i);
        parcel.writeString(customize);
        parcel.writeString(companyname);
    }
}
