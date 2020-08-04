package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG_2 {

	public static WebDriver driver;
	static By lgnBtn = By.xpath("//li[@class='login-link']//span[contains(text(),'Login')]");
	static By email = By.id("username");
	static By passwrd = By.id("password");
	static By Login = By.xpath("//input[@class='btn btn-md btn-color-1 btn-radius']");
	static By text = By.xpath("//div[@class='alert alert-danger']");
	static By badcredit = By.xpath("//div[contains(text(),'Bad credentials.')]");

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.designmantic.com/");
	}

	@Test(priority = 2, description = "invalid Password")
	public void invalidPassword() {
	
		ElementUtil.getElement(driver, lgnBtn).click();
		ElementUtil.getElement(driver, email).sendKeys("ayla@gmail.com");
		ElementUtil.getElement(driver, passwrd).sendKeys("123");
		ElementUtil.getElement(driver, Login).click();
		String text = getElement(driver, badcredit).getText();
		Assert.assertEquals(text, "Bad credentials.");
		

	}

	@Test(priority = 1, description="correct URL")
	public void verifyURL() {
        String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.designmantic.com/");

	}
     

	@AfterMethod
	public void tearDown() {
		System.out.println("Test complited");
		driver.close();
	}

	public static WebElement getElement(WebDriver driver, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement element = driver.findElement(locator);
		return element;
	}
}
