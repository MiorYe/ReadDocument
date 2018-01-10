package com.weimaipay.res;

/**
 * 扫码支付下单
 */
public class ResponseGetQrCodeInfo extends BaseResponse {

	/**
	 * 扫码支付URL，需要将此URL转换成二维码展示，然后扫码完成支付
	 */
	private String qrCodeInfo;

	/**
	 * 支付订单编号
	 */
	private String payOrderNo;

	/**
	 * 支付订单名称
	 */
	private String payOrderName;

	/**
	 * 业务工单
	 */
	private String orderId;

	/**
	 * 收款方外部系统用户编号
	 */
	private String outPayeeId;

	/**
	 * 收款方支付系统用户编号
	 */
	private String payeeId;

	/**
	 * 商户名称
	 */
	private String payeeName;

	/**
	 * 支付总金额
	 */
	private Long payOrderAmount;

	public String getOutPayeeId() {
		return outPayeeId;
	}

	public void setOutPayeeId(String outPayeeId) {
		this.outPayeeId = outPayeeId;
	}

	public String getPayOrderName() {
		return payOrderName;
	}

	public void setPayOrderName(String payOrderName) {
		this.payOrderName = payOrderName;
	}

	public String getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public Long getPayOrderAmount() {
		return payOrderAmount;
	}

	public void setPayOrderAmount(Long payOrderAmount) {
		this.payOrderAmount = payOrderAmount;
	}

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
		this.orderId = orderId == null ? null : orderId.trim();}

	public String getQrCodeInfo() {
		return qrCodeInfo;
	}

	public void setQrCodeInfo(String qrCodeInfo) {
		this.qrCodeInfo = qrCodeInfo;
	}

}
