package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/26.
 * 创建代金券活动请求
 */
public class RequestCreateActivity {
    /**
     * 活动编号
     */
    @JSONField(name="outActivityNo")
    private String clientActivityNo;
    /**
     * 活动名称
     */
    @JSONField(name = "couponActivityName")
    private String activityName;
    /**
     * 活动开始时间 必填 格式：yyyyMMddHHmmss 20170410000000
     */
    private String startTime;
    /**
     * 活动结束时间 必填 格式：yyyyMMddHHmmss 20170417235959
     */
    private String endTime;
    /**
     * 用户限领次数 必填 >0
     */
    @JSONField(name="activityLimit")
    private Integer userGetLimit;
    /**
     * 预警订阅手机号	非必填 仅支持单个 空值时无法预警
     */
    @JSONField(name="warnPhone")
    private String warnReceivePhone;
    /**
     * 非必填 JSON格式{lowPercent: 10} 1~100
     */
    private String warnRule;
    /**
     * 最大发放总数 非必填
     */
    @JSONField(name="totalCount")
    private Integer maxCouponCount;
    /**
     * 非必填 使用限定 使用时传入该限定值
     * 格式： code,code2,code3 如 00102,00103
     * 与优惠券使用限定值 共存时，以券信息为准
     */
    private String useCondition;

    public String getClientActivityNo() {
        return clientActivityNo;
    }

    public void setClientActivityNo(String clientActivityNo) {
        this.clientActivityNo = clientActivityNo;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getUserGetLimit() {
        return userGetLimit;
    }

    public void setUserGetLimit(Integer userGetLimit) {
        this.userGetLimit = userGetLimit;
    }

    public String getWarnReceivePhone() {
        return warnReceivePhone;
    }

    public void setWarnReceivePhone(String warnReceivePhone) {
        this.warnReceivePhone = warnReceivePhone;
    }

    public String getWarnRule() {
        return warnRule;
    }

    public void setWarnRule(String warnRule) {
        this.warnRule = warnRule;
    }

    public Integer getMaxCouponCount() {
        return maxCouponCount;
    }

    public void setMaxCouponCount(Integer maxCouponCount) {
        this.maxCouponCount = maxCouponCount;
    }

    public String getUseCondition() {
        return useCondition;
    }

    public void setUseCondition(String useCondition) {
        this.useCondition = useCondition;
    }
}
