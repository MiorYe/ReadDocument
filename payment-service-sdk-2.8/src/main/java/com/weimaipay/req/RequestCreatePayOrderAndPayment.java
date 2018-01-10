package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;
import com.weimaipay.res.PayItem;

import java.util.List;

/**
 * Created by feng on 2017/11/6.
 */
public class RequestCreatePayOrderAndPayment extends RequestGetQrCodeInfo {
    /**
     * 客户编号 必填项
     */
    @JSONField(name = "wmUserId")
    private String clientUserId;
    /**
     * 支付账户识别码 必填项
     */
    private String payId;
    /**
     * 对账使用客户订单ID 此单号会输出到对账单  多个单号用|分隔 可空
     */
    private String checkOrderId;
    /**
     * 详细支付方式，比如支付宝，微信，参考枚举 {@link com.weimaipay.constant.EPayType}
     */
    private List<PayOrderItem> payItems;

    public String getClientUserId() {
        return clientUserId;
    }

    public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId == null ? null : clientUserId.trim();
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getCheckOrderId() {
        return checkOrderId;
    }

    public void setCheckOrderId(String checkOrderId) {
        this.checkOrderId = checkOrderId == null ? null : checkOrderId.trim();
    }

    public List<PayOrderItem> getPayItems() {
        return payItems;
    }

    public void setPayItems(List<PayOrderItem> payItems) {
        this.payItems = payItems;
    }

    public static class PayOrderItem{
        /**
         * 支付方式，必填项
         */
        @JSONField(name = "payType")
        private String payMethod;
        /**
         * 支付金额，必填项
         */
        private Long payAmount;
        /**
         * 码信息
         */
        private String extra;
        /**
         * 备注
         */
        private String remark;
        public String getPayMethod() {
            return payMethod;
        }

        public void setPayMethod(String payMethod) {
            this.payMethod = payMethod;
        }
        public Long getPayAmount() {
            return payAmount;
        }

        public void setPayAmount(Long payAmount) {
            this.payAmount = payAmount;
        }

        public String getExtra() {
            return extra;
        }

        public void setExtra(String extra) {
            this.extra = extra == null ? null : extra.trim();
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark == null ? null : remark.trim();
        }
    }
}
