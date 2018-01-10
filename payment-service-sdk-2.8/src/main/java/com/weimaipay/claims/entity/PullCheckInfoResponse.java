package com.weimaipay.claims.entity;

import java.util.List;

/**
 * 获取检查检验信息
 */
public class PullCheckInfoResponse {
	/**
	 * 单据号	varchar2(20)	单据号并不是发票号，只是标识一个就诊流水号下一笔费用结算单据。
	 */
	private String billNum;
	/**
	 * 检查/检验单号	varchar2(50)	一次检验或者检查单的单号。	非空
	 */
	private String labNum;
	/**
	 * 检查/检验记录流水号	varchar2(50)	医院内部一次检查或检验的唯一标识。如果此流水号重复上传，平台将自动更新原始记录	非空
	 */
	private String recordNum;
	/**
	 * 业务分类	varchar2(3)	0-检查1-检验	非空
	 */
	private String serviceClassification;

	/**
	 * 检查/检验类别名称	varchar2(100)	检查和检验项目的大类名称描述
	 */
	private String categoryName;
	/**
	 * 检查/检验所见	varchar2(2000)
	 */
	private String findings;
	/**
	 * 检查/检验结论	varchar2(2000)
	 */
	private String inspectExamResult;
	/**
	 * 人员编号	varchar2(32)	从交易中返回标识参保人员的唯一编号
	 */
	private String userId;
	/**
	 * 病人姓名	varchar2(20)
	 */
	private String patName;
	/**
	 * 性别	varchar2(3)
	 */
	private String sex;
	/**
	 * patType	病人种类	varchar2(20)
	 */
	private String patType;
	/**
	 * 年龄	varchar2(3)
	 */
	private String patAge;
	/**
	 * 年龄单位	varchar2(20)
	 */
	private String ageUnit;
	/**
	 * 诊断	varchar2(30)
	 */
	private String diagnosis;
	/**
	 * 申请科室代码	varchar2(20)
	 */
	private String deptNum;
	/**
	 * 申请科室	varchar2(50)
	 */
	private String deptName;
	/**
	 * 申请医生工号	varchar2(20)
	 */
	private String applyDoctorCode;
	/**
	 * 申请医生	varchar2(50)
	 */
	private String applyDoctorName;
	/**
	 * 床号	 varchar2(20)	门诊时有；
	 */
	private String bunkId;
	/**
	 * 申请日期	varchar2(14)
	 */
	private String applyDate;
	/**
	 * 报告日期	varchar2(14)
	 */
	private String reportDate;
	/**
	 * 审核日期	varchar2(14)
	 */
	private String confirmDate;
	/**
	 * 报告医生工号	varchar2(20)
	 */
	private String reportDoctorCode;
	/**
	 * 报告医生	varchar2(50)
	 */
	private String reportDoctorName;
	/**
	 * 审核医生工号	varchar2(2000)
	 */
	private String confirmDoctorCode;
	/**
	 * 审核医生	varchar2(50)
	 */
	private String confirmDoctorName;
	/**
	 * 收费种类	varchar2(35)
	 */
	private String chargeType;
	/**
	 * 标本种类	varchar2(35)
	 */
	private String sampleType;
	/**
	 * 仪器名称	varchar2(30)
	 */
	private String instrna;
	/**
	 * 仪器类型	varchar2(20)
	 */
	private String instrKind;
	/**
	 * 仪器类型名称	varchar2(30)
	 */
	private String instrKindName;
	/**
	 * 插入标志	varchar2(1)
	 */
	private String insertFlag;
	/**
	 * 备注	varchar2(200)
	 */
	private String remark;
	/**
	 * 有效标志	varchar2(3)
	 */
	private String effectiveMark;

	private List<InspectionExamination> inspectionExaminationList;

	public String getBillNum() {
		return billNum;
	}

	public void setBillNum(String billNum) {
		this.billNum = billNum;
	}

	public String getLabNum() {
		return labNum;
	}

	public void setLabNum(String labNum) {
		this.labNum = labNum;
	}

	public String getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(String recordNum) {
		this.recordNum = recordNum;
	}

	public String getServiceClassification() {
		return serviceClassification;
	}

	public void setServiceClassification(String serviceClassification) {
		this.serviceClassification = serviceClassification;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getFindings() {
		return findings;
	}

	public void setFindings(String findings) {
		this.findings = findings;
	}

	public String getInspectExamResult() {
		return inspectExamResult;
	}

	public void setInspectExamResult(String inspectExamResult) {
		this.inspectExamResult = inspectExamResult;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPatType() {
		return patType;
	}

	public void setPatType(String patType) {
		this.patType = patType;
	}

	public String getPatAge() {
		return patAge;
	}

	public void setPatAge(String patAge) {
		this.patAge = patAge;
	}

	public String getAgeUnit() {
		return ageUnit;
	}

	public void setAgeUnit(String ageUnit) {
		this.ageUnit = ageUnit;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDeptNum() {
		return deptNum;
	}

	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getApplyDoctorCode() {
		return applyDoctorCode;
	}

	public void setApplyDoctorCode(String applyDoctorCode) {
		this.applyDoctorCode = applyDoctorCode;
	}

	public String getApplyDoctorName() {
		return applyDoctorName;
	}

	public void setApplyDoctorName(String applyDoctorName) {
		this.applyDoctorName = applyDoctorName;
	}

	public String getBunkId() {
		return bunkId;
	}

	public void setBunkId(String bunkId) {
		this.bunkId = bunkId;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getConfirmDate() {
		return confirmDate;
	}

	public void setConfirmDate(String confirmDate) {
		this.confirmDate = confirmDate;
	}

	public String getReportDoctorCode() {
		return reportDoctorCode;
	}

	public void setReportDoctorCode(String reportDoctorCode) {
		this.reportDoctorCode = reportDoctorCode;
	}

	public String getReportDoctorName() {
		return reportDoctorName;
	}

	public void setReportDoctorName(String reportDoctorName) {
		this.reportDoctorName = reportDoctorName;
	}

	public String getConfirmDoctorCode() {
		return confirmDoctorCode;
	}

	public void setConfirmDoctorCode(String confirmDoctorCode) {
		this.confirmDoctorCode = confirmDoctorCode;
	}

	public String getConfirmDoctorName() {
		return confirmDoctorName;
	}

	public void setConfirmDoctorName(String confirmDoctorName) {
		this.confirmDoctorName = confirmDoctorName;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getSampleType() {
		return sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}

	public String getInstrna() {
		return instrna;
	}

	public void setInstrna(String instrna) {
		this.instrna = instrna;
	}

	public String getInstrKind() {
		return instrKind;
	}

	public void setInstrKind(String instrKind) {
		this.instrKind = instrKind;
	}

	public String getInstrKindName() {
		return instrKindName;
	}

	public void setInstrKindName(String instrKindName) {
		this.instrKindName = instrKindName;
	}

	public String getInsertFlag() {
		return insertFlag;
	}

	public void setInsertFlag(String insertFlag) {
		this.insertFlag = insertFlag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEffectiveMark() {
		return effectiveMark;
	}

	public void setEffectiveMark(String effectiveMark) {
		this.effectiveMark = effectiveMark;
	}

	public List<InspectionExamination> getInspectionExaminationList() {
		return inspectionExaminationList;
	}

	public void setInspectionExaminationList(List<InspectionExamination> inspectionExaminationList) {
		this.inspectionExaminationList = inspectionExaminationList;
	}
}
