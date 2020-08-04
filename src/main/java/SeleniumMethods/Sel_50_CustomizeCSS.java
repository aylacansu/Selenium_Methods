package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_50_CustomizeCSS {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		By username=By.cssSelector("#username");
		//    input[type='email']
		//    input[id='username']
		
        //	  input[class='form-control private-form__control login-email']     
///////    input.login-email   >>>sadece child class icin(login-email)
		
	    //    input[class*='form-control private-form__control login-email'] >>>contains
		//    input[id*='username']    >>>contains
		//    input[id^='username']    >>>starts-with
		
		//    div>input[type='email']  >>>parent
		
		///    parent   //////
		//guru99.com/v1/
		//   td>label[id='message23']
		
		
	}

}
