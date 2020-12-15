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

    private String code;
    private String serverIp;
    private String systemTime;
    private String customize;
    private String companyname;
    private TbTerminalRunstatus trs;


    protected InitConfigInfo(Parcel in) {
        code = in.readString();
        serverIp = in.readString();
        systemTime = in.readString();
        customize = in.readString();
        companyname = in.readString();
        trs = in.readParcelable(TbTerminalRunstatus.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(code);
        dest.writeString(serverIp);
        dest.writeString(systemTime);
        dest.writeString(customize);
        dest.writeString(companyname);
        dest.writeParcelable(trs, flags);
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public String getCustomize() {
        return customize;
    }

    public void setCustomize(String customize) {
        this.customize = customize;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public TbTerminalRunstatus getTrs() {
        return trs;
    }

    public void setTrs(TbTerminalRunstatus trs) {
        this.trs = trs;
    }
}
