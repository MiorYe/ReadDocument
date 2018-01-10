package com.weimaipay.claims.entity;

/**
 * 手术
 */
public class Operation {
	/**
	 * 手术编码
	 */
	private String operationCode;

	/**
	 * 手术名称
	 */
	private String operationName;

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
}
