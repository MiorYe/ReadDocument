package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/**
 * Created by feng on 2017/11/6.
 */
public class ResponseCreatePayOrderAndPayment extends BaseResponse {
    /**
     * 支付订单编号
     */
    private String payOrderNo;
    /**
     * 支付订单外部编号
     */
    @JSONField(name = "orderId")
    private String clientOrderId;
    /**
     * 金融账户识别码
     */
    private String payeeId;
    /**
     * 收款方外部账户编号，比如机构编号
     */
    @JSONField(name = "outPayeeId")
    private String clientMerchantId;
    /**
     * 订单类型，参考枚举 {@link com.weimaipay.constant.EPayOrderType}
     */
    private String payOrderType;
    /**
     * 订单状态 {@link com.weimaipay.constant.EPayOrderStatus }
     */
    private String payOrderStatus;
    /**
     * 支付时间
     */
    private String payTime;
    /**
     * 支付订单提交时预留备注 原样返回
     */
    private String paySubmitRemark;
    /**
     * 如需客户端支付 返回第三方支付类型
     */
    private String clientThirdType;
    /**
     * 如需客户端支付  第三方支付所需的额外信息
     */
    private String clientThirdExtra;
    /**
     * 支付结果返回内容
     */
    private List<PayItem> payResultItems;

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getClientMerchantId() {
        return clientMerchantId;
    }

    public void setClientMerchantId(String clientMerchantId) {
        this.clientMerchantId = clientMerchantId;
    }

    public String getPayOrderType() {
        return payOrderType;
    }

    public void setPayOrderType(String payOrderType) {
        this.payOrderType = payOrderType;
    }

    public String getPayOrderStatus() {
        return payOrderStatus;
    }

    public void setPayOrderStatus(String payOrderStatus) {
        this.payOrderStatus = payOrderStatus;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getPaySubmitRemark() {
        return paySubmitRemark;
    }

    public void setPaySubmitRemark(String paySubmitRemark) {
        this.paySubmitRemark = paySubmitRemark;
    }

    public String getClientThirdType() {
        return clientThirdType;
    }

    public void setClientThirdType(String clientThirdType) {
        this.clientThirdType = clientThirdType;
    }

    public String getClientThirdExtra() {
        return clientThirdExtra;
    }

    public void setClientThirdExtra(String clientThirdExtra) {
        this.clientThirdExtra = clientThirdExtra;
    }

    public List<PayItem> getPayResultItems() {
        return payResultItems;
    }

    public void setPayResultItems(List<PayItem> payResultItems) {
        this.payResultItems = payResultItems;
    }
}
