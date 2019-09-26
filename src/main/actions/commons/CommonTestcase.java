package commons;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class CommonTestcase {
	
	public static WebDriver driver;

	public static WebDriver openMultiBrowser( String browser, String version, String url) {
		if (browser.equals("chrome")) {

			// Disable notify tren chrome
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			version = "77.0.3865.40";
			url = "https://pay.zing.vn";
			ChromeDriverManager.getInstance().version(version).setup();

			driver = new ChromeDriver(options);
			driver.get(url);

			driver.manage().window().maximize();
		} else if (browser.equals("firefox")) {
			FirefoxDriverManager.getInstance().version(version).setup();
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		return driver;
	}

	// Random number
	public String randomNumber() {
		Random rand = new Random();
		int n = rand.nextInt(9999999);
		return String.valueOf(n);
	}

	// Random click combobox
	public void clickRandomCombobox(String locator) {
		List<WebElement> selects = driver.findElements(By.xpath(locator));
		Random rand = new Random();
		int list = rand.nextInt(selects.size());
		selects.get(list).click();
	}

	public void CloseBrowser() {
		driver.quit();
	}

	public void verifyEqual(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}

	public void verifyTrue(Boolean condition) {
		Assert.assertTrue(condition);
	}

	public void verifyFalse(Boolean condition) {
		Assert.assertFalse(condition);
	}

	//

}
