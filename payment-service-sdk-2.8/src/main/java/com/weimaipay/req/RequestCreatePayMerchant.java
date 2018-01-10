package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/26.
 * 创建商户请求
 */
public class RequestCreatePayMerchant {
    /**
     * 微脉客户编号 必填项
     */
    @JSONField(name="weMayId")
    private String clientMerchantId;
    /**
     * 微脉客户手机号 可空
     */
    private String mobile;
    /**
     * 微脉商户名称
     */
    @JSONField(name="userName")
    private String clientMerchantName;
    /**
     * 注册设备信息
     */
    private String registerDeviceInfo;

    public String getClientMerchantId() {
        return clientMerchantId;
    }

    public void setClientMerchantId(String clientMerchantId) {
        this.clientMerchantId = clientMerchantId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getClientMerchantName() {
        return clientMerchantName;
    }

    public void setClientMerchantName(String clientMerchantName) {
        this.clientMerchantName = clientMerchantName;
    }

    public String getRegisterDeviceInfo() {
        return registerDeviceInfo;
    }

    public void setRegisterDeviceInfo(String registerDeviceInfo) {
        this.registerDeviceInfo = registerDeviceInfo;
    }
}
