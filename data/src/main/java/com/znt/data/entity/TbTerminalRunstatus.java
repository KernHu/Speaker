package com.znt.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/11/20 9:30 PM
 * describe: This is...
 */

public class TbTerminalRunstatus implements Parcelable {

    private String terminalId;

    private String volume;

    private String videoWhirl;
    private String shopname;

    private String expiredTime;

    private String lastMusicUpdate;

    private String planId;

    private String adplanId;

    private String adUpdateTime;
    private String playModel;

    private String playingSongId;

    private String playingSong;

    private String playingSongType;

    private String playingPos;

    private String playSeek;

    private String softUpdateFlag;

    private String expStatus;

    private String playCmd;

    private String wifiFlag;

    private String videoDisplayType;

    protected TbTerminalRunstatus(Parcel in) {
        terminalId = in.readString();
        volume = in.readString();
        videoWhirl = in.readString();
        shopname = in.readString();
        expiredTime = in.readString();
        lastMusicUpdate = in.readString();
        planId = in.readString();
        adplanId = in.readString();
        adUpdateTime = in.readString();
        playModel = in.readString();
        playingSongId = in.readString();
        playingSong = in.readString();
        playingSongType = in.readString();
        playingPos = in.readString();
        playSeek = in.readString();
        softUpdateFlag = in.readString();
        expStatus = in.readString();
        playCmd = in.readString();
        wifiFlag = in.readString();
        videoDisplayType = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(terminalId);
        dest.writeString(volume);
        dest.writeString(videoWhirl);
        dest.writeString(shopname);
        dest.writeString(expiredTime);
        dest.writeString(lastMusicUpdate);
        dest.writeString(planId);
        dest.writeString(adplanId);
        dest.writeString(adUpdateTime);
        dest.writeString(playModel);
        dest.writeString(playingSongId);
        dest.writeString(playingSong);
        dest.writeString(playingSongType);
        dest.writeString(playingPos);
        dest.writeString(playSeek);
        dest.writeString(softUpdateFlag);
        dest.writeString(expStatus);
        dest.writeString(playCmd);
        dest.writeString(wifiFlag);
        dest.writeString(videoDisplayType);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<TbTerminalRunstatus> CREATOR = new Creator<TbTerminalRunstatus>() {
        @Override
        public TbTerminalRunstatus createFromParcel(Parcel in) {
            return new TbTerminalRunstatus(in);
        }

        @Override
        public TbTerminalRunstatus[] newArray(int size) {
            return new TbTerminalRunstatus[size];
        }
    };

    public long getTerminalId() {
        if (TextUtils.isEmpty(terminalId) || "null".equalsIgnoreCase(terminalId))
            return 0L;
        return Long.parseLong(terminalId);
    }

    public void setTerminalId(long terminalId) {
        this.terminalId = String.valueOf(terminalId);
    }

    public int getVolume() {
        if (TextUtils.isEmpty(volume) || "null".equalsIgnoreCase(volume))
            return 0;
        return Integer.parseInt(volume);
    }

    public void setVolume(int volume) {
        this.volume = String.valueOf(volume);
    }

    public String getVideoWhirl() {
        return videoWhirl;
    }

    public void setVideoWhirl(String videoWhirl) {
        this.videoWhirl = videoWhirl;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public long getExpiredTime() {
        if (TextUtils.isEmpty(expiredTime) || "null".equalsIgnoreCase(expiredTime))
            return 0L;
        return Long.parseLong(expiredTime);
    }

    public void setExpiredTime(long expiredTime) {
        this.expiredTime = String.valueOf(expiredTime);
    }

    public long getLastMusicUpdate() {
        if (TextUtils.isEmpty(lastMusicUpdate) || "null".equalsIgnoreCase(lastMusicUpdate))
            return 0L;
        return Long.parseLong(lastMusicUpdate);
    }

    public void setLastMusicUpdate(long lastMusicUpdate) {
        this.lastMusicUpdate = String.valueOf(lastMusicUpdate);
    }

    public int getPlanId() {
        if (TextUtils.isEmpty(planId) || "null".equalsIgnoreCase(planId))
            return 0;
        return Integer.parseInt(planId);
    }

    public void setPlanId(int planId) {
        this.planId = String.valueOf(planId);
    }

    public int getAdplanId() {
        if (TextUtils.isEmpty(adplanId) || "null".equalsIgnoreCase(adplanId))
            return 0;
        return Integer.parseInt(adplanId);
    }

    public void setAdplanId(int adplanId) {
        this.adplanId = String.valueOf(adplanId);
    }

    public long getAdUpdateTime() {
        if (TextUtils.isEmpty(adUpdateTime) || "null".equalsIgnoreCase(adUpdateTime))
            return 0L;
        return Long.parseLong(adUpdateTime);
    }

    public void setAdUpdateTime(long adUpdateTime) {
        this.adUpdateTime = String.valueOf(adUpdateTime);
    }

    public String getPlayModel() {
        return playModel;
    }

    public void setPlayModel(String playModel) {
        this.playModel = playModel;
    }

    public int getPlayingSongId() {
        if (TextUtils.isEmpty(playingSongId) || "null".equalsIgnoreCase(playingSongId))
            return 0;
        return Integer.parseInt(playingSongId);
    }

    public void setPlayingSongId(int playingSongId) {
        this.playingSongId = String.valueOf(playingSongId);
    }

    public String getPlayingSong() {
        return playingSong;
    }

    public void setPlayingSong(String playingSong) {
        this.playingSong = playingSong;
    }

    public String getPlayingSongType() {
        return playingSongType;
    }

    public void setPlayingSongType(String playingSongType) {
        this.playingSongType = playingSongType;
    }

    public int getPlayingPos() {
        if (TextUtils.isEmpty(playingPos) || "null".equalsIgnoreCase(playingPos))
            return 0;
        return Integer.parseInt(playingPos);
    }

    public void setPlayingPos(int playingPos) {
        this.playingPos = String.valueOf(playingPos);
    }

    public int getPlaySeek() {
        if (TextUtils.isEmpty(playSeek) || "null".equalsIgnoreCase(playSeek))
            return 0;
        return Integer.parseInt(playSeek);
    }

    public void setPlaySeek(int playSeek) {
        this.playSeek = String.valueOf(playSeek);
    }

    public String getSoftUpdateFlag() {
        return softUpdateFlag;
    }

    public void setSoftUpdateFlag(String softUpdateFlag) {
        this.softUpdateFlag = softUpdateFlag;
    }

    public String getExpStatus() {
        return expStatus;
    }

    public void setExpStatus(String expStatus) {
        this.expStatus = expStatus;
    }

    public String getPlayCmd() {
        return playCmd;
    }

    public void setPlayCmd(String playCmd) {
        this.playCmd = playCmd;
    }

    public String getWifiFlag() {
        return wifiFlag;
    }

    public void setWifiFlag(String wifiFlag) {
        this.wifiFlag = wifiFlag;
    }

    public String getVideoDisplayType() {
        return videoDisplayType;
    }

    public void setVideoDisplayType(String videoDisplayType) {
        this.videoDisplayType = videoDisplayType;
    }

    @Override
    public String toString() {
        return "TbTerminalRunstatus{" +
                "terminalId='" + terminalId + '\'' +
                ", volume='" + volume + '\'' +
                ", videoWhirl='" + videoWhirl + '\'' +
                ", shopname='" + shopname + '\'' +
                ", expiredTime='" + expiredTime + '\'' +
                ", lastMusicUpdate='" + lastMusicUpdate + '\'' +
                ", planId='" + planId + '\'' +
                ", adplanId='" + adplanId + '\'' +
                ", adUpdateTime='" + adUpdateTime + '\'' +
                ", playModel='" + playModel + '\'' +
                ", playingSongId='" + playingSongId + '\'' +
                ", playingSong='" + playingSong + '\'' +
                ", playingSongType='" + playingSongType + '\'' +
                ", playingPos='" + playingPos + '\'' +
                ", playSeek='" + playSeek + '\'' +
                ", softUpdateFlag='" + softUpdateFlag + '\'' +
                ", expStatus='" + expStatus + '\'' +
                ", playCmd='" + playCmd + '\'' +
                ", wifiFlag='" + wifiFlag + '\'' +
                ", videoDisplayType='" + videoDisplayType + '\'' +
                '}';
    }
}
