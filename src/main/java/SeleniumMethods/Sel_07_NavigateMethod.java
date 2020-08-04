package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_07_NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "/Users/ic/Documents/DRIVERS/chromedriver");	
		
WebDriver driver=new ChromeDriver();
driver.get("http://www.amazon.com");
		
//Navigate
driver.navigate().to("http://www.ebay.com");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().refresh();

driver.quit();
		
		
		
		
		
		

	}

}
