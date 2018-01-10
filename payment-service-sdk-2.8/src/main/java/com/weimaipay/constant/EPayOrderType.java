package com.weimaipay.constant;

/**
 * <h1> 订单类型枚举 </h1>
 *
 * @author 七星草    杭州求是同创网络科技有限公司
 * @version 2.0     2017年07月04日  11点31分
 */
public enum EPayOrderType
{
    YunZhenLiao("yzl","云诊疗"), //医疗服务，生活服务
    WeiMay("wm","微脉平台"),
    JiuZhenKaCZ("jzkcz","就诊卡充值"),
    GuaHaoZhiFu("ghzf","挂号支付"),
    YECZ("yecz","充值到余额"),
    FanXian("fx","支付平台返现"),
    ZJZF("zjzf","诊间支付"),
    MZZF("mzzf","门诊支付"),
    JZZF("jzzf","急诊支付"),
    YFT("yft","医付通"),
    YSFZHZ("ysfzhz","医生分账划转"),
    ZYYJ("zyyj","住院预缴"),
    WZZF("wzzf","问诊支付"),
    SPWZZF("spwzzf","视频问诊支付"),
    BaoXian("bxzf","保险支付订单"),
    CreditHandRepay("xysghk","信用手工还款"),
    CreditAutoRepay("xyzdhk","信用自动还款"),
    AUTOSERVICE("selfs","自助终端支付"),
    SHZZSK("shzzsk","商户转账收款"),
    QDF("qdf","钱大夫首付款"),
    DSK("dsk","代收款"),
    ZYZF("zyzf","住院支付"),
    JZYJ("jzyj","急诊预缴"),
    ZHSPWZ("zhspwz","智慧医院视频问诊支付"),
    ZHCFDD("zhcfdd","智慧医院处方订单支付"),
    TJZF("tjzf","体检支付");

    EPayOrderType(String code, String name) {
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

    public void setName(String name)
    {
        this.name = name;
    }
}
