
	//This program will open redfinn.com and enter login credentials
		//This is the name of the package 
package selenium_package;

	//This code import 'by' and 'chromedriver' class 
		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;

		//This is the name of the class/program
		public class Selenium_Min_Max_Window {
		    
			//This is the start point of the program
			public static void main(String[] args) {
				

				//It setup property of chromedriver and locate the chrome drive
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
				
				// Create a object named 'browserObject'
			        ChromeDriver browserObject = new ChromeDriver();
			        
				// Open the http://www.mail.rediff.com/ link using get method.
			        browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
			        
			    // Maximize the window    
			        browserObject.manage().window().maximize();
		//It will find login box using locator and type the login charachers
				 browserObject.findElement(By.name("login")).sendKeys("Dhunkia");
				 
				//It will find password box using locator and type the password charachers
				 browserObject.findElement(By.name("passwd")).sendKeys("Ccc12354");
				 
				 
				 
				  // browserObject.findElement(By.name("proceed")).click();
				    
				   // Close the web browser.
				   // browserObject.close();
			}

		}
		
		
		
		
	
