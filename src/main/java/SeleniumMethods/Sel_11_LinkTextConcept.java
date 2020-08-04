package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumMethods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_11_LinkTextConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://hubspot.com/login")	;
		Thread.sleep(5000);
		
		//By  signUp=By.linkText("Sign up");
		By signUpPar=By.partialLinkText("Privacy");
		//ElementUtil.getElement(driver, signUp).click();
		ElementUtil.getElement(driver, signUpPar).click();
         
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
