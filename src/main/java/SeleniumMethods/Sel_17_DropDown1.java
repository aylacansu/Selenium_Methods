package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_17_DropDown1 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().browserVersion("3.8.1").setup();	
	
	ChromeOptions chromeOptions=new ChromeOptions();
	
	chromeOptions.setHeadless(false);
	
	driver=new ChromeDriver(chromeOptions);
	
	
	driver.get("http://www.facebook.com");
	
	WebElement day=driver.findElement(By.id("day"));
	WebElement month=driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year"));
	
	//Select
	
	Select select1=new Select(day);
	//select1.selectByVisibleText("9");
	select1.selectByIndex(9);
	Select select2=new Select(month);
	//select2.selectByVisibleText("Sep");
	select2.selectByIndex(9);
	Select select3=new Select(year);
	//select3.selectByVisibleText("2012");
	select3.selectByIndex(9);
	
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
