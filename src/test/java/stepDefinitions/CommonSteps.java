package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.NewTheme.CommonPage;
import com.NewTheme.HomePage;
import com.NewTheme.LogInPage;

import commons.CommonTestcase;
import cucumber.api.java.en.When;

public class CommonSteps extends CommonTestcase {
	WebDriver driver;
	LogInPage logInPage;
	HomePage homePage;
	CommonPage commonPage;

	public CommonSteps() {
		driver = CommonTestcase.driver;
		commonPage = PageFactory.initElements(driver, CommonPage.class);
	}

//	@When("^I click chon cach thanh toan nay$")
//	public void i_click_chon_cach_thanh_toan_nay() throws InterruptedException{
//	  homePage.clickChonCachThanhToanNay();
//	}

	public void checkDisplayedMsg(String Message) {
		if (!(Message.isEmpty())) {
			verifyTrue(commonPage.isDynamicTexDisplayed(Message));
		}

	}

	@When("^Verify message  \"(.*?)\" and \"(.*?)\"$")
	public void verify_message_and(String Message1, String Message2) {
		checkDisplayedMsg(Message1);
		checkDisplayedMsg(Message2);
	}

}
