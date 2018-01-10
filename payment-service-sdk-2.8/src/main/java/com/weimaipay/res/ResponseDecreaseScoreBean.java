package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/25.
 */
public class ResponseDecreaseScoreBean extends BaseResponse {
    /**
     * 微脉客户编号
     */
    @JSONField(name="wmUserId")
    private String clientUserId;
    /**
     * 支付账户识别码
     */
    private String payId;
    /**
     * 本次增加脉豆数量
     */
    @JSONField(name="transValue")
    private String increaseScoreBean;
    /**
     * 外部业务单号
     */
    @JSONField(name="outSerialNo")
    private String clientOrderId;
    /**
     * 金融脉豆划转流水号
     */
    private String scoreJourId;
    public String getClientUserId() {
        return clientUserId;
    }

    public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getIncreaseScoreBean() {
        return increaseScoreBean;
    }

    public void setIncreaseScoreBean(String increaseScoreBean) {
        this.increaseScoreBean = increaseScoreBean;
    }

    public String getScoreJourId() {
        return scoreJourId;
    }

    public void setScoreJourId(String scoreJourId) {
        this.scoreJourId = scoreJourId;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }
}
