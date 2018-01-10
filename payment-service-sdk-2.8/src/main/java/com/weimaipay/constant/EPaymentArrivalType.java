package com.weimaipay.constant;

/**
 * Created by feng on 2017/10/16.
 */
public enum EPaymentArrivalType {
    pay_arrival(0, "即时到账"),
    order_finish_arrival(1, "订单完成到账 需要订单确认收货到账");

    EPaymentArrivalType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    private Integer code;

    private String name;

    public Integer getCode() {
        return code;
    }

    public String getName()
    {
        return name;
    }
}
