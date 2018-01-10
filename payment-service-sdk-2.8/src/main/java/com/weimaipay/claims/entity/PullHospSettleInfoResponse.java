package com.weimaipay.claims.entity;

import java.util.List;

/**
 * 住院结算费用查询
 */
public class PullHospSettleInfoResponse {
	/**
	 * 住院号
	 * VARCHAR2(20)	发生住院时产生的唯一号	非空
	 */
	private String inHospitalNum;
	/**
	 * 单据号	varchar2(20)		非空
	 */
	private String billNum;
	/**
	 * 发票号	varchar2(20)	票据上的发票号码	非空
	 */
	private String invoiceNO;
	/**
	 * 交易类型	varchar2(3)	1:正交易(未做取消结算操作)
	 * -1：负交易（已做取消结算操作）	非空
	 */
	private String businessType;
	/**
	 * 医疗费总额	varchar2(16)	2位小数	非空
	 */
	private String medicalCost;
	/**
	 * 结算日期	varchar2(14)	YYYYMMDDHH24MISS	非空
	 */
	private String settleDate;

	/**
	 * 材料类型	varchar2(3)	材料类型(1：原件；2：复印件)，默认1
	 */
	private String billType;

	/**
	 * 业务流水号
	 */
	private String businessTransaction;

	/**
	 * 收费时间	varchar2(14)	YYYYMMDDHH24MISS
	 */
	private String chargeTime;

	/**
	 * 自理金额	varchar2(16)	2位小数
	 * 指乙类药品、诊疗项目、服务设施中个人按比例先行支付部分
	 */
	private String selfCareAmount;
	/**
	 * 自费金额	varchar2(16)	2位小数
	 * 指丙类药品、丙类诊疗项目、丙类服务设施和超限价部分
	 */
	private String selfAmount;
	/**
	 * 个人自付	varchar2(16)	位小数2
	 * 符合医保费用中由个人支付的部分，包含起付标准，不包含转诊先自付
	 */
	private String perBearMoney;
	/**
	 * 符合医保费用	varchar2(16)	2位小数指的是符合基本医疗保险费用，在药品、诊疗项目和服务设施的甲类和乙类费用中刨除自理的费用，即总费用–自理 – 自费
	 */
	private String inInsureMoney;
	/**
	 * 医保基金	varchar2(16)	2位小数所有医保基金支付总额
	 */
	private String medicareFundCost;
	/**
	 * 医保起付线	varchar2(16)	2位小数本次就医的起付金
	 */
	private String medicarePayLine;
	/**
	 * 医院负担	varchar2(16)	2位小数
	 * 各别地方医保政策中需要医院负担的金额
	 */
	private String hosBearMoney;
	/**
	 * 转诊先自付	varchar2(16)	2位小数
	 * 患者从外地转入就诊，根据当地医保政策转外就诊需自付金额
	 */
	private String priorBurdenMoney;
	/**
	 * 统筹分段自付	varchar2(16)	2位小数统筹分段计算的个人自付金额
	 */
	private String sectionCoordinatePayMoney;
	/**
	 * 超封顶线自付	varchar2(16)	2位小数
	 * 超过统筹封顶线自付金额
	 */
	private String overCappingPayMoney;
	/**
	 * 统筹基金支付	varchar2(16)	2位小数统筹基金支付，根据人员身份进行填写（基本医疗保险基金支付、城镇居
	 * 民医疗基金支付、新农合补偿金额）
	 */
	private String fundMoney;
	/**
	 * 公务员基金支付	varchar2(16)	2位小数
	 * 公务员补充医疗保险支付金额
	 */
	private String civilServantFundMoney;
	/**
	 * 大病基金支付	varchar2(16)	2位小数大病基金支付金额
	 */
	private String seriousFundMoney;
	/**
	 * 账户支付 	varchar2(14)	2位小数本次个人账户支付金额
	 */
	private String accountFundMoney;
	/**
	 * 民政救助支付	varchar2(16)	2位小数
	 * 民政救助金额
	 */
	private String civilSubsidy;
	/**
	 * 其他基金支付 	varchar2(16)	2位小数
	 * 除过上述基金支付外的基金支付金额
	 */
	private String otherFundMoney;
	/**
	 * 本次现金支付 	varchar2(16)	2位小数
	 * 个人现金支付金额
	 */
	private String cashMoney;
	/**
	 * 经办人	varchar2(50)	医疗机构操作员姓名
	 */
	private String updateBy;
	/**
	 * 货币误差
	 */
	private String monetaryError;

	/**
	 * 费用明细
	 */
	private List<HospSettleDetail> hospSettleDetailList;

	public String getInHospitalNum() {
		return inHospitalNum;
	}

	public void setInHospitalNum(String inHospitalNum) {
		this.inHospitalNum = inHospitalNum;
	}

	public String getBillNum() {
		return billNum;
	}

	public void setBillNum(String billNum) {
		this.billNum = billNum;
	}

	public String getInvoiceNO() {
		return invoiceNO;
	}

	public void setInvoiceNO(String invoiceNO) {
		this.invoiceNO = invoiceNO;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getMedicalCost() {
		return medicalCost;
	}

	public void setMedicalCost(String medicalCost) {
		this.medicalCost = medicalCost;
	}

	public String getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getBusinessTransaction() {
		return businessTransaction;
	}

	public void setBusinessTransaction(String businessTransaction) {
		this.businessTransaction = businessTransaction;
	}

	public String getChargeTime() {
		return chargeTime;
	}

	public void setChargeTime(String chargeTime) {
		this.chargeTime = chargeTime;
	}

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

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public List<HospSettleDetail> getHospSettleDetailList() {
		return hospSettleDetailList;
	}

	public void setHospSettleDetailList(List<HospSettleDetail> hospSettleDetailList) {
		this.hospSettleDetailList = hospSettleDetailList;
	}

	public String getMonetaryError() {
		return monetaryError;
	}

	public void setMonetaryError(String monetaryError) {
		this.monetaryError = monetaryError;
	}
}
