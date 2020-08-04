package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_49_CustomizeXPath {
	// What is XPath?

	// xPath is defined XML(HTML) path.It is a syntex or language for finding
	// any element
	// on the webpage using XML path expression.

	// What syntex XPath ?

	//  >>>> select current node(tag)

	// tagname[@attribute='value']

	// Xpath Types

	// Absolute Xpath==

	// Relative Xpath==

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v1/");

		// input[@name='uid']
		// input[@type='text']
		// input[@onkeyup='validateuserid();']

		// input[@type='password']
		// input[@name='password']

		// loginbtn
		// input[@name='btnLogin']
		// input[contains(@type,'reset')]

		// or -----and
		// input[@value='RESET']
		// input[@value='RESET' and @name='btnReset']
		
		//*[@type='submit' or  @name='btnReset'] >>>works
		//*[@type='submit' and  @name='btnReset']  >>> doesn't work

		// visit
		// a[@href='http://demo.guru99.com/']

		// starts-with 
		//for dynamic concept
		// *[starts-with(@id,'message')]

		
		// text() >>>>> UserID(*)
		// *[text()='UserID']
		// *[contains(text(),'UserID')]

		
		
		
		// following==select all elements in the document of the  current node(tag)
        // *[@type='password']//following::input   >>input tag 'i olanlar
		// *[@type='password']//following::input[1] >>1. columda olani(td1)
		// *[@type='password']//following::input[2] >>2. columda olani(td2) 

		
		
		//ancestor axes===it selects all ancestors(grandfather--parent)of the current node(tag)
		//guru99.com
		
		//The ancestor axis selects all ancestors (granparent, parent, ...) of the current node
		//*[text()='Testing']//ancestor::div
		//*[text()='Testing']//ancestor::div[1]  >>>parent
		//*[text()='Testing']//ancestor::div[2]  >>grandparent
		
		
		//  ============ child ==================
		//*[@id='java_technologies']//child::li
		//*[@id='java_technologies']//child::li[1]
		//*[@id='java_technologies']//child::li[2]
		
		
		//=========== preceding==previous ===============
		//It select all nodes that come before the current node
		//input[@type='submit']//preceding::td
		//input[@type='submit']//preceding::input
		
		//============ following-sibling ==========
		//input[@type='submit']//following-sibling::input
		//input[@type='submit']//following-sibling::input[1]
		
		//============= parent ==================
		//*[@id='java_technologies']//parent::div
		//*[@id='java_technologies']//parent::div[1]
		//*[@id='java_technologies']//parent::div[2]
		
		//============= self ================
		//selects the current node or 'self' means it indicates the node itself
				//input[@type='password']//self::input
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
