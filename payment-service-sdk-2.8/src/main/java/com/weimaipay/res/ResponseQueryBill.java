package com.weimaipay.res;

/**
 * 拉取账单
 */
public class ResponseQueryBill extends BaseResponse
{
    /**
     * csv文件名称
     */
    private String csvFileName;
    /**
     * csv文件内容
     */
    private String csvFileContent;

    public String getCsvFileName() {
        return csvFileName;
    }

    public void setCsvFileName(String csvFileName) {
        this.csvFileName = csvFileName;
    }

    public String getCsvFileContent() {
        return csvFileContent;
    }

    public void setCsvFileContent(String csvFileContent) {
        this.csvFileContent = csvFileContent;
    }
}
