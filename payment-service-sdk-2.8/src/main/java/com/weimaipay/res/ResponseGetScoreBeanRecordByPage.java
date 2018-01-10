package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Created by feng on 2017/9/25.
 */
public class ResponseGetScoreBeanRecordByPage extends BaseResponse{
    /**
     * 微脉客户编号 必填
     */
    @JSONField(name="wmUserId")
    private String clientUserId="";
    /**
     * 支付账户识别码 必填
     */
    private String payId="";
    /**
     * 脉豆交易记录列表
     */
    @JSONField(name="scoreBeanList")
    private List<ScoreBeanRecord> scoreBeanRecordList;

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
    public List<ScoreBeanRecord> getScoreBeanRecordList() {
        return scoreBeanRecordList;
    }

    public void setScoreBeanRecordList(List<ScoreBeanRecord> scoreBeanRecordList) {
        this.scoreBeanRecordList = scoreBeanRecordList;
    }
}

