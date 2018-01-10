package com.weimaipay.constant;

/**
 * 订单状态
 * @author 七星草    杭州求是同创网络科技有限公司
 */
public enum EPayOrderStatus
{
    WaitPay("0", "待支付"),
    PayPass("2", "支付成功"),
    PayFail("3", "支付失败"),
    PayPartPass("4", "支付部分成功"),
    Refund("5", "转入退款"),
    Cancel("8", "手动取消"),
    InvalidateOrder("9", "废单，重复调用等方式导致废单") ;

    EPayOrderStatus(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;

    private String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static Boolean isWait(String code){
        return (EPayOrderStatus.WaitPay.getCode().equalsIgnoreCase(code));
    }

    public static Boolean isPartPass(String code){
        return (EPayOrderStatus.PayPartPass.getCode().equalsIgnoreCase(code));
    }

    public static Boolean isPass(String code){
        return (EPayOrderStatus.PayPass.getCode().equalsIgnoreCase(code));
    }

    public static Boolean isWaitAndPartPass(String code){
        return ((EPayOrderStatus.WaitPay.getCode().equalsIgnoreCase(code))
                || (EPayOrderStatus.PayPartPass.getCode().equalsIgnoreCase(code)));
    }

    public static Boolean isFail(String code){
        return (EPayOrderStatus.PayFail.getCode().equalsIgnoreCase(code));
    }

    public static Boolean isCancel(String code){
        return (EPayOrderStatus.Cancel.getCode().equalsIgnoreCase(code));
    }

    public static Boolean isInvalidateOrder(String code){
        return (EPayOrderStatus.InvalidateOrder.getCode().equalsIgnoreCase(code));
    }

    public static Boolean isRefund(String code){
        return (EPayOrderStatus.Refund.getCode().equalsIgnoreCase(code));
    }

}
