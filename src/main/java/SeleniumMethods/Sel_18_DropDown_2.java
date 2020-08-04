package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_18_DropDown_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ic/Documents/DRIVERS/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebok.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		//using visible text
		
//		selectDropDownValueByText(day, "9");
//		selectDropDownValueByText(month, "Sep");
//		selectDropDownValueByText(year, "2012");
		
		//using index method
		selectDropDownByIndex(day, 9);
		selectDropDownByIndex(month, 9);
		selectDropDownByIndex(year, 9);
		
		
	}

	/**
	 * selectbyVisibleText
	 * @param element
	 * @param value
	 */
	public static void selectDropDownValueByText(WebElement element,String value){
		Select select=new Select(element);
		select.selectByVisibleText(value);
		
	}
	/**
	 * index
	 * @param element
	 * @param index
	 */
	public static void selectDropDownByIndex(WebElement element,int index){
		Select  select=new Select(element);
		select.selectByIndex(index);
	}
	
	
	
	
	
}
