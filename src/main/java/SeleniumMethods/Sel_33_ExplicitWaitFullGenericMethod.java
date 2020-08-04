package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.nio.cs.ext.ISCII91;

public class Sel_33_ExplicitWaitFullGenericMethod {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait = new WebDriverWait(driver, 15); // 15 minutes is not generic.Bcz,smtimes we need extra time..
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
	    System.out.println("Title is::" + driver.getTitle());
		
		
		
		By email=By.id("username");
		By  password=By.id("password");
		By logBtn=By.id("loginBtn");
		
		
		//getTitle(driver, 5, "HubSpot Login");
		
		
		getElement(driver, email, 5).sendKeys("ayla@gmail.com");
		getElement(driver, password, 2).sendKeys("1234567890");
		getElement(driver, logBtn, 3).click();
		
}
	
//	/**
//	 * this is generic method for getTitle
//	 * @param driver
//	 * @param timeout
//	 */
//	public static String getTitle(WebDriver driver,int timeout,String value){
//		WebDriverWait wait = new WebDriverWait(driver, timeout);
//		wait.until(ExpectedConditions.titleContains(value));
//	    System.out.println("Title is::" + driver.getTitle());
//		return value;  // >>>>return type String..
//	}
//	
	
	
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param timeout
	 * @return
	 */
public static WebElement getElement(WebDriver driver,By locator,int timeout){
	
	waitForPresenceOfElement(driver, locator, timeout);
	WebElement element=driver.findElement(locator);
	return element;
	
}

	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param timeout
	 */
	
	
	
	public static void waitForPresenceOfElement(WebDriver driver,By locator ,int timeout){
	
		WebDriverWait wait=new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
}
	
	
	
	
	
	
	
	
	
	
	
}