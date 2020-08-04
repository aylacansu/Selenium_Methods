package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_30_ExplicitWait {

	public static void main(String[] args) {
		
	//it works with WebElement and non-webelement	
	//it waits avaible in WebdriverWait class	
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.hubspot.com/login");
		
	//non-element
		
	WebDriverWait wait= new WebDriverWait(driver, 15);	
		
	wait.until(ExpectedConditions.titleContains("HubSpot Login"));
	//wait.until(ExpectedConditions.titleContains("Hubspot Login"));//org.openga.selenium.TimeOut
	
	
	By email=By.id("username");
	
	//element
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(email));
	WebElement username=driver.findElement(email);
	username.sendKeys("ayla@gmail.com");
	
	System.out.println("title is :: " +driver.getTitle());
		
		
		
		
		
		
		
		
		 
		

	}

}
