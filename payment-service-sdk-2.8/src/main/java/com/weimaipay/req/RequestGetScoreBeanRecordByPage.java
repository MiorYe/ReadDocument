package com.weimaipay.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/25.
 */
public class RequestGetScoreBeanRecordByPage extends RequestPersonalBase {
    /**
     * 起始页 必填
     */
    @JSONField(name="start")
    private Integer startPage;
    /**
     *  每页记录数
     */
    @JSONField(name="limit")
    private Integer count;

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
