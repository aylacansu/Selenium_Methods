package SeleniumMethods;

import java.nio.channels.ScatteringByteChannel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_23_DropDownOptions {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebok.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(day);

		List<WebElement> dayOptions = select.getOptions();
		System.out.println();
		dayOptions.size();

		for (int i = 0; i < dayOptions.size(); i++) {
			String text = dayOptions.get(i).getText();
			System.out.println(text);
		}

	}

}
