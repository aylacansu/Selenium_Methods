package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_31_ImplicitWaitForElement {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//imp. wait will be applied for all the web elements by default global wait
		
		driver.get("https://www.hubspot.com/login");
		
		//Thread.sleep(5000);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //>>nullify imp. wait doesn't work.
		
		driver.findElement(By.id("username")).sendKeys("ayla@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456778");
		
		
		
		
		
		
		
		
		
		
		
		
		 	
		
		
		
		
		
		
		
		

	}

}
