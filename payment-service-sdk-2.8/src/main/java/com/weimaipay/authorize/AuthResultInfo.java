package com.weimaipay.authorize;

/*
 * API结果信息
 */
public class AuthResultInfo {

	//encyrpt data
	private String content;
	//sign data
	private String sign;
	//randAESKey
	private String key;

	private String type;

	private String plainKey;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlainKey() {
		return plainKey;
	}

	public void setPlainKey(String plainKey) {
		this.plainKey = plainKey;
	}
}
