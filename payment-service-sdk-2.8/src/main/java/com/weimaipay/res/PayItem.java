package com.weimaipay.res;

/**
 * 支付明细
 */
public class PayItem {

    private String currency;
    private String payAmount;
    private String payJourId;
    private String payOrderDetailId;
    private String payStatus;
    private String payTime;
    private String payType;
    private String remark;
    private String scoreRatio;
    private String settleRequestNo="";
    private String settleNo="";

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayJourId() {
        return payJourId;
    }

    public void setPayJourId(String payJourId) {
        this.payJourId = payJourId;
    }

    public String getPayOrderDetailId() {
        return payOrderDetailId;
    }

    public void setPayOrderDetailId(String payOrderDetailId) {
        this.payOrderDetailId = payOrderDetailId;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getScoreRatio() {
        return scoreRatio;
    }

    public void setScoreRatio(String scoreRatio) {
        this.scoreRatio = scoreRatio;
    }

    public String getSettleRequestNo() {
        return settleRequestNo;
    }

    public void setSettleRequestNo(String settleRequestNo) {
        this.settleRequestNo = settleRequestNo;
    }

    public String getSettleNo() {
        return settleNo;
    }

    public void setSettleNo(String settleNo) {
        this.settleNo = settleNo;
    }
}
