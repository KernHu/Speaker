package com.znt.data.body;

/**
 * author: Kern Hu
 * email: sky580@126.com
 * data_time: 12/11/20 8:57 PM
 * describe: This is...
 */

public class LoginRequestBody {


    String id;
    String softVersion;
    String hardVersion;

    public LoginRequestBody() {
    }

    public LoginRequestBody(String id, String softVersion, String hardVersion) {
        this.id = id;
        this.softVersion = softVersion;
        this.hardVersion = hardVersion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "InitRequestBody{" +
                "id='" + id + '\'' +
                ", softVersion='" + softVersion + '\'' +
                ", hardVersion='" + hardVersion + '\'' +
                '}';
    }
}
