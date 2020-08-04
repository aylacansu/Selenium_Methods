package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.net.www.content.text.plain;

public class Sel_08_IDConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // ChromeOptions--maximize
		driver.manage().deleteAllCookies(); //
		driver.get("http://app.hubspot.com/login");
		Thread.sleep(5000);

		// ID is a locator in HTML(DOM) ...Id is unique

		// First
		// WebElement userElement=driver.findElement(By.id("username"));
		// userElement.sendKeys("ayla@gmail.com");
		//
		// WebElement userPass=driver.findElement(By.id("password"));
		// userPass.sendKeys("1234");
		//
		// WebElement loginBtn=driver.findElement(By.id("loginBtn"));
		// loginBtn.click();

		// Second Usage
		// driver.findElement(By.id("username")).sendKeys("ayla@gmail.com");
		// driver.findElement(By.id("password")).sendKeys("1234");

		// Third

		By username = By.id("username");
		By password = By.id("password");
		WebElement userElement = driver.findElement(username);
		WebElement userElement1 = driver.findElement(password);
		userElement.sendKeys("ayla@gmail.com");
		userElement1.sendKeys("12341234");

		// WebElement.findElement() and driver.findElement() difference:
		// WebElement.findElement() checks a specific area
		// driver.findElement() checks the whole webPage

		// Fourth****Best choise

		// ElementUtil.getElement(driver, username).sendKeys("ayla@gmail.com");
		// ElementUtil.getElement(driver,password).sendKeys("12341234");

	}

}
