package com.NewTheme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.NewTheme.ui.LogInPageUI;

import commons.commonFunction;

public class LogInPage extends commonFunction {
	public LogInPage(WebDriver driver) {
		super(driver);
	}

	public void inputUserName(String value) throws InterruptedException {
		waitVisible(LogInPageUI.USERNAME_TXT);
		Thread.sleep(300);
		clear(LogInPageUI.USERNAME_TXT);
		input(LogInPageUI.USERNAME_TXT, value);
	}

	public void inputPassword(String value) throws InterruptedException {
		waitVisible(LogInPageUI.PASSWORD_TXT);
		Thread.sleep(300);
		clear(LogInPageUI.PASSWORD_TXT);
		input(LogInPageUI.PASSWORD_TXT, value);
	}

	public LogInPage clickDangNhap() throws InterruptedException {
		waitVisible(LogInPageUI.DANGNHAP_BTT);
		Thread.sleep(1000);
		click(LogInPageUI.DANGNHAP_BTT);
		return PageFactory.initElements(driver, LogInPage.class);
	}

	public String getTextErrorMsg() {
		waitVisible(LogInPageUI.ERROR_MSG);
		return getText(LogInPageUI.ERROR_MSG);
	}

	public void openTTLM(String value) {
		openUrl(value);
	}

	public void clickOption_FaceBook() throws InterruptedException {
		Thread.sleep(1000);
		if (checkElementDisplay(LogInPageUI.ICON_FACEBOOK)) {
			waitVisible(LogInPageUI.ICON_FACEBOOK);
			Thread.sleep(200);
			click(LogInPageUI.ICON_FACEBOOK);
		}
	}

	public void clickOption_Zalo() throws InterruptedException {
		Thread.sleep(1000);
		if (checkElementDisplay(LogInPageUI.ICON_ZALO)) {
			waitVisible(LogInPageUI.ICON_ZALO);
			Thread.sleep(200);
			click(LogInPageUI.ICON_ZALO);
		}
	}

	public void clickOption_Email() throws InterruptedException {
		Thread.sleep(1000);
		if (checkElementDisplay(LogInPageUI.ICON_EMAIL)) {
			waitVisible(LogInPageUI.ICON_EMAIL);
			Thread.sleep(200);
			click(LogInPageUI.ICON_EMAIL);
		}
	}

	public void clickOption_Google() throws InterruptedException {
		Thread.sleep(1000);
		if (checkElementDisplay(LogInPageUI.ICON_GOOGLE)) {
			waitVisible(LogInPageUI.ICON_GOOGLE);
			Thread.sleep(200);
			click(LogInPageUI.ICON_GOOGLE);
		}
	}

	public void clickThoatAcc() throws InterruptedException {
		waitVisible(LogInPageUI.BTT_THOAT_ACC);
		Thread.sleep(1000);
		click(LogInPageUI.BTT_THOAT_ACC);
	}

	public void clickCBBServer_Group() throws InterruptedException {
		if (checkElementDisplay(LogInPageUI.CBB_SERVER_GROUP)) {
			waitVisible(LogInPageUI.CBB_SERVER_GROUP);
			Thread.sleep(300);
			click(LogInPageUI.CBB_SERVER_GROUP);
		}
	}

	public void selectListItem_Server_Group(String value) throws InterruptedException {
		waitVisibleDynamicElement(LogInPageUI.LIST_ITEM, value);
		Thread.sleep(300);
		clickDynamicElement(LogInPageUI.LIST_ITEM, value);
	}

	public void clickCBBServer() throws InterruptedException {
		if (checkElementDisplay(LogInPageUI.CBB_SERVER)) {
			waitVisible(LogInPageUI.CBB_SERVER);
			Thread.sleep(300);
			click(LogInPageUI.CBB_SERVER);
		}
	}

	public void selectListItem_Server(String value) throws InterruptedException {
		waitVisibleDynamicElement(LogInPageUI.LIST_ITEM, value);
		Thread.sleep(300);
		clickDynamicElement(LogInPageUI.LIST_ITEM, value);
	}

	public void clickCBBCharacter() throws InterruptedException {
		if (checkElementDisplay(LogInPageUI.CBB_CHARACTER)) {
			waitVisible(LogInPageUI.CBB_CHARACTER);
			Thread.sleep(300);
			click(LogInPageUI.CBB_CHARACTER);
		}
	}

	public void selectListItem_Character(String value) throws InterruptedException {
		waitVisibleDynamicElement(LogInPageUI.LIST_ITEM, value);
		Thread.sleep(300);
		clickDynamicElement(LogInPageUI.LIST_ITEM, value);
	}

	public HomePage clickBTT_ChonNhanVatNay() throws InterruptedException {
		waitVisible(LogInPageUI.BTT_SELECT_ROLE);
		Thread.sleep(300);
		click(LogInPageUI.BTT_SELECT_ROLE);
		return PageFactory.initElements(driver, HomePage.class);
	}

}
