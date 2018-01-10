package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by feng on 2017/9/27.
 */
public class ResponseGetCoupon extends BaseResponse {
    /**
     * 客户业务工单号
     */
    @JSONField(name = "orderId")
    private String clientOrderId;
    /**
     * 领取人支付识别码
     */
    @JSONField(name = "userId")
    private String payId;
    /**
     * 领取时间 yyyyMMddHHmmss
     */
    private String getTime;
    /**
     * 用户领取方式
     */
    private String getType;
    /**
     * 领取数量
     */
    private Integer getCount;
    /**
     * 支付结果返回内容
     */
    private List<Coupon> coupons;

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }

    public String getGetType() {
        return getType;
    }

    public void setGetType(String getType) {
        this.getType = getType;
    }

    public Integer getGetCount() {
        return getCount;
    }

    public void setGetCount(Integer getCount) {
        this.getCount = getCount;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }
}
