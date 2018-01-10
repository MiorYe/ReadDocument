package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;


public class RequestGetQrCodeInfo {

	/**
	 * 订单名称 非空
	 */
	private String payOrderName;

	/**
	 * 订单描述 非空
	 */
	private String payOrderDescription;

	/**
	 * 订单金额 单位：分 非空
	 */
	private Long payOrderAmount;

	/**
	 * 订单类型，参照枚举：{@link com.weimaipay.constant.EPayOrderType}
	 */
	private String payOrderType;
	/**
	 * 可空
	 */
	private String payOrderIp;
	/**
	 * 订单支付请求编号 非空
	 */
	private String orderId;
	/**
	 * 客户此订单的详细地址 无此信息，可空
	 */
	private String orderUrl;
	/**
	 * 币种 非空
	 */
	private String currency;
	/**
	 * 收款方金融账户 (与clientMerchantId二选一)
	 */
	private String payeeId;
	/**
	 * 收款方机构编号 (与payeeId二选一)
	 */
	@JSONField(name="outPayeeId")
	private String clientMerchantId;
	/**
	 * 付款方金融账户 非空
	 */
	private String payerId;
	/**
	 * 付款方终端IP地址 不能为空
	 */
	private String payerDeviceIp;
	/**
	 * 支付通知地址 目前暂不使用
	 */
	private String notifyUrl;
	/**
	 *  支付成功跳转页面 通知成功后跳转地址 使用web支付时使用
	 */
	private String returnUrl;
	/**
	 *  支付订单提交时预留备注 原样返回，可空 长度8000
	 */
	private String paySubmitRemark;
	/**
	 *   订单支付有效时间 超过有效期自动关闭 并自动退款 注意 最少5分钟
	 */
	private Integer payDeadTime;
	/**
	 *   根据支付订单类型传入额外信息 格式json 内容严格按照约定格式 长度4000
	 */
	private String extra;

	public Integer getPayDeadTime() {
		return payDeadTime;
	}

	public void setPayDeadTime(Integer payDeadTime) {
		this.payDeadTime = payDeadTime;
	}

	public String getPayOrderDescription() {
		return payOrderDescription;
	}

	public void setPayOrderDescription(String payOrderDescription) {
		this.payOrderDescription = payOrderDescription == null ? null
				: payOrderDescription.trim();
	}

	public String getPayOrderName() {
		return payOrderName;
	}

	public void setPayOrderName(String payOrderName) {
		this.payOrderName = payOrderName == null ? null : payOrderName.trim();
	}

	public Long getPayOrderAmount() {
		return payOrderAmount;
	}

	public void setPayOrderAmount(Long payOrderAmount) {
		this.payOrderAmount = payOrderAmount;
	}

	public String getPayOrderType() {
		return payOrderType;
	}

	public void setPayOrderType(String payOrderType) {
		this.payOrderType = payOrderType == null ? null : payOrderType.trim();
	}

	public String getPayOrderIp() {
		return payOrderIp;
	}

	public void setPayOrderIp(String payOrderIp) {
		this.payOrderIp = payOrderIp == null ? null : payOrderIp.trim();
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	public String getOrderUrl() {
		return orderUrl;
	}

	public void setOrderUrl(String orderUrl) {
		this.orderUrl = orderUrl == null ? null : orderUrl.trim();
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency == null ? null : currency.trim();
	}

	public String getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId ;
	}

	public String getPayerId() {
		return payerId;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	public String getPayerDeviceIp() {
		return payerDeviceIp;
	}

	public void setPayerDeviceIp(String payerDeviceIp) {
		this.payerDeviceIp = payerDeviceIp == null ? null : payerDeviceIp.trim();
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl == null ? null : returnUrl.trim();
	}

	public String getPaySubmitRemark() {
		return paySubmitRemark;
	}

	public void setPaySubmitRemark(String paySubmitRemark) {
		this.paySubmitRemark = paySubmitRemark == null ? null : paySubmitRemark.trim();
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getClientMerchantId() {
		return clientMerchantId;
	}

	public void setClientMerchantId(String clientMerchantId) {
		this.clientMerchantId = clientMerchantId;
	}
}
