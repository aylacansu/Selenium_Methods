package SeleniumMethods;

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

public class Sel_39_TestNG_1 {
	public static WebDriver driver;
	By email=By.id("username");
	By password=By.id("password");
	By lgnBtn=By.id("loginBtn");
	By bodyText= By.xpath("//div[@class=‘private-alert__inner’]/h5");


	@BeforeMethod   //this method runs before all test cases
	public void setUP() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		
	}
	@Test(priority=1,description="get title method:HubSpot Login")
	
	public void getTitle(){
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "HubSpot Login");
	}
	
	
	@Test(priority=2,description="invalid username and password for Login Page")
	
	public void InvalidCredentialsException(){
		getElement(driver, email).sendKeys("ayla@gmail.com");
		getElement(driver, password).sendKeys("123456678");
		getElement(driver, lgnBtn).click();
		String text=getElement(driver, bodyText).getText();
		System.out.println(text);
		Assert.assertEquals(text,"That email address doesn't exist.");
	}
	
	

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

public static WebElement getElement(WebDriver driver, By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
