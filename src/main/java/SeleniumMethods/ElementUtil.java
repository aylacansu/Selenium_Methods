package SeleniumMethods;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * 
 * @author ic
 *
 */

public class ElementUtil {
	// this class name can be (Element) or (ElementUtil)
	// we create common methods for all test cases.
	// we can use these methods again and again.

	/**
	 * This method is used to handle alert.
	 * 
	 * @param driver
	 * @return
	 */
	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;

	}

	/**
	 * This method is used to launch browser
	 * 
	 * @param driver
	 * @param browserName
	 * @return
	 */
	public static WebDriver launchBrowser(WebDriver driver, String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/ic/Documents/DRIVERS/chromedriver");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/ic/Documents/DRIVERS/geckodriver");
			driver = new FirefoxDriver();

		} else {
			System.out.println("Invalid Browser" + browserName);
		}

		return driver;

	}

	/**
	 * This method is used to navigate URL
	 * 
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		driver.get(url);
	}

	/**
	 * This method is used to get title webpage
	 * 
	 * @param driver
	 * @return
	 */
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	/**
	 * This is used to get element
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */

	public static WebElement getElement(WebDriver driver, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement element = driver.findElement(locator);
		return element;
	}

	/**
	 * This method is used send keys
	 * 
	 * @param driver
	 * @param locator
	 * @param keys
	 */
	public static void sendKeys(WebDriver driver, By locator, CharSequence... keys) {
		driver.findElement(locator).sendKeys(keys);
	}

	/**
	 * This method is used to click on the element from the HTML
	 * 
	 * @param driver
	 * @param locator
	 */

	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();

	}

	/**
	 * This is close browser
	 * 
	 * @param driver
	 */

	public static void closeBrowser(WebDriver driver) {
		driver.close();

	}

	/**
	 * this is quit browser
	 * 
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();

	}

	/**
	 * To verify text
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void verifyText(WebDriver driver, By locator, String value) {
		WebElement element = driver.findElement(locator);
		String text = element.getText();
		if (text.equals(value)) {
			System.out.println("Correct text :: " + text);

		} else {
			System.out.println("Incorrect text");
		}
	}

	
	/**
	 * verify URL
	 * @param driver
	 * @param URL
	 */
	public static void verifyURL(WebDriver driver, String URL) {

		String url = driver.getCurrentUrl();
		System.out.println("Current URL : " + URL);
		if (url.equals(URL)) {
			System.out.println("You are in correct URL " + URL);
		} else {
			System.out.println("You are NOT in Correct URL");
		}
	}

	/**
	 * Takes Screenshot Shot
	 * @param driver
	 * @param path
	 * @throws IOException
	 */
	
	
	public static void tajesScreenShot(WebDriver driver, String path) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));

	}
	
	/**
	 * Select SingleValue
	 * @param driver
	 * @param locator
	 * @param value
	 */

	public static void selectSingleValue(WebDriver driver, By locator, String value) {
		List<WebElement> dropdown = driver.findElements(locator);
		for (int i = 0; i < dropdown.size(); i++) {
			String text = dropdown.get(i).getText();
			// System.out.println(text);

			try {
				if (!text.isEmpty()) {
					if (text.equals(value)) {
						dropdown.get(i).click();
						System.out.println("correct text:::" + text);
						break;
					}
				}
			} catch (Exception e) {

			}

		}
	}
/**
 * verify Selection WithIndex using FirstSelectedOption
 * @param driver
 * @param locator
 * @param index
 * @param text
 */
	public static  void selectByIndexWithFirstOption(WebDriver driver,By locator,int index,String text){	
		WebElement element=ElementUtil.getElement(driver, locator)	;
		Select select=new Select(element);
		select.selectByIndex(index);

		select.getFirstSelectedOption().getText();
		if(select.getFirstSelectedOption().getText().equals(text)){
			System.out.println("correct selection" );
		}else{
			System.out.println("incorrect selection");
		}
	
	}
	
	/**
	 * Select  Multiple Value
	 * @param driver
	 * @param value
	 */
	public static void selectMultipleDropDown(WebDriver driver, String... value) {
		List<WebElement> droplist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(droplist.size());

		// to write all options

		for (int i = 0; i < droplist.size(); i++) {
			// System.out.println(droplist.get(i).getText());
			String text = droplist.get(i).getText();
			System.out.println(text);

			// Array---to choice multiple value

			for (int j = 0; j < value.length; j++) {
				try {
					if (!text.isEmpty()) {
						if (text.equals(value[j])) {
							droplist.get(i).click();
							System.out.println("correct text:::" + text);
							break;
						}
					}

				} catch (Exception e) {
					// TODO: handle exception
				}

			}

		}

	}
	
	
	/**
	 * select Multiple DropDown
	 * @param driver
	 * @param locator
	 */
	public static void selectmultipleDropDown_Easy(WebDriver driver,By locator){	
		
		List<WebElement>allOptions=driver.findElements(locator);
			System.out.println(allOptions.size());
			for (int i = 0; i < allOptions.size(); i++) {
				String text=allOptions.get(i).getText();
				System.out.println(text);
				allOptions.get(i).click();
				
			}	
			
			
			
		}
			
	
	
	
	
	
/**
 * to get AllOptions_Select
 * @param driver
 * @param locator
 */
	public static void getAllOptions_Select(WebDriver driver,By locator){	
		
		WebElement element=ElementUtil.getElement(driver, locator)	;
		Select select = new Select(element);
		List <WebElement>options=select.getOptions();
		for(int i=0 ;i<options.size() ;i++){
			System.out.println(options.get(i).getText());
			
		}	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
