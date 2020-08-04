package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumMethods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_10_ClassNameConcept {

	public static void main(String[] args) throws InterruptedException {// TODO
																		// Auto-generated
																		// method
																		// stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://hubspot.com/login");
		Thread.sleep(5000);

		// WebElement

		// WebElement userElement=driver.findElement(By.className("form-control
		// private-form__control login-email"));
		// userElement.sendKeys("ayla@gmail.com");

		// form-control private-form__control login-email
		By username = By.className("login-email");
		ElementUtil.getElement(driver, username).sendKeys("ayla@gmail.com");

	}

}
