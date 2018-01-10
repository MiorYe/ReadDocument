package com.weimaipay.claims.entity;

/**
 * 获取检查检验信息
 */
public class PullCheckInfoRequest {

	/**
	 * 医疗类别	varchar2(3)	0 是门急诊；1 住院	非空
	 */
	private String medicalType;
	/**
	 * 就诊流水号	varchar2(50)	不能都为空；住院时可传住院号，门诊时可传入就诊卡号	非空
	 */
	private String medicalNum;
	/**
	 * 院内授权码 存在授权流程的必填
	 */
	private String hospAuthNum;

	public String getMedicalType() {
		return medicalType;
	}

	public void setMedicalType(String medicalType) {
		this.medicalType = medicalType;
	}

	public String getMedicalNum() {
		return medicalNum;
	}

	public void setMedicalNum(String medicalNum) {
		this.medicalNum = medicalNum;
	}

	public String getHospAuthNum() {
		return hospAuthNum;
	}

	public void setHospAuthNum(String hospAuthNum) {
		this.hospAuthNum = hospAuthNum;
	}
}
