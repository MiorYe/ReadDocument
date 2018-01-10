package com.weimaipay.claims.entity;

import java.util.List;

/**
 * 住院病历信息查询
 */
public class PullHospMedicalRecordResponse {
	/**
	 * 住院号
	 * VARCHAR2(20)	发生住院时产生的唯一号
	 */
	private String inHospitalNum;
	/**
	 * 医院病历ID	varchar2(10)	医院HIS系统中电子病历ID，用以标识病历信息的唯一性
	 */
	private String hospitalRecordId;
	/**
	 * 主诉	varchar2(2000)
	 */
	private String cheifComplaint;
	/**
	 * 现病史	varchar2(2000)
	 */
	private String historyPresentIllness;
	/**
	 * 既往史	varchar2(2000)
	 */
	private String pastDiseaseHistory;
	/**
	 * 个人史	varchar2(2000)
	 */
	private String personalHistory;
	/**
	 * 婚育史	varchar2(2000)
	 */
	private String obstetricalHistory;
	/**
	 * 月经史	varchar2(2000)
	 */
	private String menstruationHistory;
	/**
	 * 家族史	varchar2(2000)
	 */
	private String familyHistory;
	/**
	 * 住院次数 VARCHAR2(6)
	 */
	private String residentTimes;
	/**
	 * 疾病信息列表
	 */
	private List<Disease> diseaseList;
	/**
	 * 疾病代码	varchar2(20)
	 */
	private String diseaseCode;
	/**
	 * 疾病名称	varchar2(300)
	 */
	private String diseaseName;
	/**
	 * 手术信息列表
	 */
	private List<Operation> operationList;
	/**
	 * 手术编码	varchar2(20)
	 */
	private String operationCode;
	/**
	 * 手术名称	varchar2(300)
	 */
	private String operationName;

	/**
	 * 诊治经过	varchar2(2000)
	 */
	private String diagnosisTreatment;
	/**
	 * 主治医生	varchar2(50)
	 */
	private String attendingPhysician;
	/**
	 * 出院情况	varchar2(2000)
	 */
	private String dischargeStatus;
	/**
	 * 出院医嘱	varchar2(2000)
	 */
	private String dischargeOrder;
	/**
	 * 事件摘要	varchar2(2000)	是出院小结
	 */
	private String medicalAbstract;

	/**
	 * 出院科室名称	varchar2(20)		非空
	 */
	private String deptCode;

	/**
	 * 出院科室编码	VARCHAR2(20)		非空
	 */
	private String deptName;

	/**
	 * 出院日期	varchar2(14)	YYYYMMDDHH24MISS	非空
	 */
	private String dischDate;

	/**
	 * 出院原因	varchar2(3)	字典映射	非空
	 */
	private String dischCause;

	/**
	 * 出院疾病编码	varchar2(20)	非空
	 */
	private String dischDiagnosisCode;

	/**
	 * 出院疾病名称	varchar2(300)
	 */
	private String dischDiagnosisName;

	/**
	 * 出院医保诊断编码	varchar2(20)
	 */
	private String dischMedDiagnosisCode;

	/**
	 * 出院医保诊断名称	varchar2(300)
	 */
	private String dischMedDiagnosisName;
	/**
	 * 住院天数	varchar2(6)
	 */
	private String hospitalDay;

	/**
	 * 重监病房入住日期	varchar2(14)	YYYYMMDDHH24MIS，重症监护病房入住日期
	 */
	private String wardshipStartDate;

	/**
	 * 重监病房离开日期	varchar2(14)	YYYYMMDDHH24MIS，重症监护病房离开日期
	 */
	private String wardshipEndDate;

	/**
	 * 体格检查	varchar2(2000)
	 */
	private String physicalExamination;
	/**
	 * 专科情况	varchar2(2000)
	 */
	private String juniorCollege;
	/**
	 * 辅助检查	varchar2(2000)
	 */
	private String auxiliaryExamination;
	/**
	 * 临床路径	varchar2(2000)
	 */
	private String clinicalPath;
	/**
	 * 全量病历信息	varchar2(2000)
	 */
	private String totalRecordInfo;

	public String getInHospitalNum() {
		return inHospitalNum;
	}

	public void setInHospitalNum(String inHospitalNum) {
		this.inHospitalNum = inHospitalNum;
	}

	public String getHospitalRecordId() {
		return hospitalRecordId;
	}

	public void setHospitalRecordId(String hospitalRecordId) {
		this.hospitalRecordId = hospitalRecordId;
	}

	public String getCheifComplaint() {
		return cheifComplaint;
	}

	public void setCheifComplaint(String cheifComplaint) {
		this.cheifComplaint = cheifComplaint;
	}

	public String getHistoryPresentIllness() {
		return historyPresentIllness;
	}

	public void setHistoryPresentIllness(String historyPresentIllness) {
		this.historyPresentIllness = historyPresentIllness;
	}

	public String getPastDiseaseHistory() {
		return pastDiseaseHistory;
	}

