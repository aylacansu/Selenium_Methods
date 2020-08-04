package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_26_MultipleDropDown_3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		selectMultipleDropDown(driver, "choice 1", "choice 2");

	}

	//Args concepts(...)    ==multiple elements
	
	public static void selectMultipleDropDown(WebDriver driver, String... value) {
		List<WebElement> droplist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(droplist.size());

		// to write all options

		for (int i = 0; i < droplist.size(); i++) {
			// System.out.println(droplist.get(i).getText());
			String text = droplist.get(i).getText();
			System.out.println(text);

			// Array---to choice multiple value

			for (int j = 0; j < value.length; j++) {
				try {
					if (!text.isEmpty()) {
						if (text.equals(value[j])) {
							droplist.get(i).click();
							break;
						}
					}

				} catch (Exception e) {
					// TODO: handle exception
				}

			}

		}

	}
}
