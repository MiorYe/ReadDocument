package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/26.
 * 更新代金券活动请求
 */
public class RequestUpdateActivity {
    /**
     * 活动编号
     */
    private String activityNo;
    /**
     * 非必填 使用限定 使用时传入该限定值
     * 格式： code,code2,code3 如 00102,00103
     * 与优惠券使用限定值 共存时，以券信息为准
     */
    private String useCondition;
    /**
     * 活动名称 非必填
     */
    private String activityName;
    /**
     * 设置活动状态 参看枚举：{@link com.weimaipay.constant.EActivityStatus}
     */
    private Integer activityStatus;
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
     * 备注	非必填
     */
    private String remark;

    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
    }

    public String getUseCondition() {
        return useCondition;
    }

    public void setUseCondition(String useCondition) {
        this.useCondition = useCondition;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
