package com.NewTheme.ui;

public class HomePageUI {

	public static final String BTT_SELECT_PACKAGE = "//button[@data-id='PackageSelected']";

	public static final String METHOD_ZALOPAY = "//div[@data-id='PaymentGroup-zalopay']";

	public static final String METHOD_ZINGCARD = "//div[@data-id='PaymentGroup-card']";

	public static final String METHOD_ATM = "//div[@data-id='PaymentGroup-bank']";

	public static final String METHOD_CC = "//div[@data-id='PaymentGroup-credit']";
	
	public static final String METHOD_SMS = "//div[@data-id='PaymentGroup-sms']";
	
	public static final String BTT_SELECT_METHOD = "//button[contains(@data-id,'PaymentMethodSelected')]";
	
	public static final String MSG_MAGIAODICH = "//div[@class='resultTitle']//p[contains(text(),'giao dịch')]";
	
	public static final String BTT_XACNHAN_NAPTIEN = "//button[contains(@class,'el-button--primary')]";

	public static final String BTT_KIEMTRA_KETQUAGIAODICH = "//button[@data-id='ResultCheckPayment']";
	
	public static final String PAYMENT_ZALOPAY_SOTIENTHANHTOAN = "//div[@data-id='PaymentGroup-zalopay']//b";
	
	public static final String CONFIRM_ZALOPAY_SOTIENTHANHTOAN = "//span[contains(text(),'tiền thanh toán')]/following-sibling::code"; 
	
	public static final String PAYMENT_ZINGCARD_SERIAL = "//input[@data-id='InputString-card-cardSerial']";
	
	public static final String PAYMENT_ZINGCARD_PINCARD = "//input[@data-id='InputString-card-cardPassword']";
	
	public static final String PAYMENT_ZINGCARD_SOTIENTHANHTOAN = "//p[contains(text(),'Zing')]/preceding-sibling::b";
	

}
