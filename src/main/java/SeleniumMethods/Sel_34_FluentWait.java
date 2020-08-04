package SeleniumMethods;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_34_FluentWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");

		driver.findElement(By.xpath("//button[contains(text(), 'Click Me - Fluent Wait')]")).click();
		
		
		//Define FluentWait

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				// .pollingEvery(Duration.ofSeconds(0)) //500 miliseconds
				.ignoring(NoSuchMethodException.class);
		
		
		//Apply the FluentWait

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.id("demo"));

				String textPage = element.getText();

				if (textPage.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println("correct Text" +textPage);
					return element;
				} else {
					System.out.println("text  is wrong");
					return null;
				}
			}

		});

	}

}
