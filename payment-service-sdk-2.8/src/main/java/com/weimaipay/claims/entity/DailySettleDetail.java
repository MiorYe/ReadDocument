package com.weimaipay.claims.entity;

public class DailySettleDetail {
	/**
	 * 项目序号	varchar2(20)		非空
	 */
	private String itemNo;
	/**
	 * 项目编码	varchar2(20)	ICD-10编码	非空
	 */
	private String itemCode;
	/**
	 * 项目名称	varchar2(100)		非空
	 */
	private String itemName;
	/**
	 * 项目规格	varchar2(100)
	 */
	private String itemSpec;
	/**
	 * 项目单位	varchar2(20)		非空
	 */
	private String itemUnit;
	/**
	 * 项目数量	Decimal(16,2)		非空
	 */
	private String itemAmount;
	/**
	 * 项目单价（元）	Decimal(16,2)	2位小数	非空
	 */
	private String itemPrice;
	/**
	 * 项目金额（元）	Decimal(16,2)	2位小数	非空
	 */
	private String itemCost;
	/**
	 * 项目类别	varchar2(3)	见字典信息【医保项目类别】，中药、西药等 非空
	 */
	private String itemClass;
	/**
	 * 医保目录类别	varchar2(3)	见字典信息【医保目录类别】，如 甲  乙
	 */
	private String insurClass;
	/**
	 * 自理比例	Decimal(16,2)	如3.55	非空
	 */
	private String selfCareScale;

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

	public String getItemSpec() {
		return itemSpec;
	}

	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}

	public String getItemUnit() {
		return itemUnit;
	}

	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(String itemAmount) {
		this.itemAmount = itemAmount;
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

	public String getItemClass() {
		return itemClass;
	}

	public void setItemClass(String itemClass) {
		this.itemClass = itemClass;
	}

	public String getInsurClass() {
		return insurClass;
	}

	public void setInsurClass(String insurClass) {
		this.insurClass = insurClass;
	}

	public String getSelfCareScale() {
		return selfCareScale;
	}

	public void setSelfCareScale(String selfCareScale) {
		this.selfCareScale = selfCareScale;
	}
}
