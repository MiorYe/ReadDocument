package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/26.
 * 创建代金券活动返回
 */
public class ResponseCreateActivity extends BaseResponse {
    /**
     * 活动编号
     */
    private String activityNo;

    /**
     * 客户活动编号
     */
    @JSONField(name = "couponActivityNo")
    private String clientActivityNo;

    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
    }

    public String getClientActivityNo() {
        return clientActivityNo;
    }

    public void setClientActivityNo(String clientActivityNo) {
        this.clientActivityNo = clientActivityNo;
    }
}
