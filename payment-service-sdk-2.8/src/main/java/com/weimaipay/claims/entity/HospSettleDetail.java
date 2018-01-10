package com.weimaipay.claims.entity;

/**
 * 住院费用明细
 */
public class HospSettleDetail {
	/**
	 * 项目序号	varchar2(20)
	 */
	private String itemNo;
	/**
	 * 项目编码	varchar2(20)
	 */
	private String itemCode;
	/**
	 * 项目名称	varchar2(100)
	 */
	private String itemName;
	/**
	 * 医保项目名称	varchar2(100)
	 */
	private String insurItemName;
	/**
	 * 项目数量	varchar2(10)
	 */
	private String itemAmount;
	/**
	 * 项目单位	varchar2(20)
	 */
	private String itemUnit;
	/**
	 * 项目单价	varchar2(10)	2位小数
	 */
	private String itemPrice;
	/**
	 * 项目总金额	varchar2(10)	2位小数
	 */
	private String itemCost;
	/**
	 * 项目规格	varchar2(100)
	 */
	private String itemSpec;
	/**
	 * 项目类别	varchar2(3) 见字典信息【医保项目类别】
	 */
	private String itemClass;
	/**
	 * 执行科室	varchar2(20)
	 */
	private String executeDept;
	/**
	 * 医保类别	varchar2(3) 见字典信息【医保目录类别】
	 */
	private String insurClass;
	/**
	 * 自负比例	varchar2(10)
	 */
	private String myselfScale;
	/**
	 * 药品医保编码/耗材编码/处置编码	varchar2(20)
	 */
	private String insurItemNo;
	/**
	 * 自费金额	varchar2(10)	2位小数
	 */
	private String selfPay;
	/**
	 * 医院负担费用	varchar2(10)	2位小数
	 */
	private String hospitalCommitmentFee;
	/**
	 * 医疗保险金额	varchar2(10)	2位小数
	 */
	private String medicalInsuranceCostPay;
	/**
	 * 分类自负金额	varchar2(10)	2位小数
	 */
	private String classSelfPay;

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getInsurItemName() {
		return insurItemName;
	}

	public void setInsurItemName(String insurItemName) {
		this.insurItemName = insurItemName;
	}

	public String getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(String itemAmount) {
		this.itemAmount = itemAmount;
	}

	public String getItemUnit() {
		return itemUnit;
	}

	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemCost() {
		return itemCost;
	}

	public void setItemCost(String itemCost) {
		this.itemCost = itemCost;
	}

	public String getItemSpec() {
		return itemSpec;
	}

	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}

	public String getItemClass() {
		return itemClass;
	}

	public void setItemClass(String itemClass) {
		this.itemClass = itemClass;
	}

	public String getExecuteDept() {
		return executeDept;
	}

	public void setExecuteDept(String executeDept) {
		this.executeDept = executeDept;
	}

	public String getInsurClass() {
		return insurClass;
	}

	public void setInsurClass(String insurClass) {
		this.insurClass = insurClass;
	}

	public String getMyselfScale() {
		return myselfScale;
	}

	public void setMyselfScale(String myselfScale) {
		this.myselfScale = myselfScale;
	}

	public String getInsurItemNo() {
		return insurItemNo;
	}

	public void setInsurItemNo(String insurItemNo) {
		this.insurItemNo = insurItemNo;
	}

	public String getSelfPay() {
		return selfPay;
	}

	public void setSelfPay(String selfPay) {
		this.selfPay = selfPay;
	}

	public String getHospitalCommitmentFee() {
		return hospitalCommitmentFee;
	}

	public void setHospitalCommitmentFee(String hospitalCommitmentFee) {
		this.hospitalCommitmentFee = hospitalCommitmentFee;
	}

	public String getMedicalInsuranceCostPay() {
		return medicalInsuranceCostPay;
	}

	public void setMedicalInsuranceCostPay(String medicalInsuranceCostPay) {
		this.medicalInsuranceCostPay = medicalInsuranceCostPay;
	}

	public String getClassSelfPay() {
		return classSelfPay;
	}

	public void setClassSelfPay(String classSelfPay) {
		this.classSelfPay = classSelfPay;
	}
}
