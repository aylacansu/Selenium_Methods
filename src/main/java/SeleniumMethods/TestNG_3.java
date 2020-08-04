package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_3 {

	public static WebDriver driver;
	static By name = By.className("validate[required]");
	static By email = By.xpath("//input[@placeholder='E-mail *']");
	static By tel = By.name("telephone");
	static By country = By.xpath("//input[@placeholder='Country']");
	static By comp = By.xpath("//input[@placeholder='Company']");
	static By messg = By.xpath("//textarea[@placeholder='Message']");
	static By submt = By.xpath("//a[@class='dt-btn dt-btn-m dt-btn-submit']");
	static By invalidMail=By.xpath("//div[contains(text(),'* Invalid email address')]");
	static By invalidPhone=By.xpath("//div[contains(text(),' Invalid phone number')]");

   @BeforeMethod
   public void setUp(){
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.get(" http://www.seleniumframework.com/Practiceform/");
   }
   
   @Test(priority=1,description="get title method: seleniumframework")
   public void getTitle(){
		String title = driver.getTitle();
		System.out.println("Title of Page ::" + title);
		Assert.assertEquals(title, "Selenium Framework | Practiceform");
	
   }
   @Test (priority=2)
    public void invalidMailAddress() throws InterruptedException{
		ElementUtil.getElement(driver, name).sendKeys("Ayla");
		
		ElementUtil.getElement(driver, email).sendKeys("can@gmail.c");
		
		ElementUtil.getElement(driver, tel).sendKeys("1234569");
		
		ElementUtil.getElement(driver, country).sendKeys("USA");
	
		ElementUtil.getElement(driver, comp).sendKeys("SiliconeLabs");
		
		ElementUtil.getElement(driver, messg).sendKeys("I'm learning Selenium");
	
		ElementUtil.getElement(driver, submt).click();
		
		String text=ElementUtil.getElement(driver, invalidMail).getText(); //actual result
		
		Assert.assertEquals(text, "* Invalid email address"); //expected result
		
}
   
   @Test (priority=3)
   public void invalidPhoneNumber() throws InterruptedException{
		ElementUtil.getElement(driver, name).sendKeys("Ayla");
		
		ElementUtil.getElement(driver, email).sendKeys("can@gmail.com");
		
		ElementUtil.getElement(driver, tel).sendKeys("12er34ay");
		
		ElementUtil.getElement(driver, country).sendKeys("USA");
	
		ElementUtil.getElement(driver, comp).sendKeys("SiliconeLabs");
		
		ElementUtil.getElement(driver, messg).sendKeys("I'm learning Selenium");
	
		ElementUtil.getElement(driver, submt).click();
		String text=ElementUtil.getElement(driver, invalidPhone).getText();
		Assert.assertEquals(text, "* Invalid phone number");
		
}  
   
   
   
   @AfterMethod
     public void tearDown(){
		System.out.println("Test complited succesfuly");
		driver.close();
		
   }
		



}
