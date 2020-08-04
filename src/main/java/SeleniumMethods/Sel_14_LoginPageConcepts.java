package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_14_LoginPageConcepts {

	public static WebDriver driver;
	static By email = By.id("username");
	static By password = By.xpath("//input[@id='password']");
	
	// static By loginBtn=By.cssSelector("#loginBtn");
	// //tagname[attribute='value']
	// static By loginBtn = By.xpath("//i18n-string[text()='Log in']");
	
	static By loginBtn = By.cssSelector("i18n-string[data-key='login.form.button']");

	public static void main(String[] args) throws InterruptedException {

		driver = ElementUtil.launchBrowser(driver, "chrome");
		// String url="https://app.hubspot.com/login";
		ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);

		ElementUtil.getElement(driver, email).sendKeys("ayla@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("12341234");
		ElementUtil.getElement(driver, loginBtn).click();
		ElementUtil.quitBrowser(driver);

	}

}
