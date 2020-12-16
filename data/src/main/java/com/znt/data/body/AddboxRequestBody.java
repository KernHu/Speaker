package com.znt.data.body;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/11/20 8:57 PM
 * describe: This is...
 */

public class AddboxRequestBody {

    public static final String TYPE_BOX = "box";

    String code;
    String softCode;
    String softVersion;
    String hardVersion;
    String terminalType;
    String volume;
    String videoWhirl;
    String wifiName;
    String wifiPassword;
    String ip;
    String netInfo;
    String longitude;
    String latitude;
    String address;
    String country;
    String province;
    String city;
    String region;
    String oldId;


    public AddboxRequestBody() {
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSoftCode() {
        return softCode;
    }

    public void setSoftCode(String softCode) {
        this.softCode = softCode;
    }

    public String getSoftVersion() {
        return softVersion;
    }

    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion;
    }

    public String getHardVersion() {
        return hardVersion;
    }

    public void setHardVersion(String hardVersion) {
        this.hardVersion = hardVersion;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVideoWhirl() {
        return videoWhirl;
    }

    public void setVideoWhirl(String videoWhirl) {
        this.videoWhirl = videoWhirl;
    }

    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public String getWifiPassword() {
        return wifiPassword;
    }

    public void setWifiPassword(String wifiPassword) {
        this.wifiPassword = wifiPassword;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNetInfo() {
        return netInfo;
    }

    public void setNetInfo(String netInfo) {
        this.netInfo = netInfo;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getOldId() {
        return oldId;
    }

    public void setOldId(String oldId) {
        this.oldId = oldId;
    }

    @Override
    public String toString() {
        return "AddboxRequestBody{" +
                "code='" + code + '\'' +
                ", softCode='" + softCode + '\'' +
                ", softVersion='" + softVersion + '\'' +
                ", hardVersion='" + hardVersion + '\'' +
                ", terminalType='" + terminalType + '\'' +
                ", volume='" + volume + '\'' +
                ", videoWhirl='" + videoWhirl + '\'' +
                ", wifiName='" + wifiName + '\'' +
                ", wifiPassword='" + wifiPassword + '\'' +
                ", ip='" + ip + '\'' +
                ", netInfo='" + netInfo + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", oldId='" + oldId + '\'' +
                '}';
    }
}
