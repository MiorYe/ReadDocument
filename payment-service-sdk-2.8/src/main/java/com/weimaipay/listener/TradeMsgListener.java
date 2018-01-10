package com.weimaipay.listener;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.weimaipay.PaySDKException;
import com.weimaipay.bill.ParseTradeData;
import com.weimaipay.bill.TradeDataInfo;
import com.weimaipay.bill.UnionPayCheck;
import com.weimaipay.res.*;
import com.weimaipay.req.RequestHisBillData;

import java.util.List;

public abstract class TradeMsgListener<T> implements MsgListener {

    private T context;

    public void setContext(T context) {
        this.context = context;
    }

    /**
     * 根据消息类型的不同来选择不同的方法处理
     *
     * @param msgType 消息类型
     * @param msg     消息正文
     */
    @Override
    public ResponseMessgae process(String msgType, String msg) {
        if ("pay.success".equals(msgType)) {
            return onPay(context, JSON.parseObject(msg, PayMessage.class));
        }
        if ("refund.success".equals(msgType)) {
            return onRefund(context, JSON.parseObject(msg, RefundMessage.class));
        }
        if ("pull.bill".equals(msgType)) {
            return pullBill(context, JSON.parseObject(msg, PullBillMessage.class));
        }
        if ("his.bill".equals(msgType)) {
            return getHisBillData(JSON.parseObject(msg, RequestHisBillData.class));
        }
        if ("ftp.bill".equals(msgType)) {
            return pullFtpBill(context, JSON.parseObject(msg, PullBillMessage.class));
        }
        return null;
    }

    public ResponseMessgae onPay(T context, PayMessage message) {
        throw new PaySDKException("009", "onPay 方法未实现");
    }

    public ResponseMessgae onRefund(T context, RefundMessage message) {
        throw new PaySDKException("009", "onRefund 方法未实现");
    }

    public ResponseMessgae<List<ResponseHisBillData>> getHisBillData(RequestHisBillData request) {
        throw new PaySDKException("009", "getHisBill 方法未实现");
    }

    /**
     * 拉取对账单
     */
    public ResponseMessgae<List<TradeDataInfo>> pullBill(T context, PullBillMessage message) {
        ResponseMessgae<List<TradeDataInfo>> returnMsg = new ResponseMessgae<>();
        String appName = message.getAppName();
        if (!checkReqInfo(appName)) {
            returnMsg.setErrorMsg("app_name为空");
            return returnMsg;
        }
        String startTime = message.getStartTime();
        if (!checkReqInfo(startTime)) {
            returnMsg.setErrorMsg("start_time为空");
            return returnMsg;
        }
        String endTime = message.getEndTime();
        if (!checkReqInfo(endTime)) {
            returnMsg.setErrorMsg("end_time为空");
            return returnMsg;
        }
        try {
            returnMsg.setData(ParseTradeData.parseData(appName, startTime,
                    endTime, message.getDataSourceType(),
                    message.getDataSourcePara()));
        } catch (PaySDKException e) {
            returnMsg.setErrorCode(e.getCode());
            returnMsg.setErrorMsg(e.getMessage());
        } catch (Exception e) {
            returnMsg.setErrorMsg(e.getMessage());
        }
        return returnMsg;
    }

    /**
     * ftp拉取对账单
     */
    public ResponseMessgae<List<UnionPayCheck>> pullFtpBill(T context, PullBillMessage message) {
        ResponseMessgae<List<UnionPayCheck>> returnMsg = new ResponseMessgae<>();
        String startTime = message.getStartTime();
        if (!checkReqInfo(startTime)) {
            returnMsg.setErrorMsg("startTime为空");
            return returnMsg;
        }
        String endTime = message.getEndTime();
        if (!checkReqInfo(endTime)) {
            returnMsg.setErrorMsg("endTime为空");
            return returnMsg;
        }
        String ftpIp = message.getFtpIp();
        if (!checkReqInfo(ftpIp)) {
            returnMsg.setErrorMsg("ftpIp为空");
            return returnMsg;
        }
        String ftpUser = message.getFtpUser();
        if (!checkReqInfo(ftpUser)) {
            returnMsg.setErrorMsg("ftpUser为空");
            return returnMsg;
        }
        String ftpPwd = message.getFtpPwd();
        if (!checkReqInfo(ftpPwd)) {
            returnMsg.setErrorMsg("ftpPwd为空");
            return returnMsg;
        }
        String filesPath = message.getFtpFilePath();
        if (!checkReqInfo(filesPath)) {
            returnMsg.setErrorMsg("filesPath为空");
            return returnMsg;
        }
        // FTP端口
        Integer ftpPort = message.getFtpPort();
        if (ftpPort == null) {
            ftpPort = 21;
        }
        try {
            returnMsg.setData(ParseTradeData.pullFtpFile(startTime, endTime, ftpIp, ftpPort, ftpUser, ftpPwd, filesPath));
        } catch (PaySDKException e) {
            returnMsg.setErrorCode(e.getCode());
            returnMsg.setErrorMsg(e.getMessage());
        } catch (Exception e) {
            returnMsg.setErrorMsg(e.getMessage());
        }
        return returnMsg;
    }

    /**
     * 拉取账单参数校验
     *
     * @param reqInfo
     * @return
     */
    private boolean checkReqInfo(String reqInfo) {
        if (reqInfo == null || reqInfo == "" || reqInfo.length() == 0) {
            return false;
        }
        return true;
    }
}
