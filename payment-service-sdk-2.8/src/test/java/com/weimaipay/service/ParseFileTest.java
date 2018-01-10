package com.weimaipay.service;

import com.weimaipay.bill.ParseTradeData;

import java.math.BigDecimal;

public class ParseFileTest {

	public static void main(String[] args) {
//		String appName = "10008";
//		String startTime = "20170601";
//		String endTime = "20170612";
//		try {
//			ParseTradeData.parseData(appName, startTime, endTime, "",
//					"E:\\test");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String  charge=new BigDecimal("0.00").multiply(new BigDecimal(100)).toString();
	    System.out.println(charge);
	}

}
