package com.weimaipay.res;

public class BaseResponse {

    public BaseResponse() {
        this.resultCode = "0000";
        this.resultMsg = "调用成功";
    }

    private String resultCode;

    private String resultMsg;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Boolean getResultStatus() {
        if(this.resultCode=="0000")
            return true;
        else
            return false;
    }
}
