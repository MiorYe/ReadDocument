package com.weimaipay.res;

/**
 * Created by feng on 2017/9/26.
 */
public class ResponseToken extends BaseResponse {
    /**
     * token凭证
     */
    private String token;
    /**
     * 失效时间，时间戳格式
     */
    private String expiredTime;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }
}
