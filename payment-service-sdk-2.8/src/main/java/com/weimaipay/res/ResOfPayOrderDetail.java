package com.weimaipay.res;

/**
 * 订单明细
 */
public class ResOfPayOrderDetail {

    /**
     * 明细ID
     */
	private String payOrderDetailId;

    /**
     * 支付类型，参考枚举 {@link com.weimaipay.constant.EPayType}
     */
    private String payType;

    /**
     * 支付时间
     */
    private String payTime;

    /**
     * 支付状态，参看枚举：{@link com.weimaipay.constant.EPayStatus}
     */
    private String payStatus;

    /**
     * 支付金额
     */
    private Long payAmount;

    /**
     * 币种
     */
    private String currency;

    /**
     * 备注
     */
    private String remark;

    /**
     * /红包，脉豆类型的积分比例
     */
    private String scoreRatio;
    /**
     * /第三方支付金融请求单号
     */
    private String settleRequestNo="";
    /**
     * /第三方支付单号
     */
    private String settleNo="";

    public String getScoreRatio() {
        return scoreRatio;
    }

    public void setScoreRatio(String scoreRatio) {
        this.scoreRatio = scoreRatio;
    }

    public String getPayOrderDetailId() {
        return payOrderDetailId;
    }

    public void setPayOrderDetailId(String payOrderDetailId) {
        this.payOrderDetailId = payOrderDetailId;
    } 
     
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    } 

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    } 

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    } 

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    } 

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSettleRequestNo() {
        return settleRequestNo;
    }

    public void setSettleRequestNo(String settleRequestNo) {
        this.settleRequestNo = settleRequestNo == null ? null : settleRequestNo.trim();
    }
    public String getSettleNo() {
        return settleNo;
    }

    public void setSettleNo(String settleNo) {
        this.settleNo = settleNo == null ? null : settleNo.trim();
    }

}
