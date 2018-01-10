package com.weimaipay.res;

import java.util.List;

/**
 * 查询订单支付状态
 */
public class ResponseOrderPaymet extends BaseResponse {

    /**
     * 微脉支付订单号
     */
    private String payOrderNo;
    /**
     * 订单名称
     */
    private String payOrderName;
    /**
     * 商户订单号
     */
    private String orderId;
    /**
     * 订单状态 {@link com.weimaipay.constant.EPayOrderStatus }
     */
    private String payOrderStatus;
    /**
     * 收款人
     */
    private String payeeId;
    /**
     * 收款人姓名
     */
    private String payeeName;
    /**
     * 收款金额 单位：分
     */
    private Long payAmount;
    /**
     * 订单明细
     */
    private List<ResOfPayOrderDetail> items;
    /**
     * 订单类型，参考枚举 {@link com.weimaipay.constant.EPayOrderType}
     */
    private String payOrderType;
    /**
     * 收款人外部编号
     */
    private String outPayeeId;
    /**
     * 订单备注
     */
    private String paySubmitRemark;
    /**
     * 支付时间
     */
    private String payTime;

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getPayOrderName() {
        return payOrderName;
    }

    public void setPayOrderName(String payOrderName) {
        this.payOrderName = payOrderName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayOrderStatus() {
        return payOrderStatus;
    }

    public void setPayOrderStatus(String payOrderStatus) {
        this.payOrderStatus = payOrderStatus;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public List<ResOfPayOrderDetail> getItems() {
        return items;
    }

    public void setItems(List<ResOfPayOrderDetail> items) {
        this.items = items;
    }

    public String getPayOrderType() {
        return payOrderType;
    }

    public void setPayOrderType(String payOrderType) {
        this.payOrderType = payOrderType;
    }

    public String getOutPayeeId() {
        return outPayeeId;
    }

    public void setOutPayeeId(String outPayeeId) {
        this.outPayeeId = outPayeeId;
    }

    public String getPaySubmitRemark() {
        return paySubmitRemark;
    }

    public void setPaySubmitRemark(String paySubmitRemark) {
        this.paySubmitRemark = paySubmitRemark;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

}
