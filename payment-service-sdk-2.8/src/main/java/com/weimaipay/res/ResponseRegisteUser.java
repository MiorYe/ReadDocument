package com.weimaipay.res;

/**
 * Created by feng on 2017/8/22.
 */
public class ResponseRegisteUser extends BaseResponse {
    private String wmUserId;

    private String payId;

    public String getWmUserId() {
        return wmUserId;
    }

    public void setWmUserId(String wmUserId) {
        this.wmUserId = wmUserId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }
}
