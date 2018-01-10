package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/27.
 * 代金券
 */
public class Coupon {
    /**
     * 代金券编号
     */
    private String couponNo;
    /**
     * 代金券批次号
     */
    @JSONField(name = "batchNo")
    private String couponBatchNo;
    /**
     * 机构编号
     */
    @JSONField(name = "orgId")
    private String clientMerchantId;
    /**
     * 代金券拥有者支付识别码
     */
    @JSONField(name = "userId")
    private String payId;
    /**
     * 代金券名称
     */
    @JSONField(name = "couponName")
    private String couponName;
    /**
     * 代金券值 分或者折扣
     */
    private String couponValue;
    /**
     * 代金券状态
     */
    private String couponStatus;
    /**
     * 代金券有效期开始时间
     */
    @JSONField(name = "startTime")
    private String validStartTime;
    /**
     * 代金券有效期开始时间
     */
    @JSONField(name = "endTime")
    private String validEndTime;
    /**
     * 代金券领取时间
     */
    private String getTime;
    /**
     * 可用于支付订单类型
     */
    @JSONField(name = "bizType")
    private String payOderType;
    /**
     * 可用支付方式
     */
    @JSONField(name = "payType")
    private String payMethod;
    /**
     * 是否可叠加使用 0不可叠加使用 1可叠加使用
     */
    private String isOverlay;
    /**
     * 代金券说明
     */
    private String submitRemark;

    public String getCouponNo() {
        return couponNo;
    }

    public void setCouponNo(String couponNo) {
        this.couponNo = couponNo;
    }

    public String getCouponBatchNo() {
        return couponBatchNo;
    }

    public void setCouponBatchNo(String couponBatchNo) {
        this.couponBatchNo = couponBatchNo;
    }

    public String getClientMerchantId() {
        return clientMerchantId;
    }

    public void setClientMerchantId(String clientMerchantId) {
        this.clientMerchantId = clientMerchantId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(String couponValue) {
        this.couponValue = couponValue;
    }

    public String getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(String couponStatus) {
        this.couponStatus = couponStatus;
    }

    public String getValidStartTime() {
        return validStartTime;
    }

    public void setValidStartTime(String validStartTime) {
        this.validStartTime = validStartTime;
    }

    public String getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(String validEndTime) {
        this.validEndTime = validEndTime;
    }

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }

    public String getPayOderType() {
        return payOderType;
    }

    public void setPayOderType(String payOderType) {
        this.payOderType = payOderType;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getIsOverlay() {
        return isOverlay;
    }

    public void setIsOverlay(String isOverlay) {
        this.isOverlay = isOverlay;
    }

    public String getSubmitRemark() {
        return submitRemark;
    }

    public void setSubmitRemark(String submitRemark) {
        this.submitRemark = submitRemark;
    }
}
