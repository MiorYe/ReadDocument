package com.weimaipay.claims.entity;

import java.util.List;

/**
 * 2.6.	获取住院费用日清单
 */
public class PullHospDailySettleInfoResponse {

	/**
	 * 住院号 发生住院时产生的唯一号
	 */
	private String inHospitalNum;
	/**
	 * 患者id	varchar2(20)
	 */
	private String patientId;
	/**
	 * 姓名	varchar2(100)
	 */
	private String name;
	/**
	 * 住院科室编码	VARCHAR2(20)
	 */
	private String treatDeptCode;
	/**
	 * 住院科室名称	VARCHAR2(20)
	 */
	private String treatDeptName;
	/**
	 * 病区	VARCHAR2(20)
	 */
	private String endemicArea;
	/**
	 * 床位号	VARCHAR2(20)
	 */
	private String bunkId;
	/**
	 * 费用类别（患者性质）	varchar2(3)	见字典信息【患者性质】
	 */
	private String costCategory;
	/**
	 * 入院日期	VARCHAR2(8)	格式：YYYYMMDD
	 */
	private String treatBeginDate;
	/**
	 * 计费日期	VARCHAR2(8)	格式：YYYYMMDD
	 */
	private String settleDate;
	/**
	 * 当日费用小计	Decimal(16,2)	2位小数
	 */
	private String subtotal;
	/**
	 * 预交款	Decimal(16,2)	2位小数
	 */
	private String prepaidFunds;
	/**
	 * 总费用	Decimal(16,2)	2位小数
	 */
	private String totalAmount;
	/**
	 * 结余余额	Decimal(16,2)	2位小数
	 */
	private String balance;

	private List<DailySettleDetail> dailySettleDetailList;

	public List<DailySettleDetail> getDailySettleDetailList() {
		return dailySettleDetailList;
	}

	public void setDailySettleDetailList(List<DailySettleDetail> dailySettleDetailList) {
		this.dailySettleDetailList = dailySettleDetailList;
	}

	public String getInHospitalNum() {
		return inHospitalNum;
	}

	public void setInHospitalNum(String inHospitalNum) {
		this.inHospitalNum = inHospitalNum;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTreatDeptCode() {
		return treatDeptCode;
	}

	public void setTreatDeptCode(String treatDeptCode) {
		this.treatDeptCode = treatDeptCode;
	}

	public String getTreatDeptName() {
		return treatDeptName;
	}

	public void setTreatDeptName(String treatDeptName) {
		this.treatDeptName = treatDeptName;
	}

	public String getEndemicArea() {
		return endemicArea;
	}

	public void setEndemicArea(String endemicArea) {
		this.endemicArea = endemicArea;
	}

	public String getBunkId() {
		return bunkId;
	}

	public void setBunkId(String bunkId) {
		this.bunkId = bunkId;
	}

	public String getCostCategory() {
		return costCategory;
	}

	public void setCostCategory(String costCategory) {
		this.costCategory = costCategory;
	}

	public String getTreatBeginDate() {
		return treatBeginDate;
	}

	public void setTreatBeginDate(String treatBeginDate) {
		this.treatBeginDate = treatBeginDate;
	}

	public String getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	public String getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

	public String getPrepaidFunds() {
		return prepaidFunds;
	}

	public void setPrepaidFunds(String prepaidFunds) {
		this.prepaidFunds = prepaidFunds;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
}
