package com.weimaipay.req;

/**
 * 退款查询
 */
public class RequestRefundOrderQuery {

	/**
	 * 退款单号
	 */
	private String refundOrderNo;
	 
	/**
	 * 退款原单号
	 */
    private String refundId;

	public String getRefundOrderNo() {
		return refundOrderNo;
	}

	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}  
    
    
}
