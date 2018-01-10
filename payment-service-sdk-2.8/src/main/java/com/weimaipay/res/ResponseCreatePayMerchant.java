package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/26.
 * 创建商户返回
 */
public class ResponseCreatePayMerchant extends BaseResponse {
    /**
     * 商户编号/机构编号
     */
    @JSONField(name="wmUserId")
    public String clientMerchantId;
    /**
     * 支付账户识别码
     */
    public String payId;

    public String getClientMerchantId() {
        return clientMerchantId;
    }

    public void setClientMerchantId(String clientMerchantId) {
        this.clientMerchantId = clientMerchantId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }
}
