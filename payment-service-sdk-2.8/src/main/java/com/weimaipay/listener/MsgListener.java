package com.weimaipay.listener;

import com.weimaipay.res.ResponseMessgae;

public interface MsgListener {

    /**
     * 当前监听者类型，框架会比对类型来选择不同的监听器来处理消息
     * @param msgType 消息类型
     * @param msg 消息体
     */
    ResponseMessgae process(String msgType, String msg) throws Exception;

}
