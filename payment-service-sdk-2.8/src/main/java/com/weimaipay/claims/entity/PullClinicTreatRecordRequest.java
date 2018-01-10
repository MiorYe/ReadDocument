package com.weimaipay.claims.entity;

/**
 * 门诊就诊记录查询
 *
 * @since 2.1.1
 */
public class PullClinicTreatRecordRequest {
	/**
	 * 介质类型	VARCHAR2(3)	0 身份证；1 医保卡；2就诊卡；3 军官证	非空
	 */
	private String credentialType;
	/**
	 * 介质号码	varchar2(22)	包含身份证号或社会保障号码或就诊卡号等；与证件类型匹配。	非空
	 */
	private String credentialNum;
	/**
	 * 姓名	varchar2(100)		非空
	 */
	private String name;
	/**
	 * 就诊开始日期	VARCHAR2(8)	格式：YYYYMMDD	非空
	 */
	private String treatBeginDate;
	/**
	 * 就诊结束日期	VARCHAR2(8)	格式：YYYYMMDD	非空
	 */
	private String treatEndDate;
	/**
	 * 院内授权码 可空
	 */
	private String hospAuthNum;

	public String getCredentialType() {
		return credentialType;
	}

	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
	}

	public String getCredentialNum() {
		return credentialNum;
	}

	public void setCredentialNum(String credentialNum) {
		this.credentialNum = credentialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTreatBeginDate() {
		return treatBeginDate;
	}

	public void setTreatBeginDate(String treatBeginDate) {
		this.treatBeginDate = treatBeginDate;
	}

	public String getTreatEndDate() {
		return treatEndDate;
	}

	public void setTreatEndDate(String treatEndDate) {
		this.treatEndDate = treatEndDate;
	}

	public String getHospAuthNum() {
		return hospAuthNum;
	}

	public void setHospAuthNum(String hospAuthNum) {
		this.hospAuthNum = hospAuthNum;
	}
}
