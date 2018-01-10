package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/25.
 * 脉豆新增请求
 */
public class RequestIncreaseScoreBean extends RequestPersonalBase {
    /**
     * 外部业务单号 必填
     */
    @JSONField(name="outSerialNo")
    private String clientOrderId="";
    /**
     * 变动缘由 必填
     */
    @JSONField(name="remark")
    private String transReason="";
    /**
     * 变动数量 必填
     */
    private Long transValue;
    /**
     * 变动方向 seqFlag "1", "减少"，"2", "增加"，增加脉豆默认2
     */
    private String seqFlag="2";
    /**
     * 微脉划转通道 默认：10
     */
    @JSONField(name="userScoreBizType")
    private String transferChannel="10";
    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getTransReason() {
        return transReason;
    }

    public void setTransReason(String transReason) {
        this.transReason = transReason;
    }

    public Long getTransValue() {
        return transValue;
    }

    public void setTransValue(Long transValue) {
        this.transValue = transValue;
    }

    public String getSeqFlag() {
        return seqFlag;
    }

    public void setSeqFlag(String seqFlag) {
        this.seqFlag = seqFlag;
    }

    public String getTransferChannel() {
        return transferChannel;
    }

    public void setTransferChannel(String transferChannel) {
        this.transferChannel = transferChannel;
    }

}
