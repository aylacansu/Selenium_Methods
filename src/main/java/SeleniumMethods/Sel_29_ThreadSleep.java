package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_29_ThreadSleep {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hubspot.com/login");
		
		//Thread sleep is not part of Selenium==common  method in Java
		//It is a static
		//It is used to slow down
	
		Thread.sleep(5000);
		
		System.out.println("title is::" +driver.getTitle() );
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
