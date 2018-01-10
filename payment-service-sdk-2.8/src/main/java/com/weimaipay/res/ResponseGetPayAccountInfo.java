package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/25.
 * 获取账户信息返回
 */
public class ResponseGetPayAccountInfo extends BaseResponse {
    /**
     * 支付账户识别码
     */
    private String payId;
    /**
     * 货币类型CNY
     */
    private String currencyType;
    /**
     * 余额总金额 单位：分
     */
    private Long balanceAmount;
    /**
     * 可用金额 单位：分
     */
    private Long avalaibleAmount;
    /**
     * 冻结金额 单位：分
     */
    private Long freezeAmount;
    /**
     * 平台红包余额 单位：分
     */
    @JSONField(name="ScoreEnv")
    private Long scoreEnvAmount;
    /**
     * 脉豆余额
     */
    @JSONField(name="ScoreBean")
    private Long scoreBeanAmount;
    /**
     * 脉豆与本币金额（元）的换算比例
     */
    private Long scoreBeanExchangeRatio;
    /**
     * 红包与本币金额（元）的换算比例
     */
    private Long scoreEnvExchangeRatio;

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Long getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Long balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public Long getAvalaibleAmount() {
        return avalaibleAmount;
    }

    public void setAvalaibleAmount(Long avalaibleAmount) {
        this.avalaibleAmount = avalaibleAmount;
    }

    public Long getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(Long freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public Long getScoreEnvAmount() {
        return scoreEnvAmount;
    }

    public void setScoreEnvAmount(Long scoreEnvAmount) {
        this.scoreEnvAmount = scoreEnvAmount;
    }

    public Long getScoreBeanAmount() {
        return scoreBeanAmount;
    }

    public void setScoreBeanAmount(Long scoreBeanAmount) {
        this.scoreBeanAmount = scoreBeanAmount;
    }

    public Long getScoreBeanExchangeRatio() {
        return scoreBeanExchangeRatio;
    }

    public void setScoreBeanExchangeRatio(Long scoreBeanExchangeRatio) {
        this.scoreBeanExchangeRatio = scoreBeanExchangeRatio;
    }

    public Long getScoreEnvExchangeRatio() {
        return scoreEnvExchangeRatio;
    }

    public void setScoreEnvExchangeRatio(Long scoreEnvExchangeRatio) {
        this.scoreEnvExchangeRatio = scoreEnvExchangeRatio;
    }
}
