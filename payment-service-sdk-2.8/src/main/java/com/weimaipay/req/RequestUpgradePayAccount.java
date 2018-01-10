package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/26.
 */
public class RequestUpgradePayAccount extends RequestPersonalBase {
    /**
     * 真实姓名
     */
    @JSONField(name="userRealName")
    private String realName;
    /**
     * 证件号
     */
    @JSONField(name="idcard")
    private String idCard;
    /**
     * 证件类型,暂时只支持身份证 参看枚举：{@link com.weimaipay.constant.EIdCardType}
     */
    @JSONField(name="idcardKind")
    private String idCardType;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }
}
