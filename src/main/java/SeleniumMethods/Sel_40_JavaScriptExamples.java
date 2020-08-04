package SeleniumMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// JavaScriptExecutor is an Interface that helps to execute JavaScript 
//through Selenium Webdriver. 
//JavaScriptExecutor provides two methods 
//"executescript" & "executeAsyncScript" 
//to run javascript on the selected window or current page.


public class Sel_40_JavaScriptExamples {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://hubspot.com/login");
		driver.get("https://darksky.net/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	//get title with javaScript
//String title=JavaScriptUtil.getTitleByJS(driver);	
//System.out.println(title);
//
//    //click with JavaScript
//WebElement signUplink=driver.findElement(By.linkText("Sign up"));
//JavaScriptUtil.clickElementByJS(signUplink, driver);
//Thread.sleep(2000);
//
//    //refresh with JavaScript
//JavaScriptUtil.refreshBrowserByJS(driver);	
//		
//	//generate Alert	//to give extra information
//JavaScriptUtil.generateAlert(driver, "This page is sign up page");
//Alert alert = driver.switchTo().alert();
//alert.accept();		

//send keys method

//WebElement username=driver.findElement(By.id("username"));
//JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "ayla@gmail.com");
//Thread.sleep(2000);
//WebElement password=driver.findElement(By.id("password"));
//JavaScriptUtil.sendKeysUsingJSWithID(driver, "password", "12345678");
//Thread.sleep(2000);
//WebElement loginBtn =driver.findElement(By.id("loginBtn"));
//JavaScriptUtil.clickElementByJS(loginBtn, driver);
//Thread.sleep(2000);


//flash method

//WebElement username=driver.findElement(By.id("username"));
//WebElement password=driver.findElement(By.id("password"));
//WebElement loginBtn =driver.findElement(By.id("loginBtn"));
//JavaScriptUtil.flash(username, driver);
//username.sendKeys("ayla@gmail.com");
//JavaScriptUtil.flash(password, driver);
//password.sendKeys("1234566");
//JavaScriptUtil.flash(loginBtn, driver);
//loginBtn.click();


//getInnerText
//System.out.println(JavaScriptUtil.getPageInnerText(driver));

//GetBrowserInfo
//System.out.println(JavaScriptUtil.getBrowserInfo(driver));

//ScrollPageDown
//JavaScriptUtil.scrollPageDown(driver);

//SpecificScrollPageDown
//JavaScriptUtil.specificScrollPageDown(driver);

WebElement privacy=driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
JavaScriptUtil.scrollPageDown(driver);
JavaScriptUtil.scrollIntoView(privacy, driver);
//JavaScriptUtil.clickElementByJS(privacy, driver);









	}

}
