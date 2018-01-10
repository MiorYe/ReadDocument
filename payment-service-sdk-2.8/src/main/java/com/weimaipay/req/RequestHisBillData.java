package com.weimaipay.req;

/**
 * Created by feng on 2017/10/13.
 */
public class RequestHisBillData {
    /**
     * 机构编号
     */
    private Long merchantUserId;
    /**
     * 起始时间，14位日期格式(yyyyMMddhhmmss)
     */
    private String startTime;
    /**
     * 终止时间，14位日期格式(yyyyMMddhhmmss)
     */
    private String endTime;

    public Long getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(Long merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
