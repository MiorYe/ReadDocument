package com.weimaipay.claims.entity;

/**
 * 获取院内授权码返回值
 */
public class HospAuthCodeResponse {
    /**
     * 	授权码申请编号
     */
    private String hospReqNum;
    /**
     * 微脉申请编号
     */
    private String reqNum;
    /**
     * 申请状态
     */
    private String hospReqStatus;

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

    public String getHospReqStatus() {
        return hospReqStatus;
    }

    public void setHospReqStatus(String clientOrderId) {
        this.hospReqStatus = hospReqStatus;
    }
}
