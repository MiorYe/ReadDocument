package com.weimaipay.res;

import java.util.Date;

/**
 * Created by feng on 2017/10/13.
 * 获取医院外部业务统一对账数据
 */
public class ResponseHisBillData {
    /**
     * 应用方名称
     */
    private String appName;
    /**
     * 商户流水号
     */
    private String merchantOrderNo;
    /**
     * 应用方交易号
     */
    private String appTradeOrderNo;
    /**
     * 交易时间 格式：20171013161201 14位 年月日时分秒
     */
    private String tradeDate;
    /**
     * 交易金额 单位：分
     */
    private Long tradeAmount;
    /**
     * 交易方向 1代表收入，0代表支出
     */
    private String tradeDirection;

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getAppTradeOrderNo() {
        return appTradeOrderNo;
    }

    public void setAppTradeOrderNo(String appTradeOrderNo) {
        this.appTradeOrderNo = appTradeOrderNo;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Long getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Long tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeDirection() {
        return tradeDirection;
    }

    public void setTradeDirection(String tradeDirection) {
        this.tradeDirection = tradeDirection;
    }
}
