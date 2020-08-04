package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumMethods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_13_CSSSelectorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://hubspot.com/login")	;
		Thread.sleep(5000);	
		
		By username=By.cssSelector("#username");
		ElementUtil.getElement(driver, username).sendKeys("ayla@gmail.com");
		By password=By.cssSelector("#password");
		ElementUtil.getElement(driver, password).sendKeys("12341234");
		By loginBtn=By.cssSelector("#loginBtn");
		ElementUtil.getElement(driver, loginBtn).click();
		
		
		
		
		
		
		
		

	}

}
