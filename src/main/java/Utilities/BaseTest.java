package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 
{
	
	public WebDriver openBrowser()
	{
		// open browser		
				// open url in browser
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				// . Represents current project folder name

				//		//open chrome browser
				 WebDriver driver =  new ChromeDriver();

				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				return driver; 
	}

}
