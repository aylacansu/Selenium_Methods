package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_SoftAssert {

	
	WebDriver driver;
    SoftAssert softAssert;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https:/app.hubspot.com/login");
		softAssert = new SoftAssert();
		
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		
		String title = driver.getTitle();
		System.out.println("page title is: "+ title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority = 2)
	public void signUpLink() {
		boolean link = driver.findElement(By.linkText("Sign up")).isDisplayed();
		Assert.assertTrue(link);
	}
	
	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("ayc0634@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Asya2308");
		driver.findElement(By.id("loginBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("private-page__title")));
		boolean isHeader = driver.findElement(By.className("private-page__title")).isDisplayed();
		System.out.println(isHeader);
		softAssert.assertTrue(isHeader);
		
		String header = driver.findElement(By.className("private-page__title")).getText();
		System.out.println("home page header is: "+ header);
		softAssert.assertEquals(header, "Marketing Dashb", "header text is not correct");
		
		//SoftAssert 'de Header yanlis olmasina ragmen test fail olmadi ve
		// devaminda gelen testi de calistirdi.(Header2)
		//Eger Fail olan bolumu gormek istiyosak  >> softAssert.assertAll(); kullanmaliyiz.
		
		boolean isHeader2 = driver.findElement(By.className("private-page__title")).isDisplayed();
		System.out.println(isHeader2);
		softAssert.assertTrue(isHeader2);
		
		softAssert.assertAll();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
