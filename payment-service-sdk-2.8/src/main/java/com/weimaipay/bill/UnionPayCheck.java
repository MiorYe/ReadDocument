package com.weimaipay.bill;

/**
 * @Author shancha
 * @Date Created in 上午 10:33 2018/1/9 0009
 */
public class UnionPayCheck {
    public String bankBuinessNo;//银行流水号

    public String tradeDate;//交易日期

    public String tradeTime;//交易时间

    public String merchantNo;//商户编号

    public String terminalNo;//终端编号

    public String bankCardNo;//卡号

    public String consumptionAmount;//消费金额

    public String poundage;//手续费

    public String consumptionType;//消费类型

    private String errorMsg;//错误原因

    public String getBankBuinessNo() {
        return bankBuinessNo;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public String getConsumptionAmount() {
        return consumptionAmount;
    }

    public String getPoundage() {
        return poundage;
    }

    public String getConsumptionType() {
        return consumptionType;
    }

    public void setBankBuinessNo(String bankBuinessNo) {
        this.bankBuinessNo = bankBuinessNo;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public void setConsumptionAmount(String consumptionAmount) {
        this.consumptionAmount = consumptionAmount;
    }

    public void setPoundage(String poundage) {
        this.poundage = poundage;
    }

    public void setConsumptionType(String consumptionType) {
        this.consumptionType = consumptionType;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
