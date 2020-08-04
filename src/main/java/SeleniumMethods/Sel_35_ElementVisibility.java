package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_35_ElementVisibility {

	public static void main(String[] args) {
		
		
		
		        // isDisplayed====gorunurluk
				// isEnabled====etkinlik
				// isSelected===secilmis olmasi

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/register");	
		
		
		WebElement submitElement=driver.findElement(By.id("submitButton"));
		System.out.println(submitElement.isDisplayed());  //true
		System.out.println(submitElement.isEnabled()); 
		//false
		System.out.println("click button is checking");
		System.out.println(driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected()); //false
		
		
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
		
		System.out.println("*******************");
		System.out.println(submitElement.isDisplayed());  //true
		System.out.println(submitElement.isEnabled());    //true
		
		System.out.println("click button is checking");
		System.out.println(driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected()); //true
		
		
		
		
	}

}
