package com.weimaipay.constant;

/**
 * 接口地址常量
 *
 * @author 七星草    杭州求是同创网络科技有限公司
 * @version 2.0     2017年05月15日  16点02分
 */
public class API {

    /**
     * 支付订单创建
     */
    public static final String CREATE_PAY_ORDER = "/api/trade/pay/create";

    /**
     * 创建支付订单并付款
     */
    public static String CREATE_ORDER_AND_PAY = "/api/trade/pay/direct";

    /**
     * 订单退款
     */
    public static final String REFUND_PAY_ORDER = "/api/trade/refund";

    /**
     * 退款订单查询
     */
    public static final String GET_REFUND_ORDER = "/api/trade/refund/query";

    /**
     * 取消订单
     */
    public static final String CANCEL_PAY_ORDER = "/api/trade/pay/cancel";

    /**
     * 撤销订单
     */
    public static final String REVOKE_PAY_ORDER = "/api/trade/barpay/cancel";

    /**
     * 查询支付订单信息
     */
    public static final String GET_PAY_ORDER_PAYMENT = "/api/trade/pay/query";

    /**
     * 获取某天用户账户账单csv记录
     */
    public static final String GET_Bill_BY_DAY = "/api/trade/down";

    /**
     * 创建用户金融账户
     */
    public static String CREATE_PAY_USER = "/api/user/register";
    /**
     * 获取院内授权码
     */
    public static String AUTH_CODE_CALLBACK = "/medical/callback_hosp_auth_info";
    /**
     * 脉豆划转，新增，减少
     */
    public static String TRANSFER_SCORE_BEAN = "/api/user/bean/transfer";
    /**
     * 脉豆划转，新增，减少
     */
    public static String GET_PAY_ACCOUNT_INFO = "/api/user/fund/get";
    /**
     * 获取脉豆交易记录
     */
    public static String GET_BEAN_RECORD = "/api/user/bean/page";
    /**
     * 支付账户开户
     */
    public static String USER_PROMOTE = "/api/user/promote";
    /**
     * 获取token
     */
    public static String GET_TOKEN = "/api/token/get";
    /**
     * 商户注册
     */
    public static String PARTNER_REGISTER = "/api/partner/register";
    /**
     * 创建代金券活动
     */
    public static String CREATE_ACTIVITY = "/api/trade/coupon/activity";
    /**
     * 更新优惠券活动
     */
    public static String UPDATE_ACTIVITY = "/api/trade/coupon/updateact";
    /**
     * 添加活动下的代金券
     */
    public static String ADD_ACTIVITY_COUPON = "/api/trade/coupon/batch";
    /**
     * 更新活动内的优惠券
     */
    public static String UPDATE_ACTIVITY_COUPON = "/api/trade/coupon/updatebatch";
    /**
     * 领用代金券
     */
    public static String GET_COUPON = "/api/trade/coupon/get";
}
