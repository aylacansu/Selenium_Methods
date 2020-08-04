package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumMethods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_12_XpathConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://hubspot.com/login")	;
		Thread.sleep(5000);
		
	
		WebElement userElement =driver.findElement(By.xpath("//input[@id='username']"));
		userElement.sendKeys("ayla@gmail.com");
		
		WebElement userPass =driver.findElement(By.xpath("//input[@id='password']"));
		userPass.sendKeys("12341234");
		
		WebElement loginBtn =driver.findElement(By.xpath("//button[@id='loginBtn']"));
		loginBtn.click();
		
		//
		
		
		By username=By.xpath("//input[@id='username']");
		By password=By.xpath("//input[@id='password']");
		By lognBtn=By.xpath("//button[@id='loginBtn']");
		
		ElementUtil.getElement(driver, username).sendKeys("ayla@gmail.com");
		ElementUtil.getElement(driver,password).sendKeys("12341234");
		ElementUtil.getElement(driver, lognBtn).click();
		
		
		
		
		
		
		
		
		

	}

}
