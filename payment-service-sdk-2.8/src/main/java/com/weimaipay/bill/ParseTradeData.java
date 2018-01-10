package com.weimaipay.bill;

import java.io.*;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.weimaipay.PaySDKException;

public class ParseTradeData {

    private static final String ENCODE = "UTF-8";

    private static final String LOCAL_PATH = "D:\\FTP_FILES\\";

    private static final String WX_FUND_NAME = "微信";
    private static final String ALIPAY_FUND_NAME = "支付宝";

    private static Logger logger = Logger.getLogger(ParseTradeData.class);

    /**
     * @param appName     <br>
     *                    应用名称
     * @param startTime   <br>
     *                    开始时间
     * @param endTime     <br>
     *                    结束时间
     * @param getDataType <br>
     *                    获取方式
     * @return
     */
    public static List<TradeDataInfo> parseData(String appName, String startTime, String endTime, String getDataType, String fileAbslutePath) throws Exception {
        List<TradeDataInfo> tradeDataList = new ArrayList<>();
        List<File> fileList = new ArrayList<File>();
        fileList = getFiles(fileAbslutePath, fileList, startTime, endTime);
        if (fileList == null || fileList.isEmpty()) {
            throw new PaySDKException("007", "获取文件失败");
        }
        BufferedReader reader = null;
        String line = null;
        TradeDataInfo dataInfo = null;
        for (File file : fileList) {
            try {
                reader = new BufferedReader(new InputStreamReader(
                        new FileInputStream(file), ENCODE));
                line = reader.readLine();
                while ((line = reader.readLine()) != null) {
                    try {
                        dataInfo = dataInfo(line);
                        tradeDataList.add(dataInfo);
                    } catch (Exception e) {
                        logger.error("部分文件解析失败", e);
                    }
                }
            } catch (Exception e) {
                dataInfo.setErrorMsg("读取对账单出错：" + e.getMessage());
                tradeDataList.add(dataInfo);
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    logger.error(e);
                }
            }
        }
        return tradeDataList;
    }

    /**
     * 从ftp上获取对账文件
     *
     * @param startTime
     * @param endTime
     * @param ftpIp
     * @param ftpPort
     * @param ftpUser
     * @param ftpPwd
     * @param filesPath
     * @return
     * @throws Exception
     */
    public static List<UnionPayCheck> pullFtpFile(String startTime, String endTime, String ftpIp, int ftpPort, String ftpUser, String ftpPwd, String filesPath) throws Exception {
        List<UnionPayCheck> unionPayChecks = new ArrayList<>();
        // 从FTP上获取满足条件的文件
        List<File> files = pullFileFromFtp(ftpIp, ftpPort, ftpUser, ftpPwd, filesPath, startTime, endTime);
        BufferedReader reader = null;
        UnionPayCheck unionPayCheck = null;
        for (File file : files) {
            try {
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
                String line = reader.readLine();
                while ((line = reader.readLine()) != null) {
                    try {
                        // ftpDataInfo解析对账文件,目前仅仅使用于台州医院银联对账单
                        unionPayCheck = ftpDataInfo(line);
                        unionPayChecks.add(unionPayCheck);
                    } catch (Exception e) {
                        logger.error("FTP单行解析失败", e);
                    }
                }
            } catch (Exception e) {
                unionPayCheck.setErrorMsg("FTP读取对账单出错：" + e.getMessage());
                unionPayChecks.add(unionPayCheck);
            } finally {
                reader.close();
            }
        }
        return unionPayChecks;
    }

    /**
     * ftp获取文件
     *
     * @param ftpIp
     * @param ftpPort
     * @param userName
     * @param userPwd
     * @param filesPath
     * @param startTime
     * @param endTime
     * @return
     */
    private static List<File> pullFileFromFtp(String ftpIp, int ftpPort, String userName, String userPwd, String filesPath, String startTime, String endTime) throws Exception {
        List<File> files = new ArrayList<File>();
        FTPClient ftpClient = null;
        OutputStream outputStream = null;
        try {
            ftpClient = new FTPClient();
            ftpClient.connect(ftpIp, ftpPort);
            ftpClient.login(userName, userPwd);
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            //设置linux环境
            FTPClientConfig conf = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
            ftpClient.configure(conf);
            int replyCode = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(replyCode)) {
                throw new PaySDKException("010", "FTP登录失败");
            }
            // 设置访问被动模式
            ftpClient.setRemoteVerificationEnabled(false);
            ftpClient.enterLocalPassiveMode();
            // 切换到ftp文件目录下
            boolean dir = ftpClient.changeWorkingDirectory(filesPath);
            if (!dir) {
                throw new PaySDKException("011", "FTP文件目录不存在");
            }
            FTPFile[] ftpFiles = ftpClient.listFiles();
            if (ftpFiles == null || ftpFiles.length == 0) {
                throw new PaySDKException("008", "FTP文件目录为空");
            }
            for (FTPFile ftpFile : ftpFiles) {
                // 不同的医院，文件名可能会有所不同，目前是台州医院银联对账单
                String fileName = ftpFile.getName();
                if (!checkFileName(fileName)) {
                    continue;
                }
                String fileDate = fileName.substring(9, fileName.indexOf("."));
                if (!checkFile(startTime, endTime, fileDate)) {
                    continue;
                }
                File file = new File(LOCAL_PATH + ftpFile.getName());
                if (file.exists()) {
                    file.delete();
                    file.createNewFile();
                } else {
                    file.createNewFile();
                }
                outputStream = new FileOutputStream(file);
                ftpClient.retrieveFile(ftpFile.getName(), outputStream);
                if (file != null) {
                    files.add(file);
                }
            }
            ftpClient.logout();
        } finally {
            if (outputStream != null) {
                outputStream.flush();
                outputStream.close();
            }
            if (ftpClient.isConnected()) {
                ftpClient.disconnect();
            }
        }
        return files;
    }

    /**
     * 台州医院银联对账文件解析<br>
     * 目前ftp对账文件获取，仅适用于台州医院银联
     *
     * @param line 备注：银行流水号, 交易日期, 交易时间, 商户号, 终端号, 卡号(帐号), 消费金额(元), 手续费(元), 交易类型
     * @return
     */
    private static UnionPayCheck ftpDataInfo(String line) {
        UnionPayCheck unionPayCheck = new UnionPayCheck();
        String[] lines = line.split("\\,", -2);
        // 银行流水号
        unionPayCheck.setBankBuinessNo(lines[0]);
        String date = lines[1];
        String time = lines[2].replaceAll("\\.", "");
        unionPayCheck.setTradeDate(date + time);
        unionPayCheck.setTradeTime(date + time);
        unionPayCheck.setMerchantNo(lines[3]);
        unionPayCheck.setTerminalNo(lines[4]);
        unionPayCheck.setBankCardNo(lines[5]);
        BigDecimal businessAmount = new BigDecimal(lines[6]).multiply(new BigDecimal(100));
        unionPayCheck.setConsumptionAmount(businessAmount.toString());
        BigDecimal charge = new BigDecimal(lines[7]).multiply(new BigDecimal(100));
        unionPayCheck.setPoundage(charge.toString());
        unionPayCheck.setConsumptionType(lines[8]);
        return unionPayCheck;
    }


    /**
     * 对象处理
     *
     * @param line
     * @return
     */
    private static TradeDataInfo dataInfo(String line) {
        TradeDataInfo dataInfo = new TradeDataInfo();
        String[] lineArray = line.split("\\,", -2);
        dataInfo.setAppBusinessNo(lineArray[0]);
        dataInfo.setMchBusinessNo(lineArray[1]);
        dataInfo.setBusinessAmount(lineArray[2]);
        dataInfo.setBusinessDirection(lineArray[3]);
        dataInfo.setBusinessTime(lineArray[4]);
        dataInfo.setAppTransactionNo(lineArray[5]);
        String fundName = lineArray[6];
        dataInfo.setFundName(fundName);
        dataInfo.setFundTransactionNo(lineArray[7]);
        dataInfo.setTransactionAmount(lineArray[8]);
        dataInfo.setTransactionDirection(lineArray[9]);
        dataInfo.setTransactionTime(lineArray[10]);
        dataInfo.setBusinessRemark(lineArray[11]);
        dataInfo.setTransactionRemark(lineArray[12]);
        /*if (WX_FUND_NAME.equals(fundName.trim())) {
            dataInfo.setTransactionDirection(lineArray[9]);
			dataInfo.setTransactionTime(lineArray[10]);
			dataInfo.setBusinessRemark(lineArray[11]);
			dataInfo.setTransactionRemark(lineArray[12]);
			return dataInfo;
		}
		if (ALIPAY_FUND_NAME.equals(fundName.trim())) {
			dataInfo.setTransactionTime(lineArray[9]);
			dataInfo.setBusinessRemark(lineArray[10]);
			dataInfo.setTransactionRemark(lineArray[11]);
		}*/
        return dataInfo;
    }

    /**
     * 获取满足条件的文件
     *
     * @param filePath
     * @param files
     * @param startTime
     * @param endTime
     * @return
     */
    private static List<File> getFiles(String filePath, List<File> files,
                                       String startTime, String endTime) throws Exception {
        if (filePath == null || filePath.length() == 0) {
            throw new PaySDKException("005", "缺少参数[filePath]");
        }
        File realFile = new File(filePath);
        if (!realFile.exists()) {
            throw new PaySDKException("006", "文件路径不存在");
        }
        String fileDate = "";
        if (realFile.isDirectory()) {
            File[] subfiles = realFile.listFiles();
            for (File file : subfiles) {
                if (file.isDirectory()) {
                    // getFiles(file.getAbsolutePath(), files, startTime,
                    // endTime);
                } else {
                    // 判断是否满条件
                    fileDate = file.getName().substring(0, file.getName().indexOf("."));
                    if (checkFile(startTime, endTime, fileDate)) {
                        files.add(file);
                    }
                }
            }
        }
        return files;
    }

    /**
     * 台州医院银联对账文件校验文件名
     *
     * @param fileName
     * @return
     */
    private static Boolean checkFileName(String fileName) {
        // 不同的医院，文件名可能会有所不同，目前是台州医院银联对账单
        // 过滤非txt和非单日对账文件 例如icbc,WMYINLIAN20171119-WMYINLIAN201711120.txt等文件名
        if (!fileName.endsWith(".txt") || fileName.indexOf("-") >= 0) {
            return false;
        }
        String fileDate=fileName.substring(9, fileName.indexOf("."));
        // 过滤掉文件日期不是yyyyMMdd的文件
        String pattern = "yyyyMMdd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            dateFormat.parse(fileDate);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * 检测文件是否满足时间范围
     *
     * @param startTime
     * @param endTime
     * @param fileDate
     * @return
     */
    private static boolean checkFile(String startTime, String endTime, String fileDate) throws ParseException {
        String pattern = "yyyyMMdd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        int checkReusltOne = dateFormat.parse(startTime.trim()).compareTo(dateFormat.parse(fileDate));
        int checkReusltTwo = dateFormat.parse(endTime.trim()).compareTo(dateFormat.parse(fileDate));
        if (checkReusltOne <= 0 && checkReusltTwo >= 0) {
            return true;
        }
        return false;
    }
}
