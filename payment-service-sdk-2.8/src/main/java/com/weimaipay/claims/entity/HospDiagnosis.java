package com.weimaipay.claims.entity;

/**
 * 住院诊断详细信息
 */
public class HospDiagnosis {
	private String diagnosisCode;
	/**
	 * 诊断名称	VARCHAR2(300)	医生下的原始临床诊断
	 */
	private String diagnosisName;
	/**
	 * 诊断级别	VARCHAR2(3)	见字典信息【诊断级别】
	 */
	private String diagnosisLevel;
	/**
	 * 治疗结果	VARCHAR2(200)	未治、好转、治愈、死亡
	 */
	private String diagnosisResult;
	/**
	 * 诊断类型	VARCHAR2(300)	反映入院、出院、门诊、病理诊断等
	 */
	private String diagnosisType;

	public String getDiagnosisCode() {
		return diagnosisCode;
	}

	public void setDiagnosisCode(String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}

	public String getDiagnosisName() {
		return diagnosisName;
	}

	public void setDiagnosisName(String diagnosisName) {
		this.diagnosisName = diagnosisName;
	}

	public String getDiagnosisLevel() {
		return diagnosisLevel;
	}

	public void setDiagnosisLevel(String diagnosisLevel) {
		this.diagnosisLevel = diagnosisLevel;
	}

	public String getDiagnosisResult() {
		return diagnosisResult;
	}

	public void setDiagnosisResult(String diagnosisResult) {
		this.diagnosisResult = diagnosisResult;
	}

	public String getDiagnosisType() {
		return diagnosisType;
	}

	public void setDiagnosisType(String diagnosisType) {
		this.diagnosisType = diagnosisType;
	}

}
