package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_02_WebDriverFireFox {

	public static void main(String[] args) {
		// Set property
		System.setProperty("webdriver.gecko.driver", "/Users/ic/Documents/DRIVERS/geckodriver");// 1.my
																								// concept

		// setup browser
		WebDriver driver = new FirefoxDriver();

		// launch browser

		driver.get("https://siliconelabs.com/");

		// get title

		String title = driver.getTitle();
		System.out.println(title);

		// Verification title

		if (title.equals("Homepage - SiliconeLabs")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");
		}

		String URL = driver.getCurrentUrl();
		System.out.println("Current URL : " + URL);
		// System.out.println(driver.getPageSource());

		driver.close();// close current browser
		driver.quit();// close all browsers

	}

}
