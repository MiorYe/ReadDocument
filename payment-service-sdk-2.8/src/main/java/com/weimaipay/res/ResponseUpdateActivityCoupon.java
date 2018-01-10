package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/27.
 * 更新活动内的代金券
 */
public class ResponseUpdateActivityCoupon extends BaseResponse {
    /**
     * 活动代金券编号
     */
    @JSONField(name = "couponActivityNo")
    private String activityCouponNo;
    /**
     * 客户活动代金券编号
     */
    @JSONField(name = "outbatchNo")
    private String clientActivityCouponNo;
    /**
     * 活动编号
     */
    private String activityNo;
    /**
     * 客户活动编号
     */
    @JSONField(name = "outActivityNo")
    private String clientActivityNo;

    public String getActivityCouponNo() {
        return activityCouponNo;
    }

    public void setActivityCouponNo(String activityCouponNo) {
        this.activityCouponNo = activityCouponNo;
    }

    public String getClientActivityCouponNo() {
        return clientActivityCouponNo;
    }

    public void setClientActivityCouponNo(String clientActivityCouponNo) {
        this.clientActivityCouponNo = clientActivityCouponNo;
    }

    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
    }

    public String getClientActivityNo() {
        return clientActivityNo;
    }

    public void setClientActivityNo(String clientActivityNo) {
        this.clientActivityNo = clientActivityNo;
    }
}
