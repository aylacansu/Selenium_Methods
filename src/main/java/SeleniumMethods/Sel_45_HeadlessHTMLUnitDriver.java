package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_45_HeadlessHTMLUnitDriver {
	public static void main(String[] args) {

		
		// HtmlUnitDriver is like a super class for browser...WE can choose all browseerr
		
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.operadriver().setup();
		
		
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.siliconelabs.com");
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		

	}

}
