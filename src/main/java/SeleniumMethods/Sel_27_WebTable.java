package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_27_WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		String beforexPath = "//*[@id='customers']/tbody/tr[";
		String afterxPathCompany = "]/td[1]";

		System.out.println("*******COMPANY*********");
		
		// *[@id="customers"]/tbody/tr[2]/td[1] td==column tr==row
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]

		for (int i = 2; i <= 7; i++) {
			String actualxPath = beforexPath + i + afterxPathCompany;
			WebElement element = driver.findElement(By.xpath(actualxPath));
			System.out.println(element.getText());
			if (element.getText().equals("Island Trading")) { // to take
																// specific
																// element
				System.out.println(element.getText());
				break;

			}
		}

		System.out.println("***CONTACT******");

		// *[@id="customers"]/tbody/tr[2]/td[2]
		// *[@id="customers"]/tbody/tr[3]/td[2]
		// *[@id="customers"]/tbody/tr[4]/td[2]

		String afterxPathContact = "]/td[2]";
		for (int i = 2; i <= 7; i++) {
			String actualxPath = beforexPath + i + afterxPathContact;
			WebElement element = driver.findElement(By.xpath(actualxPath));
			System.out.println(element.getText());
		}

		System.out.println("********COUNTRY*********");
		// *[@id="customers"]/tbody/tr[2]/td[3]
		// *[@id="customers"]/tbody/tr[3]/td[3]
		// *[@id="customers"]/tbody/tr[4]/td[3]

		String afterXpathCountry = "]/td[3]";

		for (int i = 2; i <= 7; i++) {
			String actualXpath = beforexPath + i + afterXpathCountry;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());

		}

	}
}