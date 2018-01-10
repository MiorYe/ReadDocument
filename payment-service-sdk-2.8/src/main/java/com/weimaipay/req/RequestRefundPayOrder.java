package com.weimaipay.req;

/**
 * 订单退款
 */
public class RequestRefundPayOrder {
	
	/**
	 * 微脉支付单号
	 */
	private String payOrderNo;

	/**
	 * 商户订单号
	 */
    private String orderId;
    
    /**
	 * 退款金额（如果退款金额小于原支付单的金额，则为部分退款）
	 */
    private Long refundAmount;

	/**
     * 退货退款业务单号
     */
    private String refundId;
	/**
	 * 退款原因类别
	 */
	private String refundOrderReasonType;
	/**
	 * 退款原因
	 */
    private String refundOrderReason;
	/**
	 * 退款详情
	 */
	private String refundOrderDesc;

	/**
	 * 支付订单提交ip地址
	 */
    private String refundOrderIp;

	/**
	 * 退款操作人
	 */
	private String refundOperId;
	/**
	 * 退款设备信息
	 */ 
	private String refundDeviceIp;
	/**
	 * 是否退还红包(0,不退，1退红包）
	 */
	private String isReturnScoreEnv;
	/**
	 * 是否退还脉豆(0,不退，1退脉豆）
	 */
	private String isReturnScoreBean;
	/**
	 * 退款提交备注
	 */
	private String refundSubmitRemark;
	/**
	 * 对账用的退款原单号
	 */
    private String checkRefundId;

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundOrderReasonType() {
		return refundOrderReasonType;
	}

	public void setRefundOrderReasonType(String refundOrderReasonType) {
		this.refundOrderReasonType = refundOrderReasonType;
	}

	public String getRefundOrderReason() {
		return refundOrderReason;
	}

	public void setRefundOrderReason(String refundOrderReason) {
		this.refundOrderReason = refundOrderReason;
	}

	public String getRefundOrderDesc() {
		return refundOrderDesc;
	}

	public void setRefundOrderDesc(String refundOrderDesc) {
		this.refundOrderDesc = refundOrderDesc;
	}

	public String getRefundOrderIp() {
		return refundOrderIp;
	}

	public void setRefundOrderIp(String refundOrderIp) {
		this.refundOrderIp = refundOrderIp;
	}

	public String getRefundOperId() {
		return refundOperId;
	}

	public void setRefundOperId(String refundOperId) {
		this.refundOperId = refundOperId;
	}

	public String getRefundDeviceIp() {
		return refundDeviceIp;
	}

	public void setRefundDeviceIp(String refundDeviceIp) {
		this.refundDeviceIp = refundDeviceIp;
	}

	public String getIsReturnScoreEnv() {
		return isReturnScoreEnv;
	}

	public void setIsReturnScoreEnv(String isReturnScoreEnv) {
		this.isReturnScoreEnv = isReturnScoreEnv;
	}

	public String getIsReturnScoreBean() {
		return isReturnScoreBean;
	}

	public void setIsReturnScoreBean(String isReturnScoreBean) {
		this.isReturnScoreBean = isReturnScoreBean;
	}

	public String getRefundSubmitRemark() {
		return refundSubmitRemark;
	}

	public void setRefundSubmitRemark(String refundSubmitRemark) {
		this.refundSubmitRemark = refundSubmitRemark;
	}

	public String getCheckRefundId() {
		return checkRefundId;
	}

	public void setCheckRefundId(String checkRefundId) {
		this.checkRefundId = checkRefundId;
	}   
}
