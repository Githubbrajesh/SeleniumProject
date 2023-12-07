

//This program will open this pages "https://mail.rediff.com/cgi-bin/login.cgi" and hit  button" 


package selenium_package;// package name is Selenium_package


import org.openqa.selenium.By;//importing selenium By class


import org.openqa.selenium.chrome.ChromeDriver;//Importing ChromeDriver class



public class Selenium_Openweb_clicklogiin {//name of this program is Selenium_Openweb_clickloginin

	//code execution start after main method
	
	
	
	public static void main(String[] args) {
		
		 // using chrome webdriver and specifying location of chromedriver on my machine
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		
	
		
		//creating broweserObject. This object will be like ChromeDriver class
		
	        ChromeDriver browserObject = new ChromeDriver();
	        
	        
	
	        
	        //  Open the web page"https://mail.rediff.com/cgi-bin/login.cgi Using get method of Chromedriver class 
	        browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
	        
	        
		//  browserObject.findElement(By.name("login")).sendKeys("sharvika");//// . Locate the name button and perform login 
		  // browserObject.findElement(By.name("passwd")).sendKeys("sharvika_y1");// Locate the Password button and perform login 
		    
		   browserObject.findElement(By.name("proceed")).click();//Finding the webelement whose name is  proceed
		    
		   // . Close the web browser.
			//browserObject.close();
		
		
	}

}
