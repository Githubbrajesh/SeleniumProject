
//This program will open this pages "http://training.qaonlinetraining.com/testPage.php" and select country
package selenium_package;// package name is Selenium_package
import org.openqa.selenium.By;//importing selenium By class
import org.openqa.selenium.WebDriver;//Importing WebDriver class
import org.openqa.selenium.chrome.ChromeDriver;//Importing ChromeDriver class
import org.openqa.selenium.support.ui.Select;//Importing support.ui.select

public class Selenium_Select {//name of this program is Selenium_Select

	//code execution start after main method
	
	public static void main(String[] args) {
		// using chrome webdriver and specifying location of chromedriver on my machine
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Create browserObject so you can use all the methods of this WebDriver class
        	WebDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		// 4. Select class is used in case of Dropdown. Select class object countrySelect specifies the webElement location.
	        Select countrySelect = new Select(browserObject.findElement(By.name("country")));//Locate the county name and select it.
	        
	        countrySelect.selectByVisibleText("Ethiopia");// Locate the county name called Ethiopia
		
		
	}

}
