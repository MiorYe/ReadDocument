package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/27.
 * 领用代金券请求
 */
public class RequestGetCoupon {
    /**
     * 客户业务工单号 必填 同一单号不允许重复提交
     */
    @JSONField(name = "orderId")
    public String clientOrderId;
    /**
     * 微脉客户编号 必填项
     */
    @JSONField(name = "orgId")
    public String clientMerchantId;
    /**
     * 支付账户识别码
     */
    @JSONField(name = "userId")
    public String payId;
    /**
     * 代金券批次号
     */
    @JSONField(name = "batchNo")
    public String couponBatchNo;
    /**
     * 用户领取方式
     * 参看枚举：{@link com.weimaipay.constant.EGetCouponType}
     */
    private String getType;
    /**
     * 获取优惠券缘由
     */
    private String getReason;
    /**
     * 领取提交备注，返回时原样返回 供调用者使用
     */
    private String submitRemark;

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

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

    public String getCouponBatchNo() {
        return couponBatchNo;
    }

    public void setCouponBatchNo(String couponBatchNo) {
        this.couponBatchNo = couponBatchNo;
    }

    public String getGetType() {
        return getType;
    }

    public void setGetType(String getType) {
        this.getType = getType;
    }

    public String getGetReason() {
        return getReason;
    }

    public void setGetReason(String getReason) {
        this.getReason = getReason;
    }

    public String getSubmitRemark() {
        return submitRemark;
    }

    public void setSubmitRemark(String submitRemark) {
        this.submitRemark = submitRemark;
    }
}
