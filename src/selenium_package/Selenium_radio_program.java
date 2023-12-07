

//This program will open this pages "http://training.qaonlinetraining.com/testPage.php" and Click the input value.
package selenium_package;// package name is Selenium_package
import org.openqa.selenium.By;//importing selenium By class
import org.openqa.selenium.WebDriver;//Importing WebDriver class
import org.openqa.selenium.chrome.ChromeDriver;//Importing ChromeDriver class

public class Selenium_radio_program {//name of this program is Selenium_radio_program
	//code execution start after main method
	public static void main(String[] args) {
		//code execution start after main method
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		//creating broweserObject. This object will be like ChromeDriver class
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		//browserObject.findElement(By.xpath("//input[@value='Other']")).click();
		
		//browserObject.findElement(By.xpath("//input[@value='male']")).click();
		
		browserObject.findElement(By.xpath("//input[@value='female']")).click();////Finding the webelement whose value is female.
	}
	

}
