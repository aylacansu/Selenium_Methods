package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sel_25_SingleDropDown_2 {
	public static By dropDown = By.id("justAnInputBox");
	public static By dropall = By.xpath("//span[@class='comboTreeItemTitle']");

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		selectSingleValue(driver, dropall, "choice 3");
		

		
		}
	
		public static void selectSingleValue(WebDriver driver, By locator, String value) {
			List<WebElement> dropdown = driver.findElements(locator);
			for (int i = 0; i < dropdown.size(); i++) {
				String text = dropdown.get(i).getText();
				System.out.println(text);

				try {
					if (!text.isEmpty()) {
						if (text.equals(value)) {
							dropdown.get(i).click();
							break;
	}
	}
				} catch (Exception e) {
					
				}

			}
	}
	
	
	
	
	
	

}
