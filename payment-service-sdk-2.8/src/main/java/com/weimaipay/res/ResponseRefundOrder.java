package com.weimaipay.res;

import java.util.List;

/**
 * 订单退款
 */
public class ResponseRefundOrder extends BaseResponse
{
    /**
     * 微脉退款单号
     */
    private String refundOrderNo;
    /**
     * 微脉支付订单号
     */
    private String payOrderNo;
    /**
     * 商户订单号
     */
    private String orderId;
    /**
     * 商户退款单号
     */
    private String refundId;
    /**
     * 退款金额
     */
    private Long refundOrderAmount;
    /**
     * 商户退款状态
     */
    private String refundOrderStatus;
    /**
     * 退款返回的资金明细类型
     */
    private List<ResOfRefundOrderDetail> refundResultItems;
    /**
     * 退款原因类别
     */
    private String refundOrderReasonType;
    /**
     * 退款提交备注
     */
    private String refundSubmitRemark;
    /**
     * 退款成功时间yyyyMMddHHmmss
     */
    private String refundTime;
    /**
     * 原支付订单的业务类型
     */
    private String payOrderType;

    public String getPayOrderType() {
        return payOrderType;
    }

    public void setPayOrderType(String payOrderType) {
        this.payOrderType = payOrderType;
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }

    public String getRefundSubmitRemark() {
        return refundSubmitRemark;
    }

    public void setRefundSubmitRemark(String refundSubmitRemark) {
        this.refundSubmitRemark = refundSubmitRemark;
    }

    public String getRefundOrderReasonType() {
        return refundOrderReasonType;
    }

    public void setRefundOrderReasonType(String refundOrderReasonType) {
        this.refundOrderReasonType = refundOrderReasonType;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

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

    public Long getRefundOrderAmount() {
        return refundOrderAmount;
    }

    public void setRefundOrderAmount(Long refundOrderAmount) {
        this.refundOrderAmount = refundOrderAmount;
    }

    public String getRefundOrderStatus() {
        return refundOrderStatus;
    }

    public void setRefundOrderStatus(String refundOrderStatus) {
        this.refundOrderStatus = refundOrderStatus;
    }

    public List<ResOfRefundOrderDetail> getRefundResultItems() {
        return refundResultItems;
    }

    public void setRefundResultItems(List<ResOfRefundOrderDetail> refundResultItems) {
        this.refundResultItems = refundResultItems;
    }

}
