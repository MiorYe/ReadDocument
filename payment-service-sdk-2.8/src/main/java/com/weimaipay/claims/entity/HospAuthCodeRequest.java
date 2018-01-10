package com.weimaipay.claims.entity;

/**
 * 获取院内授权码
 */
public class HospAuthCodeRequest {
    /**
     * 微脉申请编号
     */
    private  String reqNum;
    /**
     * 医疗类别
     */
    private String medicalType;
    /**
     * 身份证
     */
    private String IDCard;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 保险公司代码，类似机构编号
     */
    private String insurerCode;
    /**
     * 保险公司名称
     */
    private String insurerName;
    /**
     * 就诊开始日期 格式：yyyyMMdd
     */
    private String treatBeginDate;
    /**
     * 就诊结束日期 格式：yyyyMMdd
     */
    private String treatEndDate;
    /**
     * 额外信息，必须JSON格式的字符串
     */
    private String extra;

    public String getReqNum() {
        return reqNum;
    }

    public void setReqNum(String reqNum) {
        this.reqNum = reqNum;
    }

    public String getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(String medicalType) {
        this.medicalType = medicalType;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getInsurerCode() {
        return insurerCode;
    }

    public void setInsurerCode(String insurerCode) {
        this.insurerCode = insurerCode;
    }

    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    public String getTreatBeginDate() {
        return treatBeginDate;
    }

    public void setTreatBeginDate(String treatBeginDate) {
        this.treatBeginDate = treatBeginDate;
    }

    public String getTreatEndDate() {
        return treatEndDate;
    }

    public void setTreatEndDate(String treatEndDate) {
        this.treatEndDate = treatEndDate;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
