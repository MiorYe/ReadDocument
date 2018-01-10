package com.weimaipay.listener;

import com.alibaba.fastjson.JSON;
import com.weimaipay.PaySDKException;
import com.weimaipay.authorize.AuthHelper;
import com.weimaipay.authorize.AuthResultInfo;
import com.weimaipay.res.ResponseMessgae;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现观察者模式
 */
public class MsgListenerSupport {

    /**
     * 消息监听者
     */
    private List<MsgListener> msgListeners = new ArrayList<>();

    public void add(MsgListener listener) {
        msgListeners.add(listener);
    }

    public boolean remove(MsgListener listener) {
        return msgListeners.remove(listener);
    }

    /**
     * 收到消息，解析消息，告知对应的观察者
     * @param msgInfo 加密的消息正文
     * @param appPrivateKey 商户私钥
     * @param weimaiPublicKey 微脉公钥
     * @return 通知处理过后的反馈，null 表示没有返回，可以认为处理成功，也可以在 {@code MsgListener} 的实现方法里指定返回
     */
    public ResponseMessgae msgNotify(String msgInfo, String appPrivateKey, String weimaiPublicKey) throws Exception
    {
        AuthResultInfo infoObj = JSON.parseObject(msgInfo, AuthResultInfo.class);
        String msg;
        try
        {
            msg = new AuthHelper(appPrivateKey, weimaiPublicKey).decyrptData(infoObj.getContent(), infoObj.getKey());
        } catch (Exception e)
        {
            throw new PaySDKException("004", "消息解密出错", e);
        }
        ResponseMessgae result = null;
        try
        {
            for (MsgListener msgListener : msgListeners)
            {
                result = msgListener.process(infoObj.getType(), msg);
                if(result!=null)
                {
                    break;
                }
            }
            if (result == null) {
                result = new ResponseMessgae();
                result.setErrorCode("0");
                result.setErrorMsg("没有找到方法或者方法没有返回值");
            }
        } catch (PaySDKException e0) {
            result = new ResponseMessgae();
            result.setErrorMsg(e0.getMsg());
            result.setErrorCode(e0.getCode());
        }
        result.setMethodName(infoObj.getType());
        //加密处理
        if(result.getData()!=null)
        {
            AuthResultInfo authResult=new AuthHelper(appPrivateKey, weimaiPublicKey).encryptData(JSON.toJSONString(result.getData()));
            result.setData(JSON.toJSONString(authResult));
        }
        return result;
    }
}
