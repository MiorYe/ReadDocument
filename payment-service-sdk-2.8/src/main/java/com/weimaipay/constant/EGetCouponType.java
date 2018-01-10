package com.weimaipay.constant;

/**
 * Created by feng on 2017/9/27.
 */
public enum EGetCouponType {
    App("APP","app发放"),
    App_QR("APP_QR","app扫码领取"),
    App_Promote("APP_PROMOTE","运营促销APP页领取"),
    Web("WEB","web页面发放"),
    WebPromote("WEB_PROMOTE","运营促销活动页领取");

    EGetCouponType(String code, String name) {
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
