package com.weimaipay.res;

/**
 * 申请院内授权码回调
 */
public class ResponseAuthInfo extends BaseResponse {
    /**
     * 院内授权申请编号
     */
    private String hospReqNum;
    /**
     * 微脉申请编号
     */
    private String reqNum;
    /**
     * 院内审核状态 0 不通过 1 通过
     */
    private String hospVerifyStatus;
    /**
     * 院内授权码
     */
    private String hospAuthNum;
    /**
     * 医疗类别  0 是门急诊 1 住院
     */
    private String medicalType;
    /**
     * 身份证号
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
     * 保险公司代码
     */
    private String insurerCode;
    /**
     * 保险公司名称
     */
    private String insurerName;

    public String getHospReqNum() {
        return hospReqNum;
    }

    public void setHospReqNum(String hospReqNum) {
        this.hospReqNum = hospReqNum;
    }

    public String getReqNum() {
        return reqNum;
    }

    public void setReqNum(String reqNum) {
        this.reqNum = reqNum;
    }

    public String getHospVerifyStatus() {
        return hospVerifyStatus;
    }

    public void setHospVerifyStatus(String hospVerifyStatus) {
        this.hospVerifyStatus = hospVerifyStatus;
    }

    public String getHospAuthNum() {
        return hospAuthNum;
    }

    public void setHospAuthNum(String hospAuthNum) {
        this.hospAuthNum = hospAuthNum;
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
}
