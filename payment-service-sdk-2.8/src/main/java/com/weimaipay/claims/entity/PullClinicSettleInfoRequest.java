package com.weimaipay.claims.entity;

/**
 * 门诊结算费用查询
 */
public class PullClinicSettleInfoRequest {
	/**
	 * 门诊流水号	varchar2(50)	发生门诊时产生的唯一号	非空
	 */
	private String outpatientSno;
	/**
	 * 院内授权码 存在授权流程的必填
	 */
	private String hospAuthNum;

	public String getOutpatientSno() {
		return outpatientSno;
	}

	public void setOutpatientSno(String outpatientSno) {
		this.outpatientSno = outpatientSno;
	}

	public String getHospAuthNum() {
		return hospAuthNum;
	}

	public void setHospAuthNum(String hospAuthNum) {
		this.hospAuthNum = hospAuthNum;
	}
}
