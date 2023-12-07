

//This program will open this pages "http://training.qaonlinetraining.com/testPage.php" and it will give you alert. Show you how to handle the Alert. Click the button and alert button will open.
package selenium_package;// package name is Selenium_package


import org.openqa.selenium.Alert;//importing Alert class
import org.openqa.selenium.By;//importing selenium By class
import org.openqa.selenium.chrome.ChromeDriver;//importing selenium ChromeDriver class
public class Selenium_alert {//name of this program is Selenium_ClickonOK_Alert_

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe"); // using chrome webdriver and specifying location of chromedriver on my machine
		
		ChromeDriver browserObject = new ChromeDriver();// //creating broweserObject. This object will be like ChromeDriver class
		
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
		// 4. Locate the alert button and perform click 

	        
	        Thread.sleep(6000);
	        browserObject.findElement(By.id("alert")).click(); // Locate the name id button alert.
	        
	        
		// 5. switch to alert box
	        Alert alert = browserObject.switchTo().alert();
// 6. getText method is used to get the text from alert box 
	        System.out.println(alert.getText());
		// 7. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method	
	        Thread.sleep(6000); // wait for 6000 milli seconds
		
		// 8. Switch the browserObject control to alert box and accept the alert using accept method 
	        alert.accept(); //hit the ok button on the alert window
	      Thread.sleep(6000);// sleep time
	        browserObject.close();// close the broser.
	}

}
