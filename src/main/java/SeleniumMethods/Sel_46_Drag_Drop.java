package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_46_Drag_Drop {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
		
	Actions actions=new Actions(driver);	         //Actions is a class..
	
	//First usage
	//actions.dragAndDrop(drag, drop).build().perform();
	
	//Second usage
	actions.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		
		
		
	}

}
