package com.weimaipay.req;

/**
 * 普通用户注册
 */
public class RequestRegisteUser {
    //手机号码
    private String mobile;

    /**
     * 注册用户的IP
     */
    private String registerIp;

    /**
     * 昵称
     */
    private String userName;

    //@NotBlank(message = "微脉唯一编号不能为空。")
    private String weMayId;
    private String registerDeviceInfo;

    private String birthday;

    public String getRegisterDeviceInfo() {
        return registerDeviceInfo;
    }

    public void setRegisterDeviceInfo(String registerDeviceInfo) {
        this.registerDeviceInfo = registerDeviceInfo;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWeMayId() {
        return weMayId;
    }

    public void setWeMayId(String weMayId) {
        this.weMayId = weMayId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
