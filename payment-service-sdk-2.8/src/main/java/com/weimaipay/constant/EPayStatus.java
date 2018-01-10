package com.weimaipay.constant;

/**
 * <h1> 订单支付状态  </h1>
 * <p>
 * <b>描述：</b>
 *
 * 商家订单下单----(等待支付)----->用户支付------(订单处于待支付状态，支付成功，否则失败)------>支付成功或失败
 * 商家取消------(订单处于待支付状态则取消成功，否则取消失败)------>如果取消成功，则用户不能再继续支付
 * 商家退款------（订单处于支付成功状态则退款成功，否则失败）------->全额退款后不能重复退款
 *
 * @author 七星草    杭州求是同创网络科技有限公司
 * @version 1.0     2017年07月04日  15点26分
 */
public enum  EPayStatus
{
    WaitPay("0", "等待支付"),
    Success("1", "支付成功"),
    Fail("2", "支付失败"),
    RefundSuccess("3", "退款成功"),
    RefundFail("4","退款失败"),
    CANCEL("5", "已取消"),
    Unkown("-1", "支付状态未知");

    EPayStatus(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;

    private String name;

    public String getCode() {
        return code;
    }

    public String getName()
    {
        return name;
    }
}
