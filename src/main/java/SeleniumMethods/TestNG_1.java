package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.security.action.GetBooleanAction;

public class TestNG_1 {

	public static WebDriver driver;

	 By clckBtn = By.xpath("//button[@class='btn btn-default']");

	    @BeforeMethod
      public void setUP() throws InterruptedException{
		
	    WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        String url = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
		driver.get(url);
		Thread.sleep(5000);
		
}
	    @Test(priority=1, description= "get title method:seleniumeasy Javascript")
	    public void getTitle(){
		String title=driver.getTitle();
		System.out.println("Title of Page :: " +title);
		Assert.assertEquals(title,"Selenium Easy Demo - Automate All Scenarios");
		//Assert.assertEquals(title, "Selenium Easy Demo - Automate All Scenarios");
	    }
	    
	    
	    @Test (priority=2 ,description="to handle Alert")
	    public void handleAlert(){
	    
		ElementUtil.getElement(driver, clckBtn).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		Assert.assertEquals(text, "I am an alert box!");
        alert.accept();
		 }
	    
	    
		@AfterMethod
		
	    public void tearDown(){
		 System.out.println("Test complited");
		 driver.close();
		 }
		
	}


