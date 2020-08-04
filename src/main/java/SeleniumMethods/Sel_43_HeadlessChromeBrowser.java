package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_43_HeadlessChromeBrowser {

	public static void main(String[] args) {
		
		//ChromeDriver with Headless
		
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions cOptions=new ChromeOptions();
	cOptions.addArguments("--headless");
	WebDriver driver=new ChromeDriver(cOptions);
	//WebDriver driver=new ChromeDriver();   >>>by this way,we are using chromedriver..
	driver.get("http://www.siliconelabs.com");
	System.out.println(driver.getTitle());
		
	    //FireFox with Headless
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxOptions fOptions=new FirefoxOptions();
	fOptions.addArguments("--headless");
	WebDriver driver2=new FirefoxDriver(fOptions);
	driver2.get("http://www.siliconelabs.com");
	System.out.println(driver.getTitle());
	
		
		

	}

}
