package com.weimaipay.req;

/**
 * 查询订单支付状态
 */
public class RequestOrderPaymet {

    /**
     * 微脉支付订单号
     */
    private String payOrderNo;

    /**
     * 商户订单号
     */
    private String orderId;

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

}
