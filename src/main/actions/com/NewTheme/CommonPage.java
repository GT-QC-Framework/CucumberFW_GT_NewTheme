package com.NewTheme;

import org.openqa.selenium.WebDriver;

import com.NewTheme.ui.CommonPageUI;

import commons.commonFunction;

public class CommonPage extends commonFunction {

	public CommonPage(WebDriver driver) {
		super(driver);

	}

	public void clickDynamic_BTT(String value) throws InterruptedException {
		waitVisibleDynamicElement(CommonPageUI.DYNAMIC_BTT, value);
		Thread.sleep(300);
		clickDynamicElement(CommonPageUI.DYNAMIC_BTT, value);
	}
	public String getTextDynamic_MSG(String value)
	{
		waitVisibleDynamicElement(CommonPageUI.DYNAMIC_MSG, value);
		return getTextDynamicElement(CommonPageUI.DYNAMIC_MSG, value);
	}
	public boolean isDynamicTexDisplayed(String value) {
		
		waitVisibleDynamicElement(CommonPageUI.DYNAMIC_MSG, value);
		return isDynamicTexDisplayed(value);
	}
	
}
