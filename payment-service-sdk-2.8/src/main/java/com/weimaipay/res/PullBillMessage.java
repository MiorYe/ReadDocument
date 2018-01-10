package com.weimaipay.res;

/**
 * 微脉主动拉取应用方账单
 */
public class PullBillMessage {
    /**
     * 应用名称
     */
    private String appName;
    /**
     * 账单开始日期 yyyy-MM-dd HH:mm:ss
     */
    private String startTime;
    /**
     * 账单结束日期 yyyy-MM-dd HH:mm:ss
     */
    private String endTime;
    /**
     * 数据来源类型
     */
    private String dataSourceType;
    /**
     * 数据来源路径
     */
    private String dataSourcePara;

    /**
     * ftp IP地址
     */
    private String ftpIp;
    /**
     * ftp 端口号,可不传,不传时默认为FTP默认端口号21
     */
    private Integer ftpPort;
    /**
     * ftp 用户名
     */
    private String ftpUser;
    /**
     * ftp 用户密码
     */
    private String ftpPwd;
    /**
     * ftp文件路径
     */
    private String ftpFilePath;


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
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

    public String getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public String getDataSourcePara() {
        return dataSourcePara;
    }

    public void setDataSourcePara(String dataSourcePara) {
        this.dataSourcePara = dataSourcePara;
    }

    public String getFtpIp() {
        return ftpIp;
    }


    public String getFtpUser() {
        return ftpUser;
    }

    public String getFtpPwd() {
        return ftpPwd;
    }

    public String getFtpFilePath() {
        return ftpFilePath;
    }

    public void setFtpIp(String ftpIp) {
        this.ftpIp = ftpIp;
    }

    public Integer getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(Integer ftpPort) {
        this.ftpPort = ftpPort;
    }

    public void setFtpUser(String ftpUser) {
        this.ftpUser = ftpUser;
    }

    public void setFtpPwd(String ftpPwd) {
        this.ftpPwd = ftpPwd;
    }

    public void setFtpFilePath(String ftpFilePath) {
        this.ftpFilePath = ftpFilePath;
    }
}
