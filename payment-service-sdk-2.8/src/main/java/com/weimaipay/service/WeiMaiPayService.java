package com.weimaipay.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.weimaipay.PaySDKException;
import com.weimaipay.authorize.AuthHelper;
import com.weimaipay.authorize.AuthResultInfo;
import com.weimaipay.authorize.RSA;
import com.weimaipay.authorize.WebAuthHelper;
import com.weimaipay.constant.API;
import com.weimaipay.http.BaseHttpInvoker;
import com.weimaipay.http.HttpInvoker;
import com.weimaipay.listener.MsgListener;
import com.weimaipay.listener.MsgListenerSupport;
import com.weimaipay.req.*;
import com.weimaipay.res.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**<h1> 微脉支付API服务2.0版本 </h1>
 * <p>
 * <b>描述：</b>
 *        提供支付，退款，查询等接口
 * </p>
 * @author   七星草 求是同创网络科技有限公司
 * @version  2.0   2017年05月11日 星期四 上午 11点49分34秒
 */
public class WeiMaiPayService {

    private final static String charset = "utf-8";

    private Logger LOGGER = LoggerFactory.getLogger(WeiMaiPayService.class);

    private HttpInvoker invoker;

    private String weimaipayPublicKey;

    private String appPrivateKey;

    private String appId;

    private String serviceURL;

    private MsgListenerSupport support = new MsgListenerSupport();
    /**
     * 一般构造方法
     * @param weimaipayPublicKey 微脉支付公钥
     * @param appPrivateKey 商户私钥
     * @param appId 应用ID
     * @param serviceURL 接口地址
     */
    public WeiMaiPayService(String weimaipayPublicKey, String appPrivateKey, String appId, String serviceURL) {
        this.weimaipayPublicKey = weimaipayPublicKey;
        this.appPrivateKey = appPrivateKey;
        this.appId = appId;
        this.serviceURL = serviceURL;
        this.invoker = new BaseHttpInvoker();
        LOGGER.info("using default service HttpInvoker:" + invoker.getClass().getCanonicalName());
        LOGGER.info("WeiMaiPayService ready for APP " + appId);
    }

    /**
     * 自定义接口调用器的构造方法
     * @param weimaipayPublicKey 微脉支付公钥
     * @param appPrivateKey 商户私钥
     * @param appId 应用ID
     * @param serviceURL 接口地址
     * @param invoker 自定义的接口调用器
     */
    public WeiMaiPayService(String weimaipayPublicKey, String appPrivateKey, String appId, String serviceURL, HttpInvoker invoker) {
        this.weimaipayPublicKey = weimaipayPublicKey;
        this.appPrivateKey = appPrivateKey;
        this.appId = appId;
        this.serviceURL = serviceURL;
        this.invoker = invoker;
        LOGGER.info("using user-defined service HttpInvoker:" + invoker.getClass().getCanonicalName());
        LOGGER.info("WeiMaiPayService ready for APP " + appId);
    }
    public String toJsonString(RequestMobileWebPay request)
    {
        try {
            Map<String,Object> payMap= JSONObject.parseObject(JSON.toJSONString(request), new TypeReference<Map<String, Object>>(){});
            String content=WebAuthHelper.createLinkString(WebAuthHelper.paraFilter(payMap));
            request.setSign(RSA.sign(content, this.appPrivateKey));
        } catch (Exception e) {
            throw new PaySDKException("004", "对象转化为Json错误");
        }
        return JSON.toJSONString(request, SerializerFeature.WriteMapNullValue);
    }

