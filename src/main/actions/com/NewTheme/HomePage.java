package com.NewTheme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.NewTheme.ui.HomePageUI;
import com.NewTheme.ui.LogInPageUI;

import commons.commonFunction;

public class HomePage extends commonFunction {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage clickBTT_ChonNhanVatNay() throws InterruptedException {
		waitVisible(LogInPageUI.BTT_SELECT_ROLE);
		Thread.sleep(300);
		click(LogInPageUI.BTT_SELECT_ROLE);
		return PageFactory.initElements(driver, HomePage.class);
	}

	public void clickChonGoiNapNay() throws InterruptedException {
		waitVisible(HomePageUI.BTT_SELECT_PACKAGE);
		Thread.sleep(100);
		click(HomePageUI.BTT_SELECT_PACKAGE);
	}

	public void clickKiemTra_KetQuaGiaoDich() throws InterruptedException {
		waitVisible(HomePageUI.BTT_KIEMTRA_KETQUAGIAODICH);
		Thread.sleep(2000);
		click(HomePageUI.BTT_KIEMTRA_KETQUAGIAODICH);
	}

	public String getText_MaGiaoDich() {
		waitVisible(HomePageUI.MSG_MAGIAODICH);
		return getText(HomePageUI.MSG_MAGIAODICH);
	}

	public void clickMethod_ZaloPay() throws InterruptedException {
		waitVisible(HomePageUI.METHOD_ZALOPAY);
		Thread.sleep(1000);
		click(HomePageUI.METHOD_ZALOPAY);
	}
	
	public void clickMethod_ZingCard() throws InterruptedException {
		waitVisible(HomePageUI.METHOD_ZINGCARD);
		Thread.sleep(1000);
		click(HomePageUI.METHOD_ZINGCARD);
	}

	public String getTextPayment_ZaloPay_Sotienthanhtoan() {
		waitVisible(HomePageUI.PAYMENT_ZALOPAY_SOTIENTHANHTOAN);
		return getText(HomePageUI.PAYMENT_ZALOPAY_SOTIENTHANHTOAN);
	}

	public String getTextConfirm_ZaloPay_Sotienthanhtoan() {
		waitVisible(HomePageUI.CONFIRM_ZALOPAY_SOTIENTHANHTOAN);
		return getText(HomePageUI.CONFIRM_ZALOPAY_SOTIENTHANHTOAN);
	}
	
	public void clickChonCachThanhToanNay() throws InterruptedException {
		waitVisible(HomePageUI.BTT_SELECT_METHOD);
		Thread.sleep(1500);
		click(HomePageUI.BTT_SELECT_METHOD);
	}
	public void clickNapTien() throws InterruptedException
	{
		waitVisible(HomePageUI.BTT_XACNHAN_NAPTIEN);
		Thread.sleep(3000);
		click(HomePageUI.BTT_XACNHAN_NAPTIEN);
	}
	public String getTextMaGiaoDich()
	{
		waitVisible(HomePageUI.MSG_MAGIAODICH);
		return getText(HomePageUI.MSG_MAGIAODICH);
	}
	
	public void inputZingCard_SoThe(String value)
	{
		waitVisible(HomePageUI.PAYMENT_ZINGCARD_SERIAL);
		clear(HomePageUI.PAYMENT_ZINGCARD_SERIAL);
		input(HomePageUI.PAYMENT_ZINGCARD_SERIAL, value);
	}
	
	public void inputZingCard_MaThe(String value)
	{
		waitVisible(HomePageUI.PAYMENT_ZINGCARD_PINCARD);
		clear(HomePageUI.PAYMENT_ZINGCARD_PINCARD);
		input(HomePageUI.PAYMENT_ZINGCARD_PINCARD, value);
	}
	
	

}