	public void setPastDiseaseHistory(String pastDiseaseHistory) {
		this.pastDiseaseHistory = pastDiseaseHistory;
	}

	public String getPersonalHistory() {
		return personalHistory;
	}

	public void setPersonalHistory(String personalHistory) {
		this.personalHistory = personalHistory;
	}

	public String getObstetricalHistory() {
		return obstetricalHistory;
	}

	public void setObstetricalHistory(String obstetricalHistory) {
		this.obstetricalHistory = obstetricalHistory;
	}

	public String getMenstruationHistory() {
		return menstruationHistory;
	}

	public void setMenstruationHistory(String menstruationHistory) {
		this.menstruationHistory = menstruationHistory;
	}

	public String getFamilyHistory() {
		return familyHistory;
	}

	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}

	public String getResidentTimes() {
		return residentTimes;
	}

	public void setResidentTimes(String residentTimes) {
		this.residentTimes = residentTimes;
	}

	public List<Disease> getDiseaseList() {
		return diseaseList;
	}

	public void setDiseaseList(List<Disease> diseaseList) {
		this.diseaseList = diseaseList;
	}

	public String getDiseaseCode() {
		return diseaseCode;
	}

	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public List<Operation> getOperationList() {
		return operationList;
	}

	public void setOperationList(List<Operation> operationList) {
		this.operationList = operationList;
	}

	public String getOperationCode() {
		return operationCode;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getDiagnosisTreatment() {
		return diagnosisTreatment;
	}

	public void setDiagnosisTreatment(String diagnosisTreatment) {
		this.diagnosisTreatment = diagnosisTreatment;
	}

	public String getAttendingPhysician() {
		return attendingPhysician;
	}

	public void setAttendingPhysician(String attendingPhysician) {
		this.attendingPhysician = attendingPhysician;
	}

	public String getDischargeStatus() {
		return dischargeStatus;
	}

	public void setDischargeStatus(String dischargeStatus) {
		this.dischargeStatus = dischargeStatus;
	}

	public String getDischargeOrder() {
		return dischargeOrder;
	}

	public void setDischargeOrder(String dischargeOrder) {
		this.dischargeOrder = dischargeOrder;
	}

	public String getMedicalAbstract() {
		return medicalAbstract;
	}

	public void setMedicalAbstract(String medicalAbstract) {
		this.medicalAbstract = medicalAbstract;
	}

	public String getPhysicalExamination() {
		return physicalExamination;
	}

	public void setPhysicalExamination(String physicalExamination) {
		this.physicalExamination = physicalExamination;
	}

	public String getJuniorCollege() {
		return juniorCollege;
	}

	public void setJuniorCollege(String juniorCollege) {
		this.juniorCollege = juniorCollege;
	}

	public String getAuxiliaryExamination() {
		return auxiliaryExamination;
	}

	public void setAuxiliaryExamination(String auxiliaryExamination) {
		this.auxiliaryExamination = auxiliaryExamination;
	}

	public String getClinicalPath() {
		return clinicalPath;
	}

	public void setClinicalPath(String clinicalPath) {
		this.clinicalPath = clinicalPath;
	}

	public String getTotalRecordInfo() {
		return totalRecordInfo;
	}

	public void setTotalRecordInfo(String totalRecordInfo) {
		this.totalRecordInfo = totalRecordInfo;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDischDate() {
		return dischDate;
	}

	public void setDischDate(String dischDate) {
		this.dischDate = dischDate;
	}

	public String getDischCause() {
		return dischCause;
	}

	public void setDischCause(String dischCause) {
		this.dischCause = dischCause;
	}

	public String getDischDiagnosisCode() {
		return dischDiagnosisCode;
	}

	public void setDischDiagnosisCode(String dischDiagnosisCode) {
		this.dischDiagnosisCode = dischDiagnosisCode;
	}

	public String getDischDiagnosisName() {
		return dischDiagnosisName;
	}

	public void setDischDiagnosisName(String dischDiagnosisName) {
		this.dischDiagnosisName = dischDiagnosisName;
	}

	public String getDischMedDiagnosisCode() {
		return dischMedDiagnosisCode;
	}

	public void setDischMedDiagnosisCode(String dischMedDiagnosisCode) {
		this.dischMedDiagnosisCode = dischMedDiagnosisCode;
	}

	public String getDischMedDiagnosisName() {
		return dischMedDiagnosisName;
	}

	public void setDischMedDiagnosisName(String dischMedDiagnosisName) {
		this.dischMedDiagnosisName = dischMedDiagnosisName;
	}

	public String getHospitalDay() {
		return hospitalDay;
	}

	public void setHospitalDay(String hospitalDay) {
		this.hospitalDay = hospitalDay;
	}

	public String getWardshipStartDate() {
		return wardshipStartDate;
	}

	public void setWardshipStartDate(String wardshipStartDate) {
		this.wardshipStartDate = wardshipStartDate;
	}

	public String getWardshipEndDate() {
		return wardshipEndDate;
	}

	public void setWardshipEndDate(String wardshipEndDate) {
		this.wardshipEndDate = wardshipEndDate;
	}
}
