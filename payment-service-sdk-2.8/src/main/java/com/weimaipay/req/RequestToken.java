package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 请求Token
 * Created by feng on 2017/9/26.
 */
public class RequestToken {
    /**
     * 微脉客户编号 必填
     */
    @JSONField(name="wmUserId")
    private String clientUserId="";
    /**
     * 支付账户识别码 必填
     */
    @JSONField(name="wmPayUserId")
    private String payId;
    /**
     *  登录失效时间
     *  格式：yyyyMMdd HH:mm:ss
     */
    private String expires;
    /**
     * 客户登录IP
     */
    @JSONField(name="ip")
    private String clientLoginIp;
    /**
     *  登陆备注
     */
    private String remark;

    public String getClientUserId() {
        return clientUserId;
    }

    public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getClientLoginIp() {
        return clientLoginIp;
    }

    public void setClientLoginIp(String clientLoginIp) {
        this.clientLoginIp = clientLoginIp;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
