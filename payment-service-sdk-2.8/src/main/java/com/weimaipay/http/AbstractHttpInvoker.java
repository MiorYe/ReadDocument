package com.weimaipay.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.weimaipay.PaySDKException;
import com.weimaipay.authorize.AuthHelper;
import com.weimaipay.authorize.AuthResultInfo;
import com.weimaipay.req.RequestPersonalBase;
import com.weimaipay.res.ResponseRegisteUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 如果要实现自定义的调用器，则自定义的调用器
 * 可以继承这个类，这样的话可以不用重写invoke
 * 而只需要实现 doPost方法的逻辑就行。
 *
 * @author 七星草    杭州求是同创网络科技有限公司
 * @version 2.0     2017年03月29日  16点00分
 */
public abstract class AbstractHttpInvoker implements HttpInvoker {

    private final static String charset = "UTF-8";
    private Logger LOGGER = LoggerFactory.getLogger(AbstractHttpInvoker.class);

    /**
     * 一般接口业务实现
     * @param object
     * @param weimaiPublicKey 微脉支付公钥
     * @param appPrivateKey 商户私钥
     * @param appId 应用ID 需要平台存在对应的，完整的，正确的配置
     * @param invokeUrl 完整的接口地址
     * @return
     */
    public String invoke(Object object, String weimaiPublicKey, String appPrivateKey, String appId, String invokeUrl) {
        //生成JsonStr
        String JsonStr = JSON.toJSONString(object);
        LOGGER.info("invoke service [" + invokeUrl + "] request:" + JsonStr);
        //根据公钥私钥加密
        AuthHelper au = new AuthHelper(appPrivateKey, weimaiPublicKey);
        AuthResultInfo authResultInfo = au.encryptData(JsonStr);
        String realData;
        Map<String, String> postReq = new HashMap<>();
        postReq.put("content", authResultInfo.getContent());
        postReq.put("sign",authResultInfo.getSign());
        postReq.put("key", authResultInfo.getKey());
        String encAppId;
        try
        {
            encAppId = AuthHelper.getEncAppId(appId, weimaiPublicKey);
        } catch (Exception e)
        {
            throw new PaySDKException("002", "加密 appId 出错，请检查weimaiPublicKey是否正确");
        }
        postReq.put("appId", encAppId);
        String result = doPost(invokeUrl, postReq, charset);
        if (result != null && result.trim().length() > 0) {
            JSONObject jsonObj = JSON.parseObject(result);
            if (jsonObj.get("success").toString().equals("true")) {
                String data = jsonObj.get("data").toString();
                JSONObject dataObj = JSON.parseObject(data);
                String content = dataObj.get("content").toString();
                String sign = dataObj.get("sign").toString();
                String key = dataObj.get("key").toString();
                try {
                    realData = au.decyrptData(content, sign, key);
                    LOGGER.info("response:" + realData);
                } catch (Exception e) {
                    throw new PaySDKException("003", "解密响应信息出错，请检查密钥是否配置正确");
                }
            } else {
                LOGGER.info("response:" + result);
                //realData = "{\"resultCode\":\""+ ("".equals(jsonObj.getString("errorNo")) ? "1111" : jsonObj.getString("errorNo")) +"\",\"resultMsg\":\"发生系统异常，" + jsonObj.getString("msg") + "\"}";
                realData = "{\"resultCode\":\""+ ("".equals(jsonObj.getString("errorNo")) ? "1111" : jsonObj.getString("errorNo")) +"\",\"resultMsg\":\"" + jsonObj.getString("msg") + "\"}";
            }
        } else {
            realData = "{\"resultCode\":\"1111\",\"resultMsg\":\"网络异常，没有收到HTTP的返回数据\"}";
        }
        return realData;
    }

    /**
     * 交易相关接口调用
     * @param object
     * @param weimaiPublicKey
     * @param appPrivateKey
     * @param appId
     * @param invokeUrl
     * @return
     */
    public String invoke1(Object object, String weimaiPublicKey, String appPrivateKey, String appId, String invokeUrl) {
        //生成JsonStr
        String JsonStr = JSON.toJSONString(object);
        LOGGER.info("invoke service [" + invokeUrl + "] request:" + JsonStr);
        //根据公钥私钥加密
        AuthHelper au = new AuthHelper(appPrivateKey, weimaiPublicKey);
        AuthResultInfo authResultInfo = au.encryptData(JsonStr);
        String realData;
        Map<String, String> postReq = new HashMap<>();
        postReq.put("content", authResultInfo.getContent());
        postReq.put("sign",authResultInfo.getSign());
        postReq.put("key", authResultInfo.getKey());
        String encAppId;
        RequestPersonalBase personalBase=JSON.parseObject(JsonStr, RequestPersonalBase.class);
        String encPayId;
        String encWMUserId;
        try
        {
            encAppId = AuthHelper.getEncAppId(appId, weimaiPublicKey);
            encPayId = au.encryptData(personalBase.getPayId(), authResultInfo.getPlainKey());
            encWMUserId = au.encryptData(personalBase.getClientUserId(), authResultInfo.getPlainKey());
        } catch (Exception e)
        {
            throw new PaySDKException("002", e.getMessage()+ "加密 appId,payid,wmUserId 出错，请检查weimaiPublicKey是否正确");
        }
        postReq.put("appId", encAppId);
        postReq.put("payId",encPayId);
        postReq.put("wmUserId",encWMUserId);
        String result = doPost(invokeUrl, postReq, charset);
        if (result != null && result.trim().length() > 0) {
            JSONObject jsonObj = JSON.parseObject(result);
            if (jsonObj.get("success").toString().equals("true")) {
                String data = jsonObj.get("data").toString();
                JSONObject dataObj = JSON.parseObject(data);
                String content = dataObj.get("content").toString();
                String sign = dataObj.get("sign").toString();
                String key = dataObj.get("key").toString();
                try {
                    realData = au.decyrptData(content, sign, key);
                    LOGGER.info("response:" + realData);
                } catch (Exception e) {
                    throw new PaySDKException("003", "解密响应信息出错，请检查密钥是否配置正确");
                }
            } else {
                LOGGER.info("response:" + result);
                //realData = "{\"resultCode\":\""+ ("".equals(jsonObj.getString("errorNo")) ? "1111" : jsonObj.getString("errorNo")) +"\",\"resultMsg\":\"发生系统异常，" + jsonObj.getString("msg") + "\"}";
                realData = "{\"resultCode\":\""+ ("".equals(jsonObj.getString("errorNo")) ? "1111" : jsonObj.getString("errorNo")) +"\",\"resultMsg\":\"" + jsonObj.getString("msg") + "\"}";
            }
        } else {
            realData = "{\"resultCode\":\"1111\",\"resultMsg\":\"网络异常，没有收到HTTP的返回数据\"}";
        }
        return realData;
    }

}
