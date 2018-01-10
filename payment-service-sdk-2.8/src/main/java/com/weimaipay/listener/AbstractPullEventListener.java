package com.weimaipay.listener;

import com.alibaba.fastjson.JSON;
import com.weimaipay.claims.entity.*;
import com.weimaipay.req.RequestHisBillData;
import com.weimaipay.res.ResponseHisBillData;
import com.weimaipay.res.ResponseMessgae;
import java.util.List;

public abstract class AbstractPullEventListener implements MsgListener
{
    @Override
    public ResponseMessgae process(String methodName, String requestStr) throws Exception
    {
        ResponseMessgae result = null;
        if(methodName.equals("pull_clinic_treat_record"))
        {
            result=pullClinicTreatRecord(JSON.parseObject(requestStr, PullClinicTreatRecordRequest.class));
        }
        else if(methodName.equals("pull_hosp_treat_record"))
        {
            result=pullHospTreatRecord(JSON.parseObject(requestStr, PullHospTreatRecordRequest.class));
        }
        else if(methodName.equals("pull_clinic_recipe_info"))
        {
            result=pullClinicRecipeInfo(JSON.parseObject(requestStr, PullClinicRecipeInfoRequest.class));
        }
        else if(methodName.equals("pull_hosp_recipe_info"))
        {
            result=pullHospRecipeInfo(JSON.parseObject(requestStr, PullHospRecipeInfoRequest.class));
        }
        else if(methodName.equals("pull_hosp_settle_Info"))
        {
            result=pullHospSettleInfo(JSON.parseObject(requestStr, PullHospSettleInfoRequest.class));
        }
        else if(methodName.equals("pull_clinic_settle_Info"))
        {
            result=pullClinicSettleInfo(JSON.parseObject(requestStr, PullClinicSettleInfoRequest.class));
        }
        else if(methodName.equals("pull_clinic_medical_record"))
        {
            result=pullClinicMedicalRecord(JSON.parseObject(requestStr, PullClinicMedicalRecordRequest.class));
        }
        else if(methodName.equals("pull_hosp_medical_record"))
        {
            result=pullHospMedicalRecord(JSON.parseObject(requestStr, PullHospMedicalRecordRequest.class));
        }
        else if(methodName.equals("pull_check_info"))
        {
            result=pullCheckInfo(JSON.parseObject(requestStr, PullCheckInfoRequest.class));
        }
        else if(methodName.equals("pull_hosp_daily_settle_info"))
        {
            result=pullHospDailySettleInfo(JSON.parseObject(requestStr, PullHospDailySettleInfoRequest.class));
        }
        else if(methodName.equals("req_hosp_auth_code"))
        {
            result=GetHospAuthCode(JSON.parseObject(requestStr, HospAuthCodeRequest.class));
        }
        return result;
    }

    public abstract ResponseMessgae<List<PullClinicTreatRecordResponse>> pullClinicTreatRecord(PullClinicTreatRecordRequest request) throws Exception;

    public abstract ResponseMessgae<List<PullHospTreatRecordResponse>> pullHospTreatRecord(PullHospTreatRecordRequest request) throws Exception;

    public abstract ResponseMessgae<List<PullClinicRecipeInfoResponse>> pullClinicRecipeInfo(PullClinicRecipeInfoRequest request) throws Exception;

    public abstract ResponseMessgae<List<PullHospRecipeInfoResponse>> pullHospRecipeInfo(PullHospRecipeInfoRequest request) throws Exception;

    public abstract ResponseMessgae<List<PullHospSettleInfoResponse>> pullHospSettleInfo(PullHospSettleInfoRequest request) throws Exception;

    public abstract ResponseMessgae<List<PullClinicSettleInfoResponse>> pullClinicSettleInfo(PullClinicSettleInfoRequest request) throws Exception;

    public abstract ResponseMessgae<PullClinicMedicalRecordResponse> pullClinicMedicalRecord(PullClinicMedicalRecordRequest request) throws Exception;

    public abstract ResponseMessgae<PullHospMedicalRecordResponse> pullHospMedicalRecord(PullHospMedicalRecordRequest request) throws Exception;

    public abstract ResponseMessgae<List<PullCheckInfoResponse>> pullCheckInfo(PullCheckInfoRequest request) throws Exception;

    public abstract ResponseMessgae<PullHospDailySettleInfoResponse> pullHospDailySettleInfo(PullHospDailySettleInfoRequest request) throws Exception;

    public abstract ResponseMessgae<HospAuthCodeResponse> GetHospAuthCode(HospAuthCodeRequest request) throws Exception;
}
