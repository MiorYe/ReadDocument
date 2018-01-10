package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/25.
 */
public class RequestPersonalBase {
    /**
     * 微脉客户编号 必填
     */
    @JSONField(name="wmUserId")
    private String clientUserId="";
    /**
     * 支付账户识别码 必填
     */
    private String payId="";
    public String getClientUserId() {
        return clientUserId;
    }

    public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }
}
