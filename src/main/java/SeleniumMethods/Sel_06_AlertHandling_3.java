package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_06_AlertHandling_3 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// profesianal usage for Alert Handling

		String url = "https://mail.rediff.com/cgi-bin/login.cgi";

		By goBtn = By.name("proceed");

		// Launch browser

		driver = ElementUtil.launchBrowser(driver, "chrome");

		// launch url

		ElementUtil.launchURL(driver, url);

		// get title

		System.out.println(ElementUtil.getPageTitle(driver));

		// click on Sign button

		ElementUtil.clickOn(driver, goBtn);
		Thread.sleep(4000);

		// handling alert

		String text = ElementUtil.getAlertText(driver);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct text");
		} else {
			System.out.println("incorrect text");
		}

		// Close browser

		ElementUtil.quitBrowser(driver);

	}

}
