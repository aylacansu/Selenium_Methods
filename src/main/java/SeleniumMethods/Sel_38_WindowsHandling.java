package SeleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_38_WindowsHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");	
		driver.findElement(By.className("black")).click();
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String> iterator=handles.iterator();
		
		String parentWindowID= iterator.next();
		System.out.println(parentWindowID);
		
		String childWindowId=iterator.next();
		System.out.println(childWindowId);
		
		//SwitchTo() windows
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		//driver.close();
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		//driver.close();
		
		
		

	}

}
