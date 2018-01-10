package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/27.
 */
public class RequestUpdateActivityCoupon {
    /**
     * 活动代金券编号	必填
     */
    @JSONField(name = "batchNo")
    private String activityCouponNo;
    /**
     * 券类型	必填 0有效/ -1作废
     */
    @JSONField(name = "batchStatus")
    private String activityCouponStatus;
    /**
     * 活动优惠券名称	必填
     */
    private String couponName;
    /**
     * 券描述	必填 4000字以内
     */
    private String couponDes;
    /**
     * 券参数	1定额券格式：固定名额 分，
     * 2折扣券 折扣7.5
     * 3 比例券 比例 1~100之间
     * 4随机面额券  金额|数量 多种面值逗号分隔  3000|5,200|100,10|7
     */
    private String couponPara;
    /**
     * 领取后多少天后生效 非必填 默认领取后立马生效
     */
    @JSONField(name = "operationDays")
    private Integer effectiveDaysAfterGet;
    /**
     * 生效后多少天过期	非必填 默认以活动结束
     */
    @JSONField(name = "expiredDays")
    private Integer expiredDaysAfterGet;
    /**
     * 券数量	必填 (随机面额券 需保证等于券参数中数量累加值)
     */
    private Integer couponCount;
    /**
     * 最低使用金额	必填 传0不限
     */
    @JSONField(name = "minAmount")
    private Integer minUseAmount;
    /**
     * 可用业务类型	必填 多个业务逗号间隔 ghzf,mzzf
     */
    @JSONField(name = "bizType")
    private String payOrderTypeList;
    /**
     * 使用限定代码	非必填 格式： code,code2,code3 00102,00103
     * 不传时以活动设定为准，有传值时 限定以本项为准
     */
    @JSONField(name = "useCondition")
    private String useConditionCode;
    /**
     * 备注	非必填
     */
    private String remark;

    public String getActivityCouponNo() {
        return activityCouponNo;
    }

    public void setActivityCouponNo(String activityCouponNo) {
        this.activityCouponNo = activityCouponNo;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getActivityCouponStatus() {
        return activityCouponStatus;
    }

    public void setActivityCouponStatus(String activityCouponStatus) {
        this.activityCouponStatus = activityCouponStatus;
    }

    public String getCouponDes() {
        return couponDes;
    }

    public void setCouponDes(String couponDes) {
        this.couponDes = couponDes;
    }

    public String getCouponPara() {
        return couponPara;
    }

    public void setCouponPara(String couponPara) {
        this.couponPara = couponPara;
    }

    public Integer getEffectiveDaysAfterGet() {
        return effectiveDaysAfterGet;
    }

    public void setEffectiveDaysAfterGet(Integer effectiveDaysAfterGet) {
        this.effectiveDaysAfterGet = effectiveDaysAfterGet;
    }

    public Integer getExpiredDaysAfterGet() {
        return expiredDaysAfterGet;
    }

    public void setExpiredDaysAfterGet(Integer expiredDaysAfterGet) {
        this.expiredDaysAfterGet = expiredDaysAfterGet;
    }

    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    public Integer getMinUseAmount() {
        return minUseAmount;
    }

    public void setMinUseAmount(Integer minUseAmount) {
        this.minUseAmount = minUseAmount;
    }

    public String getPayOrderTypeList() {
        return payOrderTypeList;
    }

    public void setPayOrderTypeList(String payOrderTypeList) {
        this.payOrderTypeList = payOrderTypeList;
    }

    public String getUseConditionCode() {
        return useConditionCode;
    }

    public void setUseConditionCode(String useConditionCode) {
        this.useConditionCode = useConditionCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
