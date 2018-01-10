package com.weimaipay.service;

import com.alibaba.fastjson.JSON;
import com.weimaipay.claims.entity.*;
import com.weimaipay.listener.AbstractPullEventListener;
import com.weimaipay.req.RequestHisBillData;
import com.weimaipay.res.ResponseHisBillData;
import com.weimaipay.res.ResponseMessgae;

import java.util.List;

/**
 * Created by feng on 2017/7/12.
 */
public class MyAbstractPullEventListener extends AbstractPullEventListener {

    @Override
    public  ResponseMessgae<List<PullClinicTreatRecordResponse>> pullClinicTreatRecord(PullClinicTreatRecordRequest request){
        System.out.println("收到门急诊就诊记录查询消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }
    @Override
    public  ResponseMessgae<List<PullHospTreatRecordResponse>> pullHospTreatRecord(PullHospTreatRecordRequest request){
        System.out.println("收到住院登记查询消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }
    @Override
    public  ResponseMessgae<List<PullClinicRecipeInfoResponse>> pullClinicRecipeInfo(PullClinicRecipeInfoRequest request){
        System.out.println("收到门急诊处方查询消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }
    @Override
    public  ResponseMessgae<List<PullHospRecipeInfoResponse>> pullHospRecipeInfo(PullHospRecipeInfoRequest request){
        System.out.println("收到住院医嘱查询消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }
    @Override
    public  ResponseMessgae<List<PullClinicSettleInfoResponse>> pullClinicSettleInfo(PullClinicSettleInfoRequest request){
        System.out.println("收到门急诊结算费用查询消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }
    @Override
    public  ResponseMessgae<List<PullHospSettleInfoResponse>> pullHospSettleInfo(PullHospSettleInfoRequest request){
        System.out.println("收到住院结算费用查询消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }
    @Override
    public  ResponseMessgae<PullClinicMedicalRecordResponse> pullClinicMedicalRecord(PullClinicMedicalRecordRequest request){
        System.out.println("收到门急诊病历信息查询消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }
    @Override
    public  ResponseMessgae<PullHospMedicalRecordResponse> pullHospMedicalRecord(PullHospMedicalRecordRequest request){
        System.out.println("收到住院病历信息查询消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }
    @Override
    public  ResponseMessgae<List<PullCheckInfoResponse>> pullCheckInfo(PullCheckInfoRequest request){
        System.out.println("收到获取检查检验信息消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }

    @Override
    public ResponseMessgae<PullHospDailySettleInfoResponse> pullHospDailySettleInfo(PullHospDailySettleInfoRequest request)
    {
        System.out.println("收到住院每日清单消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }
    @Override
    public ResponseMessgae<HospAuthCodeResponse> GetHospAuthCode(HospAuthCodeRequest request)
    {
        System.out.println("收到获取院内授权码申请消息：" + JSON.toJSONString(request));
        ResponseMessgae  responseMessgae = new ResponseMessgae();
        return responseMessgae;
    }
}
