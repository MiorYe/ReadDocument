package com.weimaipay.res;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by feng on 2017/9/25.
 */
public class ScoreBeanRecord {
    /**
     * 交易时间（yyyyMMddHHmmss）
     */
    private String transDateTime;
    /**
     * 交易数量
     */
    private Long amount;
    /**
     * 交易方向  1：脉豆增加 2：脉豆减少
     */
    private String direction;
    /**
     * 交易描述
     */
    @JSONField(name="desc")
    private String description;

    public String getTransDateTime() {
        return transDateTime;
    }

    public void setTransDateTime(String transDateTime) {
        this.transDateTime = transDateTime;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
