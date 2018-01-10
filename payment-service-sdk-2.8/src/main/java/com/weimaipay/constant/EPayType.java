package com.weimaipay.constant;

/**<h1>支付方式枚举  </h1>
 *
 * @author   七星草 求是同创网络科技有限公司
 * @version  1.0    2017年07月05日 星期三 下午 5点16分35秒
 */
public enum  EPayType
{
    Alipay("alipay", "支付宝手机支付"),
    AlipayWap("alipay_wap", "支付宝手机网页支付"),
    WeiXin("wx", "微信支付"),
    WeiXinPub("wx_pub", "微信公众号支付"),
    WeiMaiQr("wei_mai_qr", "微脉扫码支付");

    EPayType(String code, String name) {
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
