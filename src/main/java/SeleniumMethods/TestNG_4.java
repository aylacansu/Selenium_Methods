package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_4 {

	public static WebDriver driver;

	static By entrA = By.id("sum1");
	static By entrB = By.id("sum2");
	static By getBtn = By.xpath("//button[contains(text(),'Get Total')]");
	static By vrfBtn = By.xpath("//span[@id='displayvalue']");

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	}

	@Test(priority = 1, description = "get title method: selenium Easy Demo")
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title of Page ::" + title);
		Assert.assertEquals(title, "Selenium Easy Demo - Simple Form to Automate using Selenium");
	}

	@Test(priority = 2, description = "invalid input for number button")
	public void invalidInput() {

		ElementUtil.getElement(driver, entrA).sendKeys("z");
		ElementUtil.getElement(driver, entrB).sendKeys("20");
		ElementUtil.getElement(driver, getBtn).click();
		String total = ElementUtil.getElement(driver, vrfBtn).getText();
		Assert.assertEquals(total, "NaN");

	}

	@Test(priority = 3, description = "valid inputs for number buttons")
	public void validInputs() {

		ElementUtil.getElement(driver, entrA).sendKeys("10");
		ElementUtil.getElement(driver, entrB).sendKeys("20");
		ElementUtil.getElement(driver, getBtn).click();
		String total = ElementUtil.getElement(driver, vrfBtn).getText();
		Assert.assertEquals(total, "30");

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
