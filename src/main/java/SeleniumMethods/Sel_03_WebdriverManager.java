package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_03_WebdriverManager {

	public static void main(String[] args) {
		
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://learnsdet.com/");
	driver.quit();
	
	
//	WebDriverManager.firefoxdriver().setup();
//	
//	WebDriver driver2=new FirefoxDriver();
//	
//	driver2.get("https://siliconelabs.com/");
//	driver2.close();
	
		
		
		
		
		
	
	}

}
