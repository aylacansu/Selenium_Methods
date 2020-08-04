package SeleniumMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG_5 {

	public static WebDriver driver;

	static By entrMssg = By.xpath("//input[@id='user-message']");

	static By shwMssg = By.xpath("//button[@onclick='showInput();']");

	static By verifyBtn = By.xpath("//span[@id='display']");

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

	}

	@Test(priority = 1, description="to get  correct title")
	
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title of Page ::" + title);
		Assert.assertEquals(title, "Selenium Easy Demo - Simple Form to Automate using Selenium");
	}

	@Test(priority = 2,description="to get correct text ")
	
	public void getText() {

		ElementUtil.getElement(driver, entrMssg).sendKeys("Everthing is going to be well..I hope..");
		ElementUtil.getElement(driver, shwMssg).click();
		String text = ElementUtil.getElement(driver, verifyBtn).getText();
		Assert.assertEquals(text, "Everthing is going to be well..I hope..");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Test complited");

		driver.close();
	}

}
