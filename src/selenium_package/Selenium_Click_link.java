package selenium_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Click_link {

	private Object browser;

	public static void main(String[] args) {
		// 1. setup the property of WebDriver to perform "linktext" through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 2. Initialize WebDriver object through ChromeDriver class.
        WebDriver  browserObject = new ChromeDriver();
       
	// 3. Open the web page https://www.google.com/
        browserObject.get("https://www.itlearn360.com/");
	// 4. The value of text link is stored in bloglink reference . Here TextLink is a locator that checks wether a text is link or not.		  
        WebElement blogLink = browserObject.findElement(By.linkText("Blog"));
        blogLink.click();

		
	}

}
