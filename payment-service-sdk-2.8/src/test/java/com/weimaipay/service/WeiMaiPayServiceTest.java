package com.weimaipay.service;

import com.alibaba.fastjson.JSON;
import com.weimaipay.constant.EPayOrderStatus;
import com.weimaipay.constant.EPayOrderType;
import com.weimaipay.constant.EPayType;
import com.weimaipay.constant.EPaymentArrivalType;
import com.weimaipay.req.*;
import com.weimaipay.req.RequestAuthInfo;
import com.weimaipay.res.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 接口测试
 */
public class WeiMaiPayServiceTest
{
    private WeiMaiPayService weiMaiPayService;

    @Before
    public void setUp() throws Exception
    {
        //支付上行配置，调试支付接口就改为TestConfig.TEST
        weiMaiPayService = new WeiMaiPayService(TestConfig.TEST.PUBLIC_KEY, TestConfig.TEST.PRIVATE_KEY, TestConfig.TEST.APPID, TestConfig.TEST.GATEWAY);
        //商保上行配置，调试商保接口就改为TestConfig.InsuranceTEST
        //weiMaiPayService = new WeiMaiPayService(TestConfig.InsuranceTEST.PUBLIC_KEY, TestConfig.InsuranceTEST.PRIVATE_KEY, TestConfig.InsuranceTEST.APPID, TestConfig.InsuranceTEST.GATEWAY);
        MyTradeMsgListener listener = new MyTradeMsgListener();
        listener.setContext(this);
        weiMaiPayService.add(listener);
        MyAbstractPullEventListener lstPull=new MyAbstractPullEventListener();
        weiMaiPayService.add(lstPull);
    }
    @Test
    public void hospAuthInfoCallback() throws Exception
    {

    }
    @Test
    public void toJsonString() throws Exception
    {
        RequestMobileWebPay request=new RequestMobileWebPay();
        request.setAppId("10000");
        request.setClientOrderId("4103232423453453453");
        request.setPayId("817038842920961"); //金融账户
        request.setPayOrderName("独一味的万金油支付");
        request.setPayOrderDescription("独一味的万金油支付测试");
        request.setPayOrderAmount(1L); // 支付金额，单位：分
        request.setPayOrderType(EPayOrderType.WeiMay.getCode());
        //目前业务都是选择即时到账
        request.setPaymentArrivalType(EPaymentArrivalType.pay_arrival.getCode());
        request.setClientMerchantId("910300000012465882"); // 外部商户号
        request.setPayeeId("8344151397498891");
        request.setCheckOrderId("2222|4444|6666");
        request.setReturnUrl("wanjinyou.com");
        request.setPayOrderExtra("");
        request.setPaySubmitRemark("HIS需要用的字段");
        request.setPayDeadTime(5); // 订单有效时间，单位：分钟
        String strJson=weiMaiPayService.toJsonString(request);
    }
    @Test
    public void register() throws Exception
    {
        RequestRegisteUser req = new RequestRegisteUser();
        req.setMobile("16800000000");
        req.setBirthday("19990101");
        req.setUserName("duyiwei");
        req.setWeMayId("111222333444");
        ResponseRegisteUser res =  weiMaiPayService.registeUser(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void createPayMerchant() throws Exception
    {
        RequestCreatePayMerchant req = new RequestCreatePayMerchant();
        req.setMobile("16800000000");
        req.setClientMerchantId("10000000123456789");
        req.setClientMerchantName("duyiwei");
        req.setRegisterDeviceInfo("");
        ResponseCreatePayMerchant res =  weiMaiPayService.createPayMerchant(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void increaseScoreBean() throws Exception
    {
        RequestIncreaseScoreBean req = new RequestIncreaseScoreBean();
        req.setClientOrderId("300111111");
        req.setClientUserId("910300000013679010");
        req.setPayId("817038842920961");
        req.setTransReason("独一味测试");
        req.setTransValue(10L);
        ResponseIncreaseScoreBean res =  weiMaiPayService.increaseScoreBean(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void decreaseScoreBean() throws Exception
    {
        RequestDecreaseScoreBean req = new RequestDecreaseScoreBean();
        req.setClientOrderId("300111333");
        req.setClientUserId("910300000013679010");
        req.setPayId("817038842920961");
        req.setTransReason("独一味测试");
        req.setTransValue(2L);
        ResponseDecreaseScoreBean res =  weiMaiPayService.decreaseScoreBean(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void getPayAccountInfo() throws Exception
    {
        RequestGetPayAccountInfo req = new RequestGetPayAccountInfo();
        req.setClientUserId("910300000013679009");
        req.setPayId("817038842920961");
        ResponseGetPayAccountInfo res =  weiMaiPayService.getPayAccountInfo(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void getUpgradePayAccount() throws Exception
    {
        RequestUpgradePayAccount req = new RequestUpgradePayAccount();
        req.setClientUserId("910300000013679009");
        req.setPayId("817038842920961");
        req.setIdCard("110000198506144557");
        req.setIdCardType("03");
        req.setRealName("测试喻烽");
        ResponseUpgradePayAccount res =  weiMaiPayService.getUpgradePayAccount(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void getToken() throws Exception
    {
        RequestToken req = new RequestToken();
        req.setClientUserId("910300000013679009");
        req.setPayId("817038842920961");
        req.setExpires("2018-09-27 00:00:00");
        req.setClientLoginIp("");
        req.setRemark("");
        ResponseToken res =  weiMaiPayService.getToken(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void getScoreBeanRecordByPage() throws Exception
    {
        RequestGetScoreBeanRecordByPage req = new RequestGetScoreBeanRecordByPage();
        req.setClientUserId("910300000013679009");
        req.setPayId("817038842920961");
        req.setCount(10);
        req.setStartPage(1);
        ResponseGetScoreBeanRecordByPage res =  weiMaiPayService.getScoreBeanRecordByPage(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }

    @Test
    public void createActivity() throws Exception
    {
        RequestCreateActivity req = new RequestCreateActivity();
        req.setClientActivityNo("910300000013679009");
        req.setActivityName("独一味代金券活动测试");
        req.setStartTime("20170926000000");
        req.setEndTime("20180926000000");
        req.setUserGetLimit(1);
        req.setWarnReceivePhone("");
        req.setWarnRule("");
        req.setMaxCouponCount(100);
        req.setUseCondition("");
        ResponseCreateActivity res =  weiMaiPayService.createActivity(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void updateActivity() throws Exception
    {
        RequestUpdateActivity req = new RequestUpdateActivity();
        req.setActivityNo("1684898624569345");
        req.setActivityName("独一味代金券活动测试1");
        req.setStartTime("20170927000000");
        req.setEndTime("20180927000000");
        req.setUserGetLimit(2);
        req.setActivityStatus(2);
        req.setWarnReceivePhone("");
        req.setWarnRule("");
        req.setMaxCouponCount(200);
        req.setUseCondition("");
        ResponseUpdateActivity res =  weiMaiPayService.updateActivity(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void addActivityCoupon() throws Exception
    {
        RequestAddActivityCoupon req = new RequestAddActivityCoupon();
        req.setActivityNo("1684898624569345");
        req.setCouponName("独一味测试活动的测试代金券");
        req.setCouponDes("测试添加代金券");
        req.setClientActivityCouponNo("20180927000000");
        req.setCouponCount(100);
        req.setMinUseAmount(1);
        req.setCouponPara("Q1000,J0001,K0001");
        req.setPayOrderTypeList("mzzf,ghzf");
        req.setCouponType("1");
        req.setEffectiveDaysAfterGet(5);
        req.setExpiredDaysAfterGet(100);
        req.setRemark("");
        ResponseAddActivityCoupon res =  weiMaiPayService.addActivityCoupony(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void getCoupon() throws Exception
    {
        RequestGetCoupon req = new RequestGetCoupon();
        req.setClientOrderId("123123123");
        req.setClientMerchantId("910500000026742676");
        req.setCouponBatchNo("1672692864385026");
        req.setGetType("APP");
        req.setPayId("818389442363393");
        req.setGetReason("dyw-test");
        req.setSubmitRemark("");
        ResponseGetCoupon res =  weiMaiPayService.getCoupon(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void updateActivityCoupon() throws Exception
    {
        RequestUpdateActivityCoupon req = new RequestUpdateActivityCoupon();
        req.setActivityCouponNo("835716917493762");
        req.setUseConditionCode("Q100000000000000002");
        ResponseUpdateActivityCoupon res =  weiMaiPayService.updateActivityCoupon(req);
        if(res.getResultStatus()==true)
        {
            System.out.print(JSON.toJSONString(res));
        }
        else
        {
            System.out.print(res.getResultCode() + res.getResultMsg());
        }
    }
    @Test
    public void getQrCodeInfo() throws Exception
    {
        RequestGetQrCodeInfo req = new RequestGetQrCodeInfo();
        req.setPayOrderName("独一味的扫码支付");
        req.setPayOrderDescription("独一味的自助机扫码支付测试");
        req.setPayOrderAmount(1L); // 支付金额，单位：分
        req.setPayOrderType(EPayOrderType.MZZF.getCode());
        req.setOrderId("qxc00000000000000000001"); // 订单编号，不能复用已支付的单号，订单号应尽量不重复
        req.setClientMerchantId("910300000012465882"); // 外部商户号
        req.setPayeeId("8344151397498891");
        req.setPayerDeviceIp("127.0.0.1");
        req.setCurrency("cny");
        // req.setPaySubmitRemark("30718");
        req.setPayDeadTime(5); // 订单有效时间，单位：分钟
        ResponseGetQrCodeInfo res = weiMaiPayService.getQrCodeInfo(req);
        System.out.print(JSON.toJSONString(res));
    }

    @Test
    public void createPayOrderAndPayment() throws Exception
    {
        RequestCreatePayOrderAndPayment req = new RequestCreatePayOrderAndPayment();
        req.setClientUserId("910300000013679009"); //外部客户编号，微脉平台传微脉号
        req.setPayId("817038842920961"); //金融账户
        req.setPayOrderName("独一味的扫码枪支付");
        req.setPayOrderDescription("独一味的扫码枪支付测试");
        req.setPayOrderAmount(1L); // 支付金额，单位：分
        req.setPayOrderType(EPayOrderType.MZZF.getCode());
        req.setOrderId("smq00000000000000000001"); // 订单编号，不能复用已支付的单号，订单号应尽量不重复
        req.setClientMerchantId("910300000012465882"); // 外部商户号
        req.setPayeeId("8344151397498891");
        req.setPayerDeviceIp("127.0.0.1");
        List<RequestCreatePayOrderAndPayment.PayOrderItem> lst=new ArrayList<>();
        RequestCreatePayOrderAndPayment.PayOrderItem payItem=new RequestCreatePayOrderAndPayment.PayOrderItem();
        payItem.setPayMethod(EPayType.Alipay.getCode());
        payItem.setPayAmount(req.getPayOrderAmount());
        payItem.setExtra("333332222dddddd");
        payItem.setRemark("");
        lst.add(payItem);
        req.setPayItems(lst);
        req.setCheckOrderId("2222|4444|6666");
        req.setCurrency("cny");
        req.setReturnUrl("saomaqiang.result.com");
        req.setExtra("扫描枪支付码3333232323");
        req.setPaySubmitRemark("HIS需要用的字段");
        req.setPayDeadTime(5); // 订单有效时间，单位：分钟
        ResponseCreatePayOrderAndPayment res = weiMaiPayService.createPayOrderAndPayment(req);
        System.out.print(JSON.toJSONString(res));
    }

    @Test
    public void queryOrderPayment() throws Exception
    {
        RequestOrderPaymet req = new RequestOrderPaymet();
        req.setOrderId("910600000240384157");
        req.setPayOrderNo("testmzzf2017082915032310073654918");
        ResponseOrderPaymet res =  weiMaiPayService.queryOrderPayment(req);
       // System.out.println(JSON.toJSONString(res));
    }

    @Test
    public void cancelPayOrder() throws Exception
    {
        RequestCancelOrder req = new RequestCancelOrder();
        req.setClientOrderId("jzkcz");
        req.setCancelOperId("831624719630341");
        ResponseCancelOrder res = weiMaiPayService.cancelPayOrder(req);
        System.out.print(JSON.toJSONString(res));
    }

    @Test
    public void revokePayOrder() throws Exception
    {
        RequestCancelOrder req = new RequestCancelOrder();
        req.setClientOrderId("jzkcz");
        req.setCancelOperId("831624719630341");
        ResponseCancelOrder res = weiMaiPayService.revokePayOrder(req);
        System.out.print(JSON.toJSONString(res));
    }

    @Test
    public void doOrderRefund() throws Exception
    {
        RequestRefundPayOrder req = new RequestRefundPayOrder();
        req.setPayOrderNo("testmzzf2017082214230646950257382");
        req.setOrderId("9999999999"); // 客户业务单号
        req.setRefundId("88888888882");
        req.setRefundAmount(1L);
        req.setRefundOrderReason("测试退款");
        /* "0", "取消部分成功的支付订 单而引起的退款" "1", "三方回调支付失败，支付失败引起的的部分成功付款的退费" "2", "退货退款" "3", "冲正需要引起的退还(就诊卡充值退款)" */
        req.setRefundOrderReasonType("2");
        req.setRefundOrderDesc("测试订单");
        req.setIsReturnScoreEnv("0"); // 是否包含红包
        req.setCheckRefundId("8888888888");
        ResponseRefundOrder res = weiMaiPayService.doOrderRefund(req);
        System.out.print(JSON.toJSONString(res));
    }

    @Test
    public void doOrderRefundQuery() throws Exception
    {
        RequestRefundOrderQuery req = new RequestRefundOrderQuery();
        req.setRefundId("910600000240384157");
        req.setRefundOrderNo("test1682185882959875");
        ResponseRefundOrderQuery res = weiMaiPayService.doOrderRefundQuery(req);
        System.out.print(JSON.toJSONString(res));
    }


    @Test
    public void queryBill() throws Exception
    {
        RequesQueryBill req = new RequesQueryBill();
        req.setClientMerchantId("911300000000540072");  // 91130000000054007
        req.setClientMerchantPayId("834367089803283");  // 834367089803283
        req.setTradeDate("20170815");
        req.setBillType("2");
        ResponseQueryBill res =  weiMaiPayService.queryBill(req);
        System.out.println(JSON.toJSONString(res));
    }
    @Test
    public void hospAuthCodeCallback() throws Exception
    {
        RequestAuthInfo req = new RequestAuthInfo();
        req.setHospReqNum("test001");
        req.setReqNum("test002");
        req.setHospAuthNum("test003");
        req.setHospVerifyStatus("1");
        ResponseAuthInfo res = weiMaiPayService.hospAuthCodeCallback(req);
        System.out.print(JSON.toJSONString(res));
    }

    /**
     * 消息通知
     */
    @Test
    public void msgNotify() throws Exception
    {
        // 运通道收到如下消息内容
        //String msg="{\"content\":\"IcTBFO1pJN++u9DJvNxsh6dnmMbmV/Ua15tyR9lhQseQUrU9POwGE7y41Phj7R9y/Z9/n0yVFi+i8kDb0XNSG7Vt6dYViFtWQywTEJVht5vA/Y7IyLwnvI4Mao7gknreOmMtHUiEjGXq1vA7uvgg+F15iFYzX6pz/JKMMt4iYs+SddUQfDBXavwiNByIYQJGqkkguARGEVcIREWqbk3Jr9x15gkP7lggagnHYnYDDIGACPw5uJF4q27GfNhGoK+wvuVpQZcqprijAyVoudgun4qvKJDUe9pWfTBwdJ5hJwf8arO8gPe3NPn6XZi2+kdBhCjdOBBADhAyRHrTaskyMXOlgM0FBEas4B+C9tUyX9IwHWPbkI83sOetjotasBiAqoo6VvRalCRiGYX2dl17hcCajKUEF/H03aM1mb7refWogkoRYA1qmbtRjQgmFSMnR/E29X7ENuJKq5ZA/Oq5Vw==\",\"key\":\"hRvfJj5TIA14fOCaNDXdeY9Qc9mb+Rzql9a2wV+mZj5iMAHwSH4c5txG0ZA/zrqkD5wR7ZgEUND8RceYp5DM/gfroQUp9AF+oetYuBvjuAowlOhPjZAqMcTvdaW+dj3I+JTwAtPl/oI5kk2AtZxDDxnr6HXgTVjsPlmnLK4Hf48=\",\"sign\":\"gj2w9jY8TQIg5r2TG5FnGV2K+tKbkRqXvp/blFV+rIYmFO1MxqWsFxwxoSvstXaIb2S46+yQwGo4CXvvN5HaDrotFrGyLewdU1dGcVYjMP7/l/980xv8tylUWu9lULbwRKVK/IZIwE3fRb/c+xYphy9+QQS6kk05BRdEoEP99xk=\",\"type\":\"transfer.success\"}";
        //String msg = "{\"content\":\"ajUT2tWm5PHj52q7EpbOVjCiNOpyB5nLk2cWNTguvKCEBb3Ocnj8ZWuz2UwSRgyUT/+3EWqNhnHGr0V0V2cuBv73/ysukDatevHkG3L8y6XhhzpBEcfecT9x17Uqhn9cEc0R8SaIYX6wR2qjFSftngKdsGvdFxkub2goQ5KuBTNen6E3+WibhsF9V7k2ppU7pMJzUAZsN9nbfVcq4+QnMafYsZxl7tIdIkHSeuepiEgpIYI5C5E0v3AeVIULnLzufYKZidRHzr13i9sBNCpnA4l3r1WHtWxp/qS1YOgWieBiczvKcPRrLhTca4ETwee+rDqPnWD05vClcjtq+9KPJwEECCVdYyPxBegfDHRq1i9UJIp+ghPMlHt6EQjg2pFNMFVR7O8YyTYWOZiiT0WFpjbP/w+kiXborYMHqe0B0CxYeUBk2kmH3Idy3Amo/75YoRYgZvOnOA1KyL8GKeCXxH5w1PP9zTq+0sSaJrZbEz6v3UCRguHMjAUMwegC21EMbsZPrxGrF+BZeAQ65oEgvw6uQs0fmlgvXVfhBwyHgXtsUdWBJ/8895pA/wiZkjgs/GSE8kZ29VH681d5sM8YFKhW2rspiobsU8CrEoByTI1jdz6TeFri8a7M/jvblI8g38jt63+bZQ6MyK/B/hEyD/b5HM1hlza8X3csCVhlqIM=\",\"key\":\"DFUp7f7hLOKY3npmlSdXrAWSNH+MGYty8RN7MuTJnhd9Kwy+xbIyyYlpAF4D+KKfX0bwahG6a54u/U91KJbKYUR2GqOY/Ft+senxU1EbraZX721SKERlVLw2Coh+T0Mb9Y7AGY7I4H9/JqBVEw7eo3Jd7ncY9JbqW9i4ILPp3M8=\",\"sign\":\"EzcUQQoy+IQW5saSPk0AIC5tx0noJmROyUnIP7Yc2XaDNOu76ZvVMVZgJ+XW77Dy/aNczVTaqcmsPdm2ZiNad4AmT/rzfHX+kQJJe10bUUSq2ioDLaQgUqP78HG2FbXBL4oYJP6LHfMiR0TDopcdvfSst0wqeqifjalunYdiL7k=\",\"type\":\"pay.success\"}";
        String msg = "{\"content\": \"CjDchblMjwEOqGGqqUD+T4AvDT6pmeBcqvIv/AK+sVHc3x3n+8taOT94HLUKk6uvYpTdXWG6Gi9m25wMl+giMnNTUWGEqa7/MK57yiELSETPQeQqJ43dOtG4lu5tX2QpGPos87zN56lsHsqg1Nm3TZjNHnTA93EVRPSNFI3WqcFRLaI+GfJzbJI99ffDv2LCOglgsAU+5ijTrzfWKfgQxdwP0u87t0KcfD378ZrYvKHmdh1ZXWOi4EjhlBzPdhfZoCTiSm/C+5NJuCXgxkglW7ll3EFC+yX9uin96vvCG6gYNuirz0NXrHqOLWv0ct7udLfNAs61C/FzDo3dhBQ9ocPlPUadTYEizMOzw/g50PzJZW4wzY2q94a3SLUPn8BDTH2RCC//Rkw9i6DfqEZAcskaYqbRM4gwYuWqy9fVhltlDY5ZI7cPM05LsA52aGUpMtBCxEWd3OczvYz9YBoZpb1nJyNH6fyCzf8SsEx4dh8x9t3rr3DJsJou0EhH0q75NWBkgjw+aru6+Cj0cDPtQ5qX2ZYnt6qrU/Y0Rrc9kw8ugufcUDMJJmQoKZDPXz3u+JrkYqK4WrF5bp4BmFNtDkyhl/dGKMnRjX88IExj6wJg9mLOhUGa1P9VvFO1k/GIJbilxH+cOr+NVCO7UDEtag==\",\"key\":\"zRnpe0DtGAt7xlE9OSPnPo3elTMEPWwxc9V2s3guAU6MRo4M9JxswLkd+t/9Fecy3IOIyfN9z9y95THl7Qon4wbP2NI5pAWItnqgRtlzaYz4GCaV3EzjRgd8jCu/dcSkSO9/x0it+2i0Qvxl2Yu1dcdj6HqtA9/K2uezUYVKKKs=\",\"sign\":\"pNibJe5iG/dJT4zGlrZ5SNk3IvkIMK6a01h8yMpwspUfcWzEvUQZZZ5r+IL3f3mpr9NaE5eCbaCpD7sSRbMuMfBLnImAwp5bwEE/YQQos+3IYUKArD9cJc9JN0mfuweHSpAY7OVIT2IWvlAdjuuTPv4mD/9W4p6/WP8xBKqLNqo=\",\"type\":\"pay.success\"}";
        //String msg="{\"content\":\"XC1wOMHAGNWm+KLUby6frHnqataFejMWYhHgx1oPsOJO/M1YbSiRoeXQuQSlcsKTAE8SGfZ7zcO7Xra67Xogrr6+DuPiWf2A2BaL/fIEQoARMc0tszzNdlFDivRee2/dHKeYzcq92fM4+29af5bU+lL1Lc0PdhmZr5QaeQN25cxYL1egTQG+FOjOLLk7TZ47ndRBoYAqk3rSmwtP9TF+yg==\",\"key\":\"bCAcGUxh8CM06Ya96mewdYqWyrEDegsa5UlU0fqgGRGkzHfelo9BIcD75/3TH+Lc8EL4rYFFTbwr0iFtIOpFBqqAJGO91kyJgY1n0Qq2FTUdPkP9tcK6MPtgLQ1QdrQ9SkqJECodn9PAQxYP262of/F4Y/bi2bIBvtllhEeJA0Q=\",\"sign\":\"kObpglXhYfbxGXUHyK5rA58K3uHcVNzH+ww87s1TI103qnbrc4kMNtJC3dOZvLjbqQyxCRfD3bvynWfPydlWKPOAkxt3FRCiDenD+PmXyhNljwS8tZLfrModOqh8vUEIaVjmoFcfD2f0WWwdEUn4erpowFpZZoaOfK6B+jwiktY=\",\"type\":\"pull_clinic_treat_record\"}";
        // 调用通知，不同消息类型的消息会被分发给已经注册了的 Listener 的具体对应方法
        System.out.println(JSON.toJSONString(weiMaiPayService.msgNotify(msg)));
    }

}