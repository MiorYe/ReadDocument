package com.weimaipay.claims.entity;

/**
 * 检查检验详细项目信息
 */
public class InspectionExamination {
	/**
	 * 项目代码	varchar2(20)		非空
	 */
	private String itemNum;
	/**
	 * 项目名称	varchar2(200)		非空
	 */
	private String itemName;
	/**
	 * 数值结果	varchar2(10)	小数点3位
	 */
	private String numVal;
	/**
	 * 字符结果	varchar2(1000)
	 */
	private String txtVal;
	/**
	 * 附加结果	varchar2(30)
	 */
	private String additionVal;
	/**
	 * 正常标志	varchar2(1)
	 */
	private String pnFlag;
	/**
	 * 参考值	varchar2(200)
	 */
	private String reference;
	/**
	 * 插入标志	varchar2(1)
	 */
	private String insertFlag;
	/**
	 * 使用方法1	varchar2(100)
	 */
	private String method1;
	/**
	 * 使用方法2	varchar2(100)
	 */
	private String method2;
	/**
	 * 血药浓度1	varchar2(100)
	 */
	private String plasmaConcentration1;
	/**
	 * 血药浓度2	varchar2(100)
	 */
	private String plasmaConcentration2;
	/**
	 * 药敏代码	varchar2(100)
	 */
	private String drugAllergyCode;
	/**
	 * 敏感度	varchar2(50)
	 */
	private String sensitivity;
	/**
	 * 抑菌直径	varchar2(100)
	 */
	private String bacteriostatDiameter;

	public String getItemNum() {
		return itemNum;
	}

	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getNumVal() {
		return numVal;
	}

	public void setNumVal(String numVal) {
		this.numVal = numVal;
	}

	public String getTxtVal() {
		return txtVal;
	}

	public void setTxtVal(String txtVal) {
		this.txtVal = txtVal;
	}

	public String getAdditionVal() {
		return additionVal;
	}

	public void setAdditionVal(String additionVal) {
		this.additionVal = additionVal;
	}

	public String getPnFlag() {
		return pnFlag;
	}

	public void setPnFlag(String pnFlag) {
		this.pnFlag = pnFlag;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getInsertFlag() {
		return insertFlag;
	}

	public void setInsertFlag(String insertFlag) {
		this.insertFlag = insertFlag;
	}

	public String getMethod1() {
		return method1;
	}

	public void setMethod1(String method1) {
		this.method1 = method1;
	}

	public String getMethod2() {
		return method2;
	}

	public void setMethod2(String method2) {
		this.method2 = method2;
	}

	public String getPlasmaConcentration1() {
		return plasmaConcentration1;
	}

	public void setPlasmaConcentration1(String plasmaConcentration1) {
		this.plasmaConcentration1 = plasmaConcentration1;
	}

	public String getPlasmaConcentration2() {
		return plasmaConcentration2;
	}

	public void setPlasmaConcentration2(String plasmaConcentration2) {
		this.plasmaConcentration2 = plasmaConcentration2;
	}

	public String getDrugAllergyCode() {
		return drugAllergyCode;
	}

	public void setDrugAllergyCode(String drugAllergyCode) {
		this.drugAllergyCode = drugAllergyCode;
	}

	public String getSensitivity() {
		return sensitivity;
	}

	public void setSensitivity(String sensitivity) {
		this.sensitivity = sensitivity;
	}

	public String getBacteriostatDiameter() {
		return bacteriostatDiameter;
	}

	public void setBacteriostatDiameter(String bacteriostatDiameter) {
		this.bacteriostatDiameter = bacteriostatDiameter;
	}
}
