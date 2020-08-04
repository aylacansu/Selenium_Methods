package SeleniumMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_47_MoveToElement {
	static WebDriver driver;
	static By phones=By.xpath("//button[contains(text(),'Phones list')]");
	static By smartPhones=By.xpath("//a[@href='https://www.verizon.com/smartphones/']");
  //static By smartphone=By.id("thirdLevel00");
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	driver.get("https://www.verizonwireless.com/");
	
	
	
	WebElement element=driver.findElement(phones);	
	Actions actions=new Actions(driver)	;
	actions.moveToElement(element).build().perform();
	

	
	WebElement element2=driver.findElement(smartPhones);
	element2.click();	
		
		
		
		
		
		
		

	}

}
