package com.weimaipay.res;

/**
 * 退款单明细
 */
public class ResOfRefundOrderDetail {

	/**
	 * 退款明细ID
	 */
	private String refundOrderDetailId;
	/**
	 * 退款付款类型，参考枚举 {@link com.weimaipay.constant.EPayType}
	 */
	private String refundPayType;
	/**
	 * 退款时间
	 */
	private String refundTime;
	/**
	 * 退款状态，参考枚举 {@link com.weimaipay.constant.ERefundStatus}
	 */
	private String refundStatus;
	/**
	 * 退款金额
	 */
	private Long refundAmount;
	/**
	 * 币种
	 */
	private String currency;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 红包，脉豆类型的积分比例
	 */
	private Long scoreRatio;
	/**
	 * 三方支付金融请求单号
	 */
	private String settleRequestNo="";
	/**
	 * 三方交易单号
	 */
	private String settleNo="";

	public Long getScoreRatio() {
		return scoreRatio;
	}

	public void setScoreRatio(Long scoreRatio) {
		this.scoreRatio = scoreRatio;
	}

	public String getRefundOrderDetailId() {
		return refundOrderDetailId;
	}

	public void setRefundOrderDetailId(String refundOrderDetailId) {
		this.refundOrderDetailId = refundOrderDetailId == null ? null : refundOrderDetailId.trim();
	}

	public String getRefundPayType() {
		return refundPayType;
	}

	public void setRefundPayType(String refundPayType) {
		this.refundPayType = refundPayType == null ? null : refundPayType.trim();
	}

	public String getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus == null ? null : refundStatus.trim();
	}

	public Long getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
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
		this.settleRequestNo = settleRequestNo;
	}

	public String getSettleNo() {
		return settleNo;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
}