    /**
     * 获取支付二维码地址
     * @param requestGetQrCodeInfo 支付请求
     * @return 包含支付地址的实体
     */
    public ResponseGetQrCodeInfo getQrCodeInfo(RequestGetQrCodeInfo requestGetQrCodeInfo) {
        ResponseGetQrCodeInfo responseGetQrCodeInfo = new ResponseGetQrCodeInfo();
        ResponseGetQrCodeInfoInner responseGetQrCodeInfoInner;
        //开始时间
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String strDate = dateFormat.format(date);
        //支付请求日志
        LOGGER.info("getqrcode1: " + strDate + JSON.toJSONString(requestGetQrCodeInfo));
        //获取创建支付订单信息
        String result = invoker.invoke(requestGetQrCodeInfo, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.CREATE_PAY_ORDER);
        //结束时间
        date = new Date();
        strDate = dateFormat.format(date);
        //支付请求返回结果日志
        LOGGER.info("getqrcode2: " + strDate + JSON.toJSONString(requestGetQrCodeInfo));
        responseGetQrCodeInfoInner = JSON.parseObject(result, ResponseGetQrCodeInfoInner.class);
        if(responseGetQrCodeInfoInner.getPayOrderNo() != null) {
            responseGetQrCodeInfo.setQrCodeInfo(serviceURL + "/cashier/weimaipay?payOrderNo=" + responseGetQrCodeInfoInner.getPayOrderNo());
            if(responseGetQrCodeInfoInner.getQrCodeInfo()!=null && responseGetQrCodeInfoInner.getQrCodeInfo().trim()!="")
            {
                responseGetQrCodeInfo.setQrCodeInfo(responseGetQrCodeInfoInner.getQrCodeInfo());
            }
            responseGetQrCodeInfo.setOrderId(responseGetQrCodeInfoInner.getOrderId());
            responseGetQrCodeInfo.setPayeeId(responseGetQrCodeInfoInner.getPayeeId());
            responseGetQrCodeInfo.setOutPayeeId(responseGetQrCodeInfoInner.getOutPayeeId());
            responseGetQrCodeInfo.setPayOrderName(responseGetQrCodeInfoInner.getPayOrderName());
            responseGetQrCodeInfo.setPayOrderNo(responseGetQrCodeInfoInner.getPayOrderNo());
            responseGetQrCodeInfo.setPayOrderAmount(responseGetQrCodeInfoInner.getPayOrderAmount());
            responseGetQrCodeInfo.setPayeeName(responseGetQrCodeInfoInner.getPayeeName());
        }
        responseGetQrCodeInfo.setResultCode(responseGetQrCodeInfoInner.getResultCode());
        responseGetQrCodeInfo.setResultMsg(responseGetQrCodeInfoInner.getResultMsg());
        return responseGetQrCodeInfo;
    }
    /**
     * 扫码枪支付
     * @param request
     * @return
     */
    public ResponseCreatePayOrderAndPayment createPayOrderAndPayment(RequestCreatePayOrderAndPayment request){

        ResponseCreatePayOrderAndPayment response;
        String result = invoker.invoke1(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.CREATE_ORDER_AND_PAY);
        response = JSON.parseObject(result, ResponseCreatePayOrderAndPayment.class);
        return response;
    }
    /**
     * 创建注册用户账户
     * @param request
     * @return
     */
    public ResponseRegisteUser registeUser(RequestRegisteUser request){

        ResponseRegisteUser response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.CREATE_PAY_USER);
        response = JSON.parseObject(result, ResponseRegisteUser.class);
        return response;
    }
    /**
     * 创建注册商户账户
     * @param request
     * @return
     */
    public ResponseCreatePayMerchant createPayMerchant(RequestCreatePayMerchant request){

        ResponseCreatePayMerchant response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.PARTNER_REGISTER);
        response = JSON.parseObject(result, ResponseCreatePayMerchant.class);
        return response;
    }
    /**
     * 订单支付状态查询
     * @param request 请求
     * @return 订单支付状态，已支付、待支付、已取消、已退款、订单不存在
     */
    public ResponseOrderPaymet queryOrderPayment(RequestOrderPaymet request) {
        ResponseOrderPaymet response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.GET_PAY_ORDER_PAYMENT);
        response = JSON.parseObject(result, ResponseOrderPaymet.class);
        return response;
    }

    /**
     * 取消订单
     * @param request 取消请求
     * @return 取消是否成功，取消状态
     */
    public ResponseCancelOrder cancelPayOrder(RequestCancelOrder request) {
        ResponseCancelOrder response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.CANCEL_PAY_ORDER);
        response = JSON.parseObject(result, ResponseCancelOrder.class);
        return response;
    }
    /**
     * 撤销订单
     * @param request 撤销请求
     * @return 撤销是否成功，撤销状态
     */
    public ResponseCancelOrder revokePayOrder(RequestCancelOrder request) {
        ResponseCancelOrder response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.REVOKE_PAY_ORDER);
        response = JSON.parseObject(result, ResponseCancelOrder.class);
        return response;
    }

    /**
     * 退款
     * @param request 退款请求
     */
    public ResponseRefundOrder doOrderRefund(RequestRefundPayOrder request) {
        ResponseRefundOrder responseRefundOrder;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.REFUND_PAY_ORDER);
        responseRefundOrder = JSON.parseObject(result, ResponseRefundOrder.class);
        return responseRefundOrder;
    }

    /**
     * 退款记录查询
     * @param request 退款查询请求，需要填入退款单号
     * @return 退款金额，退款状态等
     */
    public ResponseRefundOrderQuery doOrderRefundQuery(RequestRefundOrderQuery request) {
        ResponseRefundOrderQuery responseRefundOrderQuery;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.GET_REFUND_ORDER);
        responseRefundOrderQuery = JSON.parseObject(result, ResponseRefundOrderQuery.class);
        return responseRefundOrderQuery;
    }

    /**
     * 获取对账信息
     * @param request 获取账单请求
     * @return CSV账单
     */
    public ResponseQueryBill queryBill(RequesQueryBill request){
        ResponseQueryBill response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.GET_Bill_BY_DAY);
        response = JSON.parseObject(result, ResponseQueryBill.class);

        return response;
    }

    /**
     * 院内授权码申请回调
     * @return
     */
    public ResponseAuthInfo hospAuthCodeCallback(RequestAuthInfo request){

        ResponseAuthInfo response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.AUTH_CODE_CALLBACK);
        response = JSON.parseObject(result, ResponseAuthInfo.class);
        return response;
    }
    /**
     * 增加脉豆
     * @param request 增加脉豆的账户，原因，数量等
     * @return 增加脉豆的账户，数量，业务单号等
     */
    public ResponseIncreaseScoreBean increaseScoreBean(RequestIncreaseScoreBean request) {
        ResponseIncreaseScoreBean responseIncreaseScoreBean;
        //默认新增
        request.setSeqFlag("2");
        //默认划转通道
        request.setTransferChannel("10");
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.TRANSFER_SCORE_BEAN);
        responseIncreaseScoreBean = JSON.parseObject(result, ResponseIncreaseScoreBean.class);
        return responseIncreaseScoreBean;
    }
    /**
     * 扣除脉豆
     * @param request 扣除脉豆的账户，原因，数量等
     * @return 扣除脉豆的账户，数量，业务单号等
     */
    public ResponseDecreaseScoreBean decreaseScoreBean(RequestDecreaseScoreBean request) {
        ResponseDecreaseScoreBean responseDecreaseScoreBean;
        //默认减少
        request.setSeqFlag("1");
        //默认划转通道
        request.setTransferChannel("10");
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.TRANSFER_SCORE_BEAN);
        responseDecreaseScoreBean = JSON.parseObject(result, ResponseDecreaseScoreBean.class);
        return responseDecreaseScoreBean;
    }
    /**
     * 获取支付账户信息
     * @param request 外部账户编号，支付账户编号
     * @return 账户基本信息
     */
    public ResponseGetPayAccountInfo getPayAccountInfo(RequestGetPayAccountInfo request) {
        ResponseGetPayAccountInfo responseGetPayAccountInfo;
        String result = invoker.invoke1(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.GET_PAY_ACCOUNT_INFO);
        responseGetPayAccountInfo = JSON.parseObject(result, ResponseGetPayAccountInfo.class);
        return responseGetPayAccountInfo;
    }
    /**
     * 升级支付账户请求
     * @param request 账户，姓名，身份证等
     * @return 账户
     */
    public ResponseUpgradePayAccount getUpgradePayAccount(RequestUpgradePayAccount request) {
        ResponseUpgradePayAccount responseUpgradePayAccount;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.USER_PROMOTE);
        responseUpgradePayAccount = JSON.parseObject(result, ResponseUpgradePayAccount.class);
        return responseUpgradePayAccount;
    }
    /**
     * 获取token
     * @param request 账户,登陆失效时间等
     * @return token
     */
    public ResponseToken getToken(RequestToken request) {
        ResponseToken responseToken;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.GET_TOKEN);
        responseToken = JSON.parseObject(result, ResponseToken.class);
        return responseToken;
    }
    /**
     * 分页获取脉豆记录
     * @param request 外部账户编号，支付账户编号
     * @return 账户基本信息
     */
    public ResponseGetScoreBeanRecordByPage getScoreBeanRecordByPage(RequestGetScoreBeanRecordByPage request) {
        ResponseGetScoreBeanRecordByPage responseGetScoreBeanRecordByPage;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.GET_BEAN_RECORD);
        responseGetScoreBeanRecordByPage = JSON.parseObject(result, ResponseGetScoreBeanRecordByPage.class);
        return responseGetScoreBeanRecordByPage;
    }
    /**
     * 创建代金券活动
     * @param request
     * @return
     */
    public ResponseCreateActivity createActivity(RequestCreateActivity request){

        ResponseCreateActivity response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.CREATE_ACTIVITY);
        response = JSON.parseObject(result, ResponseCreateActivity.class);
        return response;
    }
    /**
     * 更新代金券活动
     * @param request
     * @return
     */
    public ResponseUpdateActivity updateActivity(RequestUpdateActivity request){

        ResponseUpdateActivity response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.UPDATE_ACTIVITY);
        response = JSON.parseObject(result, ResponseUpdateActivity.class);
        return response;
    }
    /**
     * 活动添加代金券
     * @param request
     * @return
     */
    public ResponseAddActivityCoupon addActivityCoupony(RequestAddActivityCoupon request){

        ResponseAddActivityCoupon response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.ADD_ACTIVITY_COUPON);
        response = JSON.parseObject(result, ResponseAddActivityCoupon.class);
        return response;
    }
    /**
     * 更新活动代金券
     * @param request
     * @return
     */
    public ResponseUpdateActivityCoupon updateActivityCoupon(RequestUpdateActivityCoupon request){

        ResponseUpdateActivityCoupon response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.UPDATE_ACTIVITY_COUPON);
        response = JSON.parseObject(result, ResponseUpdateActivityCoupon.class);
        return response;
    }
    /**
     * 领取代金券
     * @param request
     * @return
     */
    public ResponseGetCoupon getCoupon(RequestGetCoupon request){

        ResponseGetCoupon response;
        String result = invoker.invoke(request, weimaipayPublicKey, appPrivateKey, appId, serviceURL + API.GET_COUPON);
        response = JSON.parseObject(result, ResponseGetCoupon.class);
        return response;
    }
    /**
     * 添加消息/事件监听器
     * @param listener 监听器
     */
    public void add(MsgListener listener) {
        support.add(listener);
    }

    public boolean remove(MsgListener listener) {
        return support.remove(listener);
    }

    /**
     * 消息通知入口方法，接收到服务端发送的密文，可以调用此方法触发对应的消息处理方法
     * @param msgInfo 消息密文
     * @return 消息回文
     */
    public ResponseMessgae msgNotify(String msgInfo) throws Exception {
        return support.msgNotify(msgInfo, appPrivateKey, weimaipayPublicKey);
    }

    public ResponseMessgae msgNotify(String msgInfo, String privateKey, String publicKey) throws Exception {
        return support.msgNotify(msgInfo, privateKey, publicKey);
    }
}
