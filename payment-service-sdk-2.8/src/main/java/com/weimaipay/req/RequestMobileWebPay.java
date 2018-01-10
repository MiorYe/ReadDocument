package com.weimaipay.req;

import com.weimaipay.constant.EPayOrderStatus;
import com.weimaipay.constant.EPayOrderType;
import com.weimaipay.constant.EPaymentArrivalType;

/**
 * Created by feng on 2017/10/16.
 */
public class RequestMobileWebPay {
    /**
     * 支付通道ID 必填
     */
    private String appId;
    /**
     * 商户结算单号，如对账时需要用其他单号对账，则使用该字段
     */
    private String checkOrderId;
    /**
     * 机构编号，与微脉收款账号识别码二选一
     */
    private String clientMerchantId;
    /**
     * 外部商户订单号 必填
     */
    private String clientOrderId;
    /**
     * 订单展示地址（uri utf-8编码）
     */
    private String orderUrl;
    /**
     * 支付有效时间（分钟）最少设置5分钟
     */
    private Integer payDeadTime;
    /**
     * 微脉收款账号识别码，与机构编号二选一
     */
    private String payeeId;
    /**
     * 微脉支付账号识别码，如嵌套在微脉中则可不提供
     */
    private String payId;
    /**
     * 微脉支付账号识别码，如嵌套在微脉中则可不提供 参照枚举：{@link com.weimaipay.constant.EPaymentArrivalType}
     */
    private Integer paymentArrivalType;
    /**
     * 订单金额(分) 必填
     */
    private Long payOrderAmount;
    /**
     * 订单名称 必填
     */
    private String payOrderName;
    /**
     * 订单描述 必填
     */
    private String payOrderDescription;
    /**
     * 根据支付订单类型传入额外信息 格式json
     */
    private String payOrderExtra;
    /**
     * 订单类型 必填 参照枚举：{@link com.weimaipay.constant.EPayOrderType}
     */
    private String payOrderType;
    /**
     * 商户可存储相应个性化参数，异步返回时原样返回，商户可自定义相应内容(长度小于4000字符)
     */
    private String paySubmitRemark;
    /**
     * 支付成功后同步跳转到商户地址 或app可识别指令 必填
     */
    private String returnUrl;
    /**
     * 自动生成签名 无需设定不可修改
     */
    private String sign;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCheckOrderId() {
        return checkOrderId;
    }

    public void setCheckOrderId(String checkOrderId) {
        this.checkOrderId = checkOrderId;
    }

    public String getClientMerchantId() {
        return clientMerchantId;
    }

    public void setClientMerchantId(String clientMerchantId) {
        this.clientMerchantId = clientMerchantId;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public Integer getPayDeadTime() {
        return payDeadTime;
    }

    public void setPayDeadTime(Integer payDeadTime) {
        this.payDeadTime = payDeadTime;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public Integer getPaymentArrivalType() {
        return paymentArrivalType;
    }

    public void setPaymentArrivalType(Integer paymentArrivalType) {
        this.paymentArrivalType = paymentArrivalType;
    }

    public Long getPayOrderAmount() {
        return payOrderAmount;
    }

    public void setPayOrderAmount(Long payOrderAmount) {
        this.payOrderAmount = payOrderAmount;
    }

    public String getPayOrderName() {
        return payOrderName;
    }

    public void setPayOrderName(String payOrderName) {
        this.payOrderName = payOrderName;
    }

    public String getPayOrderDescription() {
        return payOrderDescription;
    }

    public void setPayOrderDescription(String payOrderDescription) {
        this.payOrderDescription = payOrderDescription;
    }

    public String getPayOrderExtra() {
        return payOrderExtra;
    }

    public void setPayOrderExtra(String payOrderExtra) {
        this.payOrderExtra = payOrderExtra;
    }

    public String getPayOrderType() {
        return payOrderType;
    }

    public void setPayOrderType(String payOrderType) {
        this.payOrderType = payOrderType;
    }

    public String getPaySubmitRemark() {
        return paySubmitRemark;
    }

    public void setPaySubmitRemark(String paySubmitRemark) {
        this.paySubmitRemark = paySubmitRemark;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
