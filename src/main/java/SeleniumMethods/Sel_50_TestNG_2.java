package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sel_50_TestNG_2 {

	public static WebDriver driver;
	ElementUtil elementUtil;

	By email = By.id("username");
	By password = By.id("password");
	By lgnBtn = By.id("loginBtn");
	By bodyText = By.xpath("//div[@class='private-alert__inner']/h5");

	@BeforeMethod
	public void setUP() throws InterruptedException {

		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void InvalidCredentialsException() {
		
		ElementUtil.getElement(driver, email).sendKeys("ayla@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("test12345");
		ElementUtil.getElement(driver, lgnBtn).click();
		String text = ElementUtil.getElement(driver, bodyText).getText();
		System.out.println(text);
		Assert.assertEquals(text, "That email address doesn't exist.");
	}

	@AfterMethod
	public void tearDown() {
		ElementUtil.quitBrowser(driver);
	}

}
