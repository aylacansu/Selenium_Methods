package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_01_WebDriverWithChrome {

	public static void main(String[] args) {
		// Set property
		System.setProperty("webdriver.chrome.driver", "/Users/ic/Documents/DRIVERS/chromedriver");// 1.my
																									// concept

		// setup browser
		WebDriver driver = new ChromeDriver();

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
