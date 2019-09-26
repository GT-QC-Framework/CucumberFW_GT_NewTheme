package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.NewTheme.LogInPage;

import commons.CommonTestcase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInSteps extends CommonTestcase {
	WebDriver driver;
	LogInPage logInPage;

//	String browser, version, url;
	public LogInSteps() {
		driver = CommonTestcase.driver;
		logInPage = PageFactory.initElements(driver, LogInPage.class);
	}

	@Given("^I navigate to newtheme web payment \"(.*?)\"$")
	public void i_navigate_to_newtheme_web_payment(String value) {
		logInPage.openTTLM(value);
	}

	@Given("^I click icon FaceBook$")
	public void i_click_icon_FaceBook() throws InterruptedException {
		logInPage.clickOption_FaceBook();
		Thread.sleep(3000);
		logInPage.backToPage();
	}

	@Given("^I click icon Zalo$")
	public void i_click_icon_Zalo() throws InterruptedException {
		logInPage.clickOption_Zalo();
		Thread.sleep(3000);
		logInPage.backToPage();
	}

	@Given("^I click icon Google$")
	public void i_click_icon_Google() throws InterruptedException {
		logInPage.clickOption_Google();
		Thread.sleep(3000);
		logInPage.backToPage();
	}

	@Given("^I click icon Email$")
	public void i_click_icon_Email() throws InterruptedException {
		logInPage.clickOption_Email();
	}

	@Given("^I click option Email$")
	public void i_click_option_Email() throws InterruptedException {
		logInPage.clickOption_Email();
	}

	@When("^I input data \"(.*?)\" to username$")
	public void i_input_data_to_username(String arg1) throws InterruptedException {
		logInPage.inputUserName(arg1);
	}

	@When("^I input data \"(.*?)\" to password$")
	public void i_input_data_to_password(String arg1) throws InterruptedException {
		logInPage.inputPassword(arg1);
	}

	@When("^i click button Dang Nhap$")
	public void i_click_button_Dang_Nhap() throws InterruptedException {
		logInPage.clickDangNhap();
	}

	@Then("^Verify successfully with message \"(.*?)\"$")
	public void verify_successfully_with_message(String arg1) {
		verifyEqual(logInPage.getTextErrorMsg(), arg1);
	}

	@Given("^I click login by email$")
	public void i_click_login_by_email() throws InterruptedException {
		logInPage.clickOption_Email();
	}

	@When("^I input username$")
	public void i_input_username() throws InterruptedException {
		logInPage.inputUserName("nhutne555@gmail.com");
	}

	@When("^I input  password$")
	public void i_input_password() throws InterruptedException {
		logInPage.inputPassword("Aa123456!");
	}

	@When("^i click button Login$")
	public void i_click_button_Login() throws InterruptedException {
		
		Thread.sleep(1000);
		logInPage.clickDangNhap();
		Thread.sleep(3000);
		
		System.out.println("In chuoi 1:"+logInPage.getTitle());
	}

	@When("^Verify successfully with title \"(.*?)\"$")
	public void verify_successfully_with_title(String value) throws InterruptedException {
		
		Thread.sleep(3000);
		verifyEqual(logInPage.getTitle(), value);
		System.out.println("Thành công get title login = email");
	}

	@Then("^I click Thoat account$")
	public void i_click_Thoat_account() throws InterruptedException {
		logInPage.clickThoatAcc();
	}

	@Given("^I input \"(.*?)\" to username$")
	public void i_input_to_username(String arg1) throws InterruptedException {
		logInPage.inputUserName(arg1);

	}

	@When("^I input \"(.*?)\" to password$")
	public void i_input_to_password(String arg1) throws InterruptedException {
		logInPage.inputPassword(arg1);

	}

	@When("^i click Dang Nhap$")
	public void i_click_Dang_Nhap() throws InterruptedException {
		logInPage.clickDangNhap();
	}

	@Then("^Verify successful with message \"(.*?)\"$")
	public void verify_successful_with_message(String arg1) {
		verifyEqual(logInPage.getTextErrorMsg(), arg1);
	}

	@Given("^I sendkey username$")
	public void i_sendkey_username() throws InterruptedException {
		logInPage.inputUserName("giinboo1");
	}

	@When("^I sendkey pass$")
	public void i_sendkey_pass() throws InterruptedException {
		logInPage.inputPassword("Aa123456!");
	}

	@When("^I  click Login$")
	public void i_click_Login() throws InterruptedException {
		
		logInPage.clickDangNhap();
		Thread.sleep(3000);
		System.out.println("In ra1: " + logInPage.getTitle());
	}

	@When("^Verify login success with title \"(.*?)\"$")
	public void verify_login_success_with_title(String arg1) throws InterruptedException {

		Thread.sleep(3000);
		System.out.println("In ra2: " + logInPage.getTitle());

		verifyEqual(logInPage.getTitle(), arg1);
	}

	@Then("^I logout success$")
	public void i_logout_success() throws InterruptedException {
		logInPage.clickThoatAcc();
	}

	@Given("^I type username$")
	public void i_type_username() throws InterruptedException {
		logInPage.inputUserName("giinboo1");

	}

	@When("^I tye password$")
	public void i_tye_password() throws InterruptedException {
		logInPage.inputPassword("Aa123456!");

	}

	@When("^I  Login$")
	public void i_Login() throws InterruptedException {
		logInPage.clickDangNhap();
		Thread.sleep(3000);

	}

	@When("^I select role$")
	public void i_select_role() throws InterruptedException {
		logInPage.clickCBBServer_Group();
		Thread.sleep(300);
		logInPage.clickCBBServer();
		logInPage.selectListItem_Server("S1-Võ Tắc Thiên");
		Thread.sleep(300);
		logInPage.clickCBBCharacter();
		logInPage.selectListItem_Character("GiinZingIDJJ");
	}

	@When("^I click chon nhan vat nay$")
	public void i_click_chon_nhan_vat_nay() throws InterruptedException {
		logInPage.clickBTT_ChonNhanVatNay();
	}

}
