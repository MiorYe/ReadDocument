package com.weimaipay.constant;

/**
 * 退款原因类型
 * @author 七星草    杭州求是同创网络科技有限公司
 */
public enum ERefundOrderReasonType
{
    CancelPartPassPayRefund("0", "取消部分成功的支付订单而引起的退款"),
    ThirdFailPayRefund("1", "三方回调支付失败，支付失败引起的的部分成功付款的退费"),
    ReturnRefund("2", "退货退款"),
    ReverseRefund("3", "冲正需要引起的退还"); //就诊卡充值退款

    ERefundOrderReasonType(String code, String name) {
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
