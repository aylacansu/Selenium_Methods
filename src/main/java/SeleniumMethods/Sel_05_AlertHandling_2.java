package SeleniumMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_05_AlertHandling_2 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// Locator
		driver.findElement(By.name("proceed")).click();

		Thread.sleep(4000);
		
		if(ElementUtil.getAlertText(driver).equals("Please enter a valid user name")){
		System.out.println("Correct text");
		}else{
			System.out.println("incorrect text");
		}
		driver.close();
		System.out.println("test completed");
		
		
		//getAlertText();  
		//Asagida olusturdugumuz getAlertText() metodunu cagirdik..
		
	}
	
	//Generic Method(common methods)
//	public static  String getAlertText(){
//		Alert alert=driver.switchTo().alert();
//		String text=alert.getText();
//		System.out.println(text);
//		alert.dismiss();
//		return  text;
//	}
		
		

	

}
