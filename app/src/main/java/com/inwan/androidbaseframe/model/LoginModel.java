package com.inwan.androidbaseframe.model;

/**
 * author : Administrator
 * date : 2019/4/29 0029 17:03
 * description :
 */
public class LoginModel {

    /**
     * access_token : 76c8196c145b51ea7886cf7136f267b2
     * key : 92y82v03a3626739
     * iv : 57682q0dw0g1d29m
     */

    private String access_token;
    private String key;
    private String iv;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }
}
