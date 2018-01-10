package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class PayMessage {

	/**
	 * 支付订单编号
	 */
    public String payOrderNo;
	/**
	 * 微脉客户业务工单号
	 */
	@JSONField(name="orderId")
	private String clientOrderId;
	/**
	 * 机构编号
	 */
	@JSONField(name="outPayeeId")
	private String clientMerchantId;
	/**
	 * 收款商户金融账户
	 */
	private String payeeId;
	/**
	 * 订单类型不能为空,根据PayOrderType支持的类型
	 */
	private String payOrderType;
	/**
	 * 支付订单-支付状态，参考枚举：{@link com.weimaipay.constant.EPayOrderStatus}
	 */
	private String payOrderStatus;
	/**
	 * 备注
	 */
	private String paySubmitRemark;
	/**
	 * 支付时间
	 */
	private String payTime;

	private String returnUrl;

	private List<PayItem> payResultItems;

	public String getPayOrderNo() {
		return payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}
	public String getClientOrderId() {
		return clientOrderId;
	}
	public void setClientOrderId(String clientOrderId) {
		this.clientOrderId = clientOrderId;
	}
	public String getClientMerchantId() {
		return clientMerchantId;
	}
	public void setClientMerchantId(String clientMerchantId) {
		this.clientMerchantId = clientMerchantId;
	}
	public String getPayeeId() {
		return payeeId;
	}
	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}
	public String getPayOrderType() {
		return payOrderType;
	}
	public void setPayOrderType(String payOrderType) {
		this.payOrderType = payOrderType;
	}
	public String getPayOrderStatus() {
		return payOrderStatus;
	}
	public void setPayOrderStatus(String payOrderStatus) {
		this.payOrderStatus = payOrderStatus;
	}

	public String getPaySubmitRemark() {
		return paySubmitRemark;
	}

	public void setPaySubmitRemark(String paySubmitRemark) {
		this.paySubmitRemark = paySubmitRemark;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public List<PayItem> getPayResultItems() {
		return payResultItems;
	}

	public void setPayResultItems(List<PayItem> payResultItems) {
		this.payResultItems = payResultItems;
	}
}
