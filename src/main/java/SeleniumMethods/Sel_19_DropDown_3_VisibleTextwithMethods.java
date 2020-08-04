package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_19_DropDown_3_VisibleTextwithMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ic/Documents/DRIVERS/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebok.com");

		// Locators
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		selectDropDownByVisibleText(driver, day, "9");
		selectDropDownByVisibleText(driver, month, "Sep");
		selectDropDownByVisibleText(driver, year, "2012");
		
	}

	/**
	 * VisibleText
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropDownByVisibleText(WebDriver driver, By locator, String value) {
		WebElement element =getElement(driver, locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

	/**
	 * Get Element
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */

	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

}
