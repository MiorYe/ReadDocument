package com.weimaipay.service;

import com.weimaipay.bill.ParseTradeData;

/**
 * @Author shancha
 * @Date Created in 下午 1:42 2018/1/8 0008
 */
public class TestPullFileFromFtp {
    public static void main(String[] args) {
        String startTime = "20171208";
        String endTime = "20180108";
        String ftpIp = "192.168.1.190";
        int ftpPort = 80;
        String userName = "tzzxyy";
        String userPwd = "tzzxyy123";
        String filesPath = "/";
        String fileDate ="WMYINLIAN20171120.txt";
        fileDate=fileDate.substring(9,fileDate.indexOf("."));
        System.out.println(fileDate);

        try {
            ParseTradeData.pullFtpFile(startTime, endTime,
                    ftpIp, ftpPort, userName, userPwd,
                    filesPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
