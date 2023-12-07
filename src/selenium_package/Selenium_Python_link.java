package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Python_link {

	public static void main(String[] args) {
		// Sets the system property to specify the path to the chromedriver
				 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
					
				    // Create the object name 'browserObject' for ChromeDriver class
				  ChromeDriver  browserObject = new ChromeDriver();
				  
				    // This code Open google.com page using 'get' method 
				    browserObject.get("https://www.google.com/");
				    
				    
				    
				    //Locate the search bar element by name and send desired values
				    browserObject.findElement(By.name("q")).sendKeys("Selenium Python");
				    
				 

				    
				    //Locate the search button by name and perform click
				    browserObject.findElement(By.name("btnK")).submit();
	}

}
