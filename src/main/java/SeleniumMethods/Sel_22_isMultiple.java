package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_22_isMultiple {
public static WebDriver driver;
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions chromeOptions=new ChromeOptions();
	chromeOptions.setHeadless(true);
	driver=new ChromeDriver(chromeOptions);
		
	driver.get("https://www.facebook.com");	
		
	WebElement day = driver.findElement(By.id("day"));
	WebElement month = driver.findElement(By.id("month"));
	WebElement year = driver.findElement(By.id("year"));
	
	
	Select select=new Select(month);
	
	//1---dropDown is Multiple or Not===isMultiple();   method

	System.out.println(select.isMultiple());
		
	//2--to verify dropDown is Selected or Not===
	
	WebElement option = select.getFirstSelectedOption(); //it gives default value


	 //  System.out.println(option.getText()); this is not professional usage
    
    String selectedText=option.getText();
    System.out.println(selectedText);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	}

}
