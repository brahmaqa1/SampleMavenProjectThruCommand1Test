package OrangeHRMSDemoTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import allpages.HomePage;
import allpages.LoginPage;

public class LoginTC01 
{

	@Test
	public void loginTC01()
//	public static void main(String[] args) 
	{
	
//		// open browser		
//		// open url in browser
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		// . Represents current project folder name
//
//		//		//open chrome browser
//		 WebDriver driver =  new ChromeDriver();
//
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// call openBrowser()
		BaseTest btest=  new BaseTest();
	     WebDriver driver=	btest.openBrowser();
		
		// login steps
		LoginPage lpage= new LoginPage(driver);
//		lpage.enter_UserName("Admin");
//		lpage.enter_Password("admin123");
//		lpage.clickLoginBtn();	
		lpage.loginToAppl("Admin", "admin123");
		
		// Verify home page is displayed
		HomePage  hpage=  new HomePage(driver);
		hpage.isHomePageDisplayed();
		
		
	}

}
