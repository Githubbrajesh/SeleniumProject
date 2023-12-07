package selenium_package;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_2nd_Program {
  @Test
 
  public void Open_and_Close_AmazonSite() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 3. Initialize WebDriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
	        System.out.println("Open /close  amazon.com in chrome browser");
		 // 4. Open the web page http://www.amazon.com/ in first test case 
	        browserObject.get("http://www.amazon.com/");
		 // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
	        Thread.sleep(2000);
		// 6. close the browser
	        browserObject.close();
	  
	  
	  
  }
  
  @Test
  
  public void Open_and_Close_cnbc() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 3. Initialize WebDriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
	        System.out.println("Open /close  cnbc.com in chrome browser");
		 // 4. Open the web page http://www.amazon.com/ in first test case 
	        browserObject.get("http://www.cnbc.com/");
		 // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
	        Thread.sleep(2000);
		// 6. close the browser
	        browserObject.close();
   

}
}