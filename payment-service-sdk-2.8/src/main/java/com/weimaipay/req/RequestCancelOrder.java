package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 取消订单
 */
public class RequestCancelOrder {

    /**
     * 微脉支付订单号
     */
    private String payOrderNo;

    /**
     * 商家订单号
     */
    @JSONField(name="orderId")
    private String clientOrderId;

    /**
     * 取消操作人ID
     */
    private String cancelOperId;

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getCancelOperId() {
        return cancelOperId;
    }

    public void setCancelOperId(String cancelOperId) {
        this.cancelOperId = cancelOperId;
    }

}
