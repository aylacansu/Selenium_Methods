package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_04_AlertHandling1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// Locator
		driver.findElement(By.name("proceed")).click();

		Thread.sleep(4000);

		// to handle alert in Selenium ,we will use Alert interface

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);
		
		//Verification
		if(text.equals("Please enter a valid user name")){
			System.out.println("Correct text and "+text);
			
		}else{
			System.out.println("incorrect text "+text);
		}
		
		
		
		
		
		//alert.accept();//it means CLICK OK button on the alert.
		alert.dismiss();
	    driver.close();
	    System.out.println("test completed");
	    driver.quit();

	}

}
