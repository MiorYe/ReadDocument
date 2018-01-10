package com.weimaipay.constant;

/**
 * Created by feng on 2017/9/26.
 */
public enum EIdCardType {
    IDCARD("01", "居民身份证"),
    HKB("02", "居民户口簿"),
    HZ("03", "护照"),
    JGZ("04", "军官证"),
    JSZ("05", "驾驶证"),
    GATXZ("06", "港澳通行证"),
    TWTXZ("07", "台湾通行证"),
    WZGBZ("08", "文职干部证"),
    SBZ("09", "士兵证"),
    CJZ("10", "残疾证"),
    YLBXZ("11", "医疗保险证"),
    CSZM("12", "出生证明"),
    JTBS("13", "家庭标识"),
    ZYBL("14", "住院病历"),
    ZYCW("15", "住院床位"),
    MZBL("16", "门诊病历"),
    SWZM("17", "死亡证明"),
    OTHERS("99", "其他法定有效证件");

    EIdCardType(String code, String name) {
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
