package com.weimaipay.res;

public class ResponseMessgae<T>
{
    private String errorCode;

    private String errorMsg;

    private String methodName;

    private T data;

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getErrorMsg()
    {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg)
    {
        this.errorMsg = errorMsg;
    }

    public String getMethodName()
    {
        return methodName;
    }

    public void setMethodName(String methodName)
    {
        this.methodName = methodName;
    }

    public  T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

}
