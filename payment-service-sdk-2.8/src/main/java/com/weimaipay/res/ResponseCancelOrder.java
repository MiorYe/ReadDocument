package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 取消订单
 */
public class ResponseCancelOrder extends BaseResponse
{

    /**
     * 支付订单号
     */
    private String payOrderNo;
    /**
     * 支付原业务单号
     */
    @JSONField(name="orderId")
    private String clientOrderId;
    /**
     * 支付当前状态，一般情况下为取消状态 {@link com.weimaipay.constant.EPayOrderStatus}
     */
    private String payOrderStatus;
    /**
     * 取消订单引起的后续动作
     */
    private String action;

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPayOrderStatus() {
        return payOrderStatus;
    }

    public void setPayOrderStatus(String payOrderStatus) {
        this.payOrderStatus = payOrderStatus;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }
}
