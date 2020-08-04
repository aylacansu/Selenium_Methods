package SeleniumMethods;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_30_ImplicitWait {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://www.hubspot.com/login");
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS); 
		
		System.out.println( driver.getTitle());

	    //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS); 
		//getTitle  is NOT element..so that not supportable for getTitle.. 
		
		
		
		//This wait tells webdriver to wait if the element is not avaible immediately
		//and webdriver wait till the element is visibile in specific time
		//It will throw NoSuchElementException
		//Tghis wait can be used only elements..NOT NON ELEMENTS..
		//This wait is static ...
		
	

	}

}
