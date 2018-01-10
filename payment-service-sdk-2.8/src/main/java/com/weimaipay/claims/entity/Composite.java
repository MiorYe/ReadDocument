package com.weimaipay.claims.entity;

/**
 * 结算信息中医保已支付费用列表
 */
public class Composite {
	/**
	 * 自理金额
	 */
	private String selfCareAmount;

	/**
	 * 自费金额
	 */
	private String selfAmount;

	/**
	 * 个人自付
	 */
	private String perBearMoney;

	/**
	 * 符合医保费用
	 */
	private String inInsureMoney;

	/**
	 * 医保基金
	 */
	private String medicareFundCost;

	/**
	 * 医保起付线
	 */
	private String medicarePayLine;

	/**
	 * 医院负担
	 */
	private String hosBearMoney;

	/**
	 * 转诊先自付
	 */
	private String priorBurdenMoney;

	/**
	 * 统筹分段自付
	 */
	private String sectionCoordinatePayMoney;

	/**
	 * 超封顶线自付
	 */
	private String overCappingPayMoney;

	/**
	 * 统筹基金支付
	 */
	private String fundMoney;

	/**
	 * 公务员基金支付
	 */
	private String civilServantFundMoney;

	/**
	 * 大病基金支付
	 */
	private String seriousFundMoney;

	/**
	 * 账户支付
	 */
	private String accountFundMoney;

	/**
	 * 民政救助支付
	 */
	private String civilSubsidy;

	/**
	 * 其他基金支付
	 */
	private String otherFundMoney;

	/**
	 * 本次现金支付
	 */
	private String cashMoney;

	public String getSelfCareAmount() {
		return selfCareAmount;
	}

	public void setSelfCareAmount(String selfCareAmount) {
		this.selfCareAmount = selfCareAmount;
	}

	public String getSelfAmount() {
		return selfAmount;
	}

	public void setSelfAmount(String selfAmount) {
		this.selfAmount = selfAmount;
	}

	public String getPerBearMoney() {
		return perBearMoney;
	}

	public void setPerBearMoney(String perBearMoney) {
		this.perBearMoney = perBearMoney;
	}

	public String getInInsureMoney() {
		return inInsureMoney;
	}

	public void setInInsureMoney(String inInsureMoney) {
		this.inInsureMoney = inInsureMoney;
	}

	public String getMedicareFundCost() {
		return medicareFundCost;
	}

	public void setMedicareFundCost(String medicareFundCost) {
		this.medicareFundCost = medicareFundCost;
	}

	public String getMedicarePayLine() {
		return medicarePayLine;
	}

	public void setMedicarePayLine(String medicarePayLine) {
		this.medicarePayLine = medicarePayLine;
	}

	public String getHosBearMoney() {
		return hosBearMoney;
	}

	public void setHosBearMoney(String hosBearMoney) {
		this.hosBearMoney = hosBearMoney;
	}

	public String getPriorBurdenMoney() {
		return priorBurdenMoney;
	}

	public void setPriorBurdenMoney(String priorBurdenMoney) {
		this.priorBurdenMoney = priorBurdenMoney;
	}

	public String getSectionCoordinatePayMoney() {
		return sectionCoordinatePayMoney;
	}

	public void setSectionCoordinatePayMoney(String sectionCoordinatePayMoney) {
		this.sectionCoordinatePayMoney = sectionCoordinatePayMoney;
	}

	public String getOverCappingPayMoney() {
		return overCappingPayMoney;
	}

	public void setOverCappingPayMoney(String overCappingPayMoney) {
		this.overCappingPayMoney = overCappingPayMoney;
	}

	public String getFundMoney() {
		return fundMoney;
	}

	public void setFundMoney(String fundMoney) {
		this.fundMoney = fundMoney;
	}

	public String getCivilServantFundMoney() {
		return civilServantFundMoney;
	}

	public void setCivilServantFundMoney(String civilServantFundMoney) {
		this.civilServantFundMoney = civilServantFundMoney;
	}

	public String getSeriousFundMoney() {
		return seriousFundMoney;
	}

	public void setSeriousFundMoney(String seriousFundMoney) {
		this.seriousFundMoney = seriousFundMoney;
	}

	public String getAccountFundMoney() {
		return accountFundMoney;
	}

	public void setAccountFundMoney(String accountFundMoney) {
		this.accountFundMoney = accountFundMoney;
	}

	public String getCivilSubsidy() {
		return civilSubsidy;
	}

	public void setCivilSubsidy(String civilSubsidy) {
		this.civilSubsidy = civilSubsidy;
	}

	public String getOtherFundMoney() {
		return otherFundMoney;
	}

	public void setOtherFundMoney(String otherFundMoney) {
		this.otherFundMoney = otherFundMoney;
	}

	public String getCashMoney() {
		return cashMoney;
	}

	public void setCashMoney(String cashMoney) {
		this.cashMoney = cashMoney;
	}

}
