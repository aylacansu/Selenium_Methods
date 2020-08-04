package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumMethods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_09_NameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		
		Thread.sleep(3000);
		
		
		//WebElement
		
		//WebElement userElement=driver.findElement(By.name("username"));
		//userElement.sendKeys("ayla@gmail.com");
		
		//
		
		//driver.findElement(By.name("username")).sendKeys("ay@gmail.com");
		
		//By 
		
		By username=By.name("username");
		By pass=By.name("password");
		//WebElement element=driver.findElement(username);
		//WebElement element2=driver.findElement(pass);
		//element.sendKeys("ay@gmail.com");
		//element2.sendKeys("12341234");
		
		//fourth
//		
	ElementUtil.getElement(driver, username).sendKeys("ay@gmail.com");
	ElementUtil.getElement(driver,pass ).sendKeys("1234");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
