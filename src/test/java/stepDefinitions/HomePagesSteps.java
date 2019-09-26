package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.NewTheme.HomePage;

import commons.CommonTestcase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePagesSteps extends CommonTestcase {

	WebDriver driver;
	HomePage homePage;

	public HomePagesSteps() {
		driver = CommonTestcase.driver;
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	@Given("^I navigate to payment \"(.*?)\"$")
	public void i_navigate_to_payment(String arg1) throws InterruptedException {
		homePage.openUrl(arg1);
		Thread.sleep(3000);

	}

	@Then("^I select random package$")
	public void i_select_random_package() throws InterruptedException {
		List<WebElement> listPkg = driver
				.findElements(By.xpath("//div[@id='packageContainer']//div[contains(@class,'package-item')]"));
//		System.out.println(listPkg.size());
		List<String> lstPkgId = new ArrayList();
		for (WebElement elementList : listPkg) {
			String idPkg = elementList.getAttribute("data-id");
//			System.out.println("IN data" + idPkg);
			if (idPkg != null) {
				lstPkgId.add(idPkg);
			}
		}
		Random rand = new Random();

		Long limitPrice = Long.valueOf(0);

		int rndPkgId;
		do {
			rndPkgId = rand.nextInt(lstPkgId.size());
			String dataInput = driver.findElement(By.xpath("//div[@data-id='" + lstPkgId.get(rndPkgId) + "']"))
					.getAttribute("data-price");
			if (dataInput != null && dataInput != "") {
				limitPrice = Long.valueOf(dataInput);
			}
		} while (limitPrice < 500000);

//		System.out.println(limitPrice + " - " + lstPkgId.get(rndPkgId));

		homePage.click("//div[@data-id='" + lstPkgId.get(rndPkgId) + "']");

		Thread.sleep(1000);

	}

	@Then("^I click Chon goi$")
	public void i_click_Chon_goi() throws InterruptedException {

		homePage.clickChonGoiNapNay();
	}

	@Given("^I click method ZaloPay$")
	public void i_click_method_ZaloPay() throws InterruptedException {
		homePage.clickMethod_ZaloPay();
	}

	@When("^I click chon cach thanh toan ZaloPay$")
	public void i_click_chon_cach_thanh_toan_ZaloPay() throws InterruptedException {
		homePage.clickChonCachThanhToanNay();
//		String money = homePage.getTextPayment_ZaloPay_Sotienthanhtoan();
//		System.out.println("In so tien thanh toan 1: "+ money.substring(0, money.length()-1));
	}

	@When("^Verify so tien thanh toan$")
	public void verify_so_tien_thanh_toan() {
		verifyEqual(homePage.getTextPayment_ZaloPay_Sotienthanhtoan(),
				homePage.getTextConfirm_ZaloPay_Sotienthanhtoan());
	}

	@When("^I click nap bang Zalopay$")
	public void i_click_nap_bang_Zalopay() throws InterruptedException {
		homePage.clickNapTien();
	}

	@Then("^I click kiem tra ket qua giao dich$")
	public void i_click_kiem_tra_ket_qua_giao_dich() throws InterruptedException {
		homePage.clickKiemTra_KetQuaGiaoDich();
		
		System.out.println("Ma giao dich ZaloPay: " + homePage.getText_MaGiaoDich().substring(0, 14));
	}

	@Given("^I click method ZingCard$")
	public void i_click_method_ZingCard() throws InterruptedException{
		homePage.clickMethod_ZingCard();
		
	}

	@When("^i type \"(.*?)\" to serial$")
	public void i_type_to_serial(String value){
		
		homePage.inputZingCard_SoThe(value);
	}

	@When("^i type \"(.*?)\" to pincode$")
	public void i_type_to_pincode(String value){
		
		homePage.inputZingCard_MaThe(value);
	}

	@When("^I click chon cach thanh toan Zing Card$")
	public void i_click_chon_cach_thanh_toan_Zing_Card() throws InterruptedException{
		homePage.clickChonCachThanhToanNay();
		
	}


	@Then("^I click nap bang Zing Card$")
	public void i_click_nap_bang_Zing_Card() throws InterruptedException{
		homePage.clickNapTien();
		
	}	

}
