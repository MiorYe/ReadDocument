package com.weimaipay.constant;

/**
 * 退款状态
 * @author 七星草    杭州求是同创网络科技有限公司
 */
public enum  ERefundStatus
{
    WaitRefund("1", "待退款"),
    RefundPass("2", "退款成功"),
    RefundFail("3", "退款失败"),
    RefundPartPass("4", "退款部分成功");

    ERefundStatus(String code, String name) {
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
