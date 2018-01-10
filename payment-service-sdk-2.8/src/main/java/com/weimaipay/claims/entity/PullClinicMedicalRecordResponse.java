package com.weimaipay.claims.entity;

import java.util.List;

/**
 * 2.4.1.	门诊病历信息查询
 */
public class PullClinicMedicalRecordResponse {
	/**
	 * 门诊流水号	varchar2(50)	发生门诊时产生的唯一号	非空
	 */
	private String outpatientSno;
	/**
	 * 医院病历ID	varchar2(10)	医院HIS系统中电子病历ID，用以标识病历信息的唯一性	非空
	 */
	private String hospitalRecordId;
	/**
	 * 患者标识	varchar2(20)
	 */
	private String patient_id;
	/**
	 * 患者姓名	varchar2(20)
	 */
	private String patient;
	/**
	 * 主诉	varchar2(2000)		非空
	 */
	private String cheifComplaint;
	/**
	 * 现病史	varchar2(2000)		非空
	 */
	private String historyPresentIllness;
	/**
	 * 既往史	varchar2(2000)		非空
	 */
	private String pastDiseaseHistory;
	/**
	 * 个人史	varchar2(2000)		非空
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
	 * 疾病信息列表
	 */
	private List<Disease> diseaseList;
	/**
	 * 疾病代码	varchar2(20)	张	非空
	 */
	private String diseaseCode;
	/**
	 * 疾病名称	varchar2(300)		非空
	 */
	private String diseaseName;
	/**
	 * 手术信息列表
	 */
	private List<Operation> operationList;
	/**
	 * 手术编码	varchar2(20)		非空
	 */
	private String operationCode;
	/**
	 * 手术名称	varchar2(300)		非空
	 */
	private String operationName;

	/**
	 * 诊治经过	varchar2(2000)		非空
	 */
	private String diagnosisTreatment;
	/**
	 * 主治医生	varchar2(50)		非空
	 */
	private String attendingPhysician;
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

	public String getOutpatientSno() {
		return outpatientSno;
	}

	public void setOutpatientSno(String outpatientSno) {
		this.outpatientSno = outpatientSno;
	}

	public String getHospitalRecordId() {
		return hospitalRecordId;
	}

	public void setHospitalRecordId(String hospitalRecordId) {
		this.hospitalRecordId = hospitalRecordId;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
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
}
