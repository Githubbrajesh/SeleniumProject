
//This program will open this pages http://training.qaonlinetraining.com/testPage.php" and click input name
package selenium_package;// package name is Selenium_package
import org.openqa.selenium.By;//Importing ChromeDriver class

import org.openqa.selenium.WebDriver;//Importing webDriver class
import org.openqa.selenium.chrome.ChromeDriver; //Importing ChromeDriver class

public class Selenium_checkbox {//name of this program is Selenium_checkbox

	public static void main(String[] args) {
		 // using chrome webdriver and specifying location of chromedriver on my machine

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();//creating broweserObject. This object will be like ChromeDriver class
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		//browserObject.findElement(By.xpath("//input[@value='Bike']")).clear();
		//browserObject.findElement(By.xpath("//input[@value='Car']")).clear();
		
		browserObject.findElement(By.xpath("//input[@value='Bike']")).click();  //Locate the Value name Bike 
		browserObject.findElement(By.xpath("//input[@value='boat']")).click();//Locate the Value name Boat 
		//browserObject.findElement(By.xpath("//input[@value='horse']")).click();//Locate the Value name horse
		browserObject.findElement(By.xpath("//input[@name='horse']")).click();
	}

}
