package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_41_FrameHandling {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://londonfreelance.org/courses/frames/index.html");
	
	
	//getTitle
	// switchTo.frime    >>>>to switch between frame and page
	driver.switchTo().frame(driver.findElement(By.name("main")));
	System.out.println(driver.getTitle());	
	
	//getText----get Title
	WebElement header=driver.findElement(By.xpath("//h2[contains(text(),'Title bar')]"));
	System.out.println(header.getText());
	System.out.println(driver.getTitle());
	
	
	//switchTo().defaultContent();   >>>>>to switch main page
	
	
	driver.switchTo().defaultContent();	
	System.out.println(driver.getTitle());	

	}

}
