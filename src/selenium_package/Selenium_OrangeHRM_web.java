package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_OrangeHRM_web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver browserObject;
		  //1. setup the property of chromedriver to pass value to form input box through chrome web browser.
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			
		    // 2. Initialize Webdriver object through ChromeDriver class.
		    browserObject = new ChromeDriver();
		    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
		    browserObject.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
		    // sending text to the input box in the web form--------------
		    // 4. Locate Name section using name locator and send values using sendkeys
		    browserObject.findElement(By.name("username")).sendKeys("Admin");
		    
		    browserObject.findElement(By.name("pass")).sendKeys("123456BB!");
		    
		    browserObject.findElement(By.name("submit")).sendKeys("submit");
		   // browserObject.findElement(By.name("comment")).sendKeys("Comment only");
		
		
	}

}
