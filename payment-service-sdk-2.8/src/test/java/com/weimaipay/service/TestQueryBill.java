package com.weimaipay.service;

import com.alibaba.fastjson.JSON;
import com.weimaipay.req.RequesQueryBill;
import com.weimaipay.res.ResponseQueryBill;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author shancha
 * @Date Created in 下午 1:23 2018/1/8 0008
 */
public class TestQueryBill {

    private WeiMaiPayService weiMaiPayService;

    @Before
    public void setUp() throws Exception
    {
        //支付上行配置，调试支付接口就改为TestConfig.BILL
        weiMaiPayService = new WeiMaiPayService(TestConfig.BILL.PUBLIC_KEY, TestConfig.BILL.PRIVATE_KEY, TestConfig.BILL.APPID, TestConfig.BILL.GATEWAY);
        //商保上行配置，调试商保接口就改为TestConfig.InsuranceTEST
        //weiMaiPayService = new WeiMaiPayService(TestConfig.InsuranceTEST.PUBLIC_KEY, TestConfig.InsuranceTEST.PRIVATE_KEY, TestConfig.InsuranceTEST.APPID, TestConfig.InsuranceTEST.GATEWAY);
        MyTradeMsgListener listener = new MyTradeMsgListener();
        listener.setContext(this);
        weiMaiPayService.add(listener);
        MyAbstractPullEventListener lstPull=new MyAbstractPullEventListener();
        weiMaiPayService.add(lstPull);
    }

    @Test
    public void queryBill() throws Exception
    {
        RequesQueryBill req = new RequesQueryBill();
        req.setClientMerchantId("911300000000540072");  // 91130000000054007
        req.setClientMerchantPayId("834367089803283");  // 834367089803283
        req.setTradeDate("201712010");
        req.setBillType("2");
        ResponseQueryBill res =  weiMaiPayService.queryBill(req);
        System.out.println(JSON.toJSONString(res));
    }
}
