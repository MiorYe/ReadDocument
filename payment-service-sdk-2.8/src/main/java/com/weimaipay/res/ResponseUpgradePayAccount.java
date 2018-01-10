package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/26.
 */
public class ResponseUpgradePayAccount extends BaseResponse {
    /**
     * 微脉客户编号
     */
    @JSONField(name="wmUserId")
    private String clientUserId;
    /**
     * 支付账户识别码
     */
    private String payId;

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
