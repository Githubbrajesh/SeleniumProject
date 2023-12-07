//This program will open this login pages "("http://www.facebook.com")

package selenium_package;// package name is Selenium_package


import org.openqa.selenium.By;//importing selenium By class
import org.openqa.selenium.WebDriver;//Importing WebDriver class
import org.openqa.selenium.chrome.ChromeDriver;//Importing ChromeDriver class

public class Selenium_Facebook_web {//name of this program is Selenium_Facebook_web

	
	//code execution start after main method
	
	public static void main(String[] args) {
		
		 // using chrome webdriver and specifying location of chromedriver on my machine
		
		WebDriver browserObject;
		  //1. setup the property of Webdriver to pass value to form input box through chrome web browser.
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			
		  //creating broweserObject. This object will be like ChromeDriver class
		    browserObject = new ChromeDriver();
		    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
		    browserObject.get("http://www.facebook.com");
		    
		    // sending text to the input box in the web form--------------
		    // 4. Locate Name section using name locator and send values using sendkeys
		    browserObject.findElement(By.name("email")).sendKeys("bp@gmail.com");// . Locate the name email   to enter email.
		    
		    browserObject.findElement(By.name("pass")).sendKeys("GO");//Locate the Pass button to enter Password
		    
		    browserObject.findElement(By.name("login")).click();//Locate the login button and perform login 
	}
		
		

	

}
