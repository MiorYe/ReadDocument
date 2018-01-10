package com.weimaipay.service;

import com.alibaba.fastjson.JSON;
import com.weimaipay.listener.TradeMsgListener;
import com.weimaipay.req.RequestHisBillData;
import com.weimaipay.res.*;

import java.util.*;

/**
 *
 */
public class MyTradeMsgListener extends TradeMsgListener<Object>
{

    @Override
    public ResponseMessgae onPay(Object context, PayMessage message)
    {
        // 收到支付消息
        System.out.println("收到支付消息：" + JSON.toJSONString(message));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        responseMessgae.setData("SUCCESS");
        return responseMessgae;
    }

    @Override
    public ResponseMessgae onRefund(Object context, RefundMessage message)
    {
        // 收到退款消息
        System.out.println("收到退款消息：" + JSON.toJSONString(message));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        responseMessgae.setData("SUCCESS");
        return responseMessgae;
    }
    @Override
    public ResponseMessgae<List<ResponseHisBillData>> getHisBillData(RequestHisBillData request)
    {
        // 收到统一对账拉账单消息
        System.out.println("收到统一对账拉账单消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        List<ResponseHisBillData> lst=new ArrayList<>();
        ResponseHisBillData hisData=new ResponseHisBillData();
        hisData.setMerchantOrderNo("his12312312");
        hisData.setAppTradeOrderNo("app234223");
        hisData.setTradeDirection("1");
        hisData.setAppName("weimai");
        hisData.setTradeAmount(1000L);
        hisData.setTradeDate("20171016095701");
        lst.add(hisData);
        hisData.setAppTradeOrderNo("app111223");
        hisData.setMerchantOrderNo("his333222");
        lst.add(hisData);
        responseMessgae.setData(lst);
        return responseMessgae;
    }
}
