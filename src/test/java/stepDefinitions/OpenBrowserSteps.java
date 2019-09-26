package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.NewTheme.LogInPage;

import commons.CommonTestcase;
import cucumber.api.java.en.Given;

public class OpenBrowserSteps {

	WebDriver driver;
	LogInPage logInPage;

	public OpenBrowserSteps() {
		driver = CommonTestcase.openMultiBrowser("chrome", "version", "url");
		logInPage = PageFactory.initElements(driver, LogInPage.class);
	}

	@Given("^I navigate to Webpay newtheme ttlm \"(.*?)\"$")
	public void i_navigate_to_Webpay_newtheme_ttlm(String value) {
		logInPage.openTTLM(value);
	}
}
