package com.weimaipay.claims.entity;

/**
 * 2.2.2.	住院医嘱查询
 */
public class PullHospRecipeInfoRequest {
	/*
		住院号
		VARCHAR2(20)	发生住院时产生的唯一号	非空
	 */
	private String inHospitalNum;
	/**
	 * 院内授权码 存在授权流程的必填
	 */
	private String hospAuthNum;

	public String getInHospitalNum() {
		return inHospitalNum;
	}

	public void setInHospitalNum(String inHospitalNum) {
		this.inHospitalNum = inHospitalNum;
	}

	public String getHospAuthNum() {
		return hospAuthNum;
	}

	public void setHospAuthNum(String hospAuthNum) {
		this.hospAuthNum = hospAuthNum;
	}
}
