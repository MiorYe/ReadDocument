package com.weimaipay.constant;

/**
 * Created by feng on 2017/9/26.
 */
public enum EActivityStatus {
    Unstart(1, "待启用"),
    Start(2, "已启用"),
    Pause(3, "暂停"),
    Expired(4, "已过期"),
    Stop(9,"作废");

    EActivityStatus(Integer code, String name) {
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
