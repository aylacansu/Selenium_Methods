package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_24_MultipleDropDown_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// to reach page

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		// to click
		driver.findElement(By.id("justAnInputBox")).click();

		// to take all options's size

		List<WebElement> droplist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(droplist.size());

		// to write all options

		for (int i = 0; i < droplist.size(); i++) {
			// System.out.println(droplist.get(i).getText());
			String text = droplist.get(i).getText();
			System.out.println(text);

			// ignore empty values

			if (!text.isEmpty()) {
				System.out.println(droplist.get(i).getText());
			}

			//to select "choice 5"
			
			if (text.equals("choice 5")) {
				droplist.get(i).click();
				break;

			}
		}

	}

}