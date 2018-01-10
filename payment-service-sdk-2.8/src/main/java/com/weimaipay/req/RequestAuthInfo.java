package com.weimaipay.req;

/**
 * Created by feng on 2017/9/15.
 */
public class RequestAuthInfo {
    /**
     *院内授权申请编号
     */
    private String hospReqNum;
    /**
     *微脉申请编号
     */
    private String reqNum;
    /**
     *院内审核状态 0 不通过 1通过
     */
    private String hospVerifyStatus;
    /**
     *院内授权码
     */
    private String hospAuthNum;

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
}
