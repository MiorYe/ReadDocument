package com.weimaipay.bill;

import java.io.Serializable;

public class TradeDataInfo implements Serializable
{

	private static final long serialVersionUID = -7216853031557375920L;

	private String appName;//应用名

	private String mchBusinessNo;//商户业务单号

	private String appBusinessNo;//应用业务单号

	private String businessAmount;////业务金额(分)

	private String businessDirection;//业务方向

	private String businessTime;//业务时间(14位日期格式)

	private String businessRemark;//业务备注

	private String importStatus;//导入状态

	private String errorMsg;//错误原因

	private String fundName;//支付通道名称

	private String appTransactionNo;//应用支付单号

	private String fundTransactionNo;//支付通道单号

	private String transactionAmount;//通道实收金额(分)

	private String transactionDirection;//通道方向

	private String transactionTime;// 通道支付时间,

	private String transactionRemark;//支付备注

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getMchBusinessNo() {
		return mchBusinessNo;
	}

	public void setMchBusinessNo(String mchBusinessNo) {
		this.mchBusinessNo = mchBusinessNo;
	}

	public String getAppBusinessNo() {
		return appBusinessNo;
	}

	public void setAppBusinessNo(String appBusinessNo) {
		this.appBusinessNo = appBusinessNo;
	}

	public String getBusinessAmount() {
		return businessAmount;
	}

	public void setBusinessAmount(String businessAmount) {
		this.businessAmount = businessAmount;
	}

	public String getBusinessDirection() {
		return businessDirection;
	}

	public void setBusinessDirection(String businessDirection) {
		this.businessDirection = businessDirection;
	}

	public String getBusinessTime() {
		return businessTime;
	}

	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	public String getBusinessRemark() {
		return businessRemark;
	}

	public void setBusinessRemark(String businessRemark) {
		this.businessRemark = businessRemark;
	}

	public String getImportStatus() {
		return importStatus;
	}

	public void setImportStatus(String importStatus) {
		this.importStatus = importStatus;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getAppTransactionNo() {
		return appTransactionNo;
	}

	public void setAppTransactionNo(String appTransactionNo) {
		this.appTransactionNo = appTransactionNo;
	}

	public String getFundTransactionNo() {
		return fundTransactionNo;
	}

	public void setFundTransactionNo(String fundTransactionNo) {
		this.fundTransactionNo = fundTransactionNo;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionDirection() {
		return transactionDirection;
	}

	public void setTransactionDirection(String transactionDirection) {
		this.transactionDirection = transactionDirection;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getTransactionRemark() {
		return transactionRemark;
	}

	public void setTransactionRemark(String transactionRemark) {
		this.transactionRemark = transactionRemark;
	}
}
