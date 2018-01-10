package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 拉取账单
 */
public class RequesQueryBill
{
    /**
     * 商户机构外部编号
     */
    @JSONField(name="merchantOutId")
    private String clientMerchantId;
    /**
     * 微脉支付平台的支付编号
     */
    @JSONField(name="merchantPayId")
    private String clientMerchantPayId;

    /**
     * 8位日期 yyyyMMdd
     */
    private String tradeDate;
    /**
     * 账单格式，默认为0；1:包含三方(支付宝，微信)单号 2：退款包含支付单号 0：其他
     */
    private String billType="0";

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getClientMerchantId()
    {
        return clientMerchantId;
    }

    public void setClientMerchantId(String clientMerchantId)
    {
        this.clientMerchantId = clientMerchantId;
    }

    public String getClientMerchantPayId()
    {
        return clientMerchantPayId;
    }

    public void setClientMerchantPayId(String clientMerchantPayId)
    {
        this.clientMerchantPayId = clientMerchantPayId;
    }

    public String getBillType()
    {
        return billType;
    }

    public void setBillType(String billType)
    {
        this.billType = billType;
    }
}
