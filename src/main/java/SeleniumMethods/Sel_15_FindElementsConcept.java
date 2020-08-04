package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_15_FindElementsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.com");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//  findelements ==tagName
		//  all links start  ( a ) tag
		
		
		List<WebElement>linkList = driver.findElements(By.tagName("a"));
		
		//Size
		
		System.out.println("Total links are: "+ linkList.size()); //126
		
		for(int i= 0; i<linkList.size();i++){
			String text = linkList.get(i).getText();
			//System.out.println(text);
			
			if(!text.isEmpty()){
				System.out.println(text);
			}
			Thread.sleep(5000);
			
			if(text.equals("Forgot Password?")){
				linkList.get(i).click();
				break;
			}
			
			//Thread.sleep(5000);
			//driver.quit();
			
		}
		
		

	}

}