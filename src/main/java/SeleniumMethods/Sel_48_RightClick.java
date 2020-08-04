package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_48_RightClick {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions actions = new Actions(driver);
		WebElement rightclick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		actions.contextClick(rightclick).build().perform();

		// >>>>for copy //span[contains(text(),'copy')
		WebElement copy = driver.findElement(By.xpath("//li[contains(@class,'context-menu-icon-copy')]"));
		String text = copy.getText();
		System.out.println(text);
		copy.click();
		ElementUtil.getAlertText(driver);

	}

}
