package com.weimaipay.claims.entity;

/**
 * 2.6.	获取住院费用日清单
 */
public class PullHospDailySettleInfoRequest {
	/**
	 * 住院号
	 */
	private String inHospitalNum;

	/**
	 * 发生住院时产生的唯一号	非空 格式：YYYYMMDD
	 */
	private String settleDate;
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


	public String getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	public String getHospAuthNum() {
		return hospAuthNum;
	}

	public void setHospAuthNum(String hospAuthNum) {
		this.hospAuthNum = hospAuthNum;
	}
}
