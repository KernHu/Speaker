package com.znt.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

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
    private String trs;
    private String customize;
    private String companyname;
    private TbTerminalRunstatus terminalRunstatus;


    protected InitConfigInfo(Parcel in) {
        id = in.readString();
        serverIp = in.readString();
        systemTime = in.readString();
        trs = in.readString();
        customize = in.readString();
        companyname = in.readString();
        terminalRunstatus = in.readParcelable(TbTerminalRunstatus.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(serverIp);
        dest.writeString(systemTime);
        dest.writeString(trs);
        dest.writeString(customize);
        dest.writeString(companyname);
        dest.writeParcelable(terminalRunstatus, flags);
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

    public Long getId() {
        if (TextUtils.isEmpty(id) || "null".equalsIgnoreCase(id))
            return 0L;
        return Long.parseLong(id);
    }

    public void setId(Long id) {
        this.id = String.valueOf(id);
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public Long getSystemTime() {
        if (TextUtils.isEmpty(systemTime) || "null".equalsIgnoreCase(systemTime))
            return 0L;
        return Long.parseLong(systemTime);
    }

    public void setSystemTime(Long systemTime) {
        this.systemTime = String.valueOf(systemTime);
    }

    public String getTrs() {
        return trs;
    }

    public void setTrs(String trs) {
        this.trs = trs;
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

    public TbTerminalRunstatus getTerminalRunstatus() {
        return terminalRunstatus;
    }

    public void setTerminalRunstatus(TbTerminalRunstatus terminalRunstatus) {
        this.terminalRunstatus = terminalRunstatus;
    }

    @Override
    public String toString() {
        return "InitConfigInfo{" +
                "id='" + id + '\'' +
                ", serverIp='" + serverIp + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", trs='" + trs + '\'' +
                ", customize='" + customize + '\'' +
                ", companyname='" + companyname + '\'' +
                ", terminalRunstatus=" + terminalRunstatus +
                '}';
    }
}
