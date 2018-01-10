package com.weimaipay.claims.entity;

import java.util.List;

/**
 * 门诊就诊记录查询
 *
 * @since 2.1.1
 */
public class PullClinicTreatRecordResponse {
	/**
	 * 门诊流水号	varchar2(50)	发生门诊时产生的唯一号
	 */
	private String outpatientSno;
	/**
	 * 门诊号	varchar2(50)
	 */
	private String outpatientNo;
	/**
	 * 就诊开始日期	varchar2(14)	YYYYMMDDHH24MISS
	 */
	private String treatDate;

	/**
	 * 身份证号	VARCHAR2(20)
	 */
	private String idCard;
	/**
	 * 姓名	VARCHAR2(50)
	 */
	private String name;
	/**
	 * 性别	VARCHAR2(3)	字典映射
	 */
	private String gender;
	/**
	 * 出生日期 	VARCHAR2(10)	YYYYMMDD
	 */
	private String birthday;
	/**
	 * 民族 	VARCHAR2(3)	字典映射
	 */
	private String race;

	/**
	 * 见字典信息【挂号类型】；如 门诊；急诊；专家门诊等
	 */
	private String registerType;

	/**
	 * 就诊科室编码	VARCHAR2(20)
	 */
	private String treatDeptCode;
	/**
	 * 就诊科室名称	VARCHAR2(20)
	 */
	private String treatDeptName;
  /*  *//**
	 *	诊断编码	VARCHAR2(20)
	 *//*
	private String diagnosisCode;
    *//**
	 *	诊断名称	VARCHAR2(300)
	 *//*
    private String diagnosisName;*/
	/**
	 * 诊断医生编号	varchar2(20)
	 */
	private String doctorCode;
	/**
	 * 诊断医生姓名 	VARCHAR2(50)
	 */
	private String doctorName;
	/**
	 * 目前医疗费 	VARCHAR2 (16)	两位小数
	 */
	private String currMedicalCost;
	/**
	 * 患者性质,见字典信息【患者性质】
	 */
	private String costCategory;

	/**
	 * 患者类型	varchar2(3)	见字典信息【患者类型】
	 */
	private String outpatientType;

	/**
	 * 主要病情描述	varchar2(1000)
	 */
	private String conditionDescription;

	/**
	 * 家庭地址	VARCHAR2(100)
	 */
	private String homeAddress;
	/**
	 * 单位名称 	VARCHAR2(100)
	 */
	private String companyName;
	/**
	 * 患者现状	VARCHAR2(3)	见字典信息【患者现状】
	 */
	private String clientStatus;
	/**
	 * 社保编码	VARCHAR2(16)
	 */
	private String socialNumber;
	/**
	 * 是否参加社保	VARCHAR2(3)
	 */
	private String isInSocialSecurityFlg;
	/**
	 * 参加何种社保	VARCHAR2(40)
	 */
	private String socialSecurityNm;
	/**
	 * 联系人姓名	VARCHAR2(50)
	 */
	private String linkmanName;
	/**
	 * 联系人电话	VARCHAR2(30)
	 */
	private String linkmanMobile;
	/**
	 * 经办人	VARCHAR2(50)	操作员姓名
	 */
	private String updateBy;
	/**
	 * 备注 	VARCHAR2(200)	用于备注信息
	 */
	private String remark;

	private List<Diagnosis> diagnosisList;

	public String getRegisterType() {
		return registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	public String getOutpatientType() {
		return outpatientType;
	}

	public void setOutpatientType(String outpatientType) {
		this.outpatientType = outpatientType;
	}

	public List<Diagnosis> getDiagnosisList() {
		return diagnosisList;
	}

	public void setDiagnosisList(List<Diagnosis> diagnosisList) {
		this.diagnosisList = diagnosisList;
	}

	public String getCostCategory() {
		return costCategory;
	}

	public void setCostCategory(String costCategory) {
		this.costCategory = costCategory;
	}

	public String getOutpatientSno() {
		return outpatientSno;
	}

	public void setOutpatientSno(String outpatientSno) {
		this.outpatientSno = outpatientSno;
	}

	public String getOutpatientNo() {
		return outpatientNo;
	}

	public void setOutpatientNo(String outpatientNo) {
		this.outpatientNo = outpatientNo;
	}

	public String getTreatDate() {
		return treatDate;
	}

	public void setTreatDate(String treatDate) {
		this.treatDate = treatDate;
	}


	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
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

	public String getDoctorCode() {
		return doctorCode;
	}

	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getCurrMedicalCost() {
		return currMedicalCost;
	}

	public void setCurrMedicalCost(String currMedicalCost) {
		this.currMedicalCost = currMedicalCost;
	}

	public String getConditionDescription() {
		return conditionDescription;
	}

	public void setConditionDescription(String conditionDescription) {
		this.conditionDescription = conditionDescription;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getClientStatus() {
		return clientStatus;
	}

	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
	}

	public String getSocialNumber() {
		return socialNumber;
	}

	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}

	public String getIsInSocialSecurityFlg() {
		return isInSocialSecurityFlg;
	}

	public void setIsInSocialSecurityFlg(String isInSocialSecurityFlg) {
		this.isInSocialSecurityFlg = isInSocialSecurityFlg;
	}

	public String getSocialSecurityNm() {
		return socialSecurityNm;
	}

	public void setSocialSecurityNm(String socialSecurityNm) {
		this.socialSecurityNm = socialSecurityNm;
	}

	public String getLinkmanName() {
		return linkmanName;
	}

	public void setLinkmanName(String linkmanName) {
		this.linkmanName = linkmanName;
	}

	public String getLinkmanMobile() {
		return linkmanMobile;
	}

	public void setLinkmanMobile(String linkmanMobile) {
		this.linkmanMobile = linkmanMobile;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
