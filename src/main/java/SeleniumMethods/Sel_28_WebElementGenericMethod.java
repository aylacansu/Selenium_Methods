package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sel_28_WebElementGenericMethod {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ElementUtil.launchURL(driver, "https://www.w3schools.com/html/html_tables.asp");

		String beforexPath="//table[@id='customers']/tbody/tr[";		
		String afterxPathCompany="]/td[1]";	
		String afterxPathContact="]/td[2]";	
		String afterxPathCountry="]/td[3]";	

		tableCount(driver, beforexPath, afterxPathCompany);
		tableCount(driver, beforexPath, afterxPathContact);
		tableCount(driver, beforexPath, afterxPathCountry);

			}
			
		public static void  tableCount(WebDriver driver,String beforexPath,String afterxPath){	
		List<WebElement> rowList=driver.findElements(By.xpath("//table[@id='customers']//tr"));	
			//return rowList.size();
		//System.out.println(rowList.size());
		for (int i = 2; i < rowList.size(); i++) {
			String actualxPath=beforexPath+ i + afterxPath;
		WebElement element=driver.findElement(By.xpath(actualxPath));
		System.out.println(element.getText());	
		}	
			
			
			
			
		}	
		
		
		
		
		
		
	}


