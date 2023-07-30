package OrangeHRMSDemoTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import allpages.HomePage;
import allpages.LoginPage;

public class SearchWithInvalidUserTC4 {

	@Test
	public void searchWithInvalidUserTC4() throws InterruptedException
//	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		// . Represents current project folder name
//
//		//		//open chrome browser
//		WebDriver driver =  new ChromeDriver();
//
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// call openBrowser()
				BaseTest btest=  new BaseTest();
			     WebDriver driver=	btest.openBrowser();


		LoginPage lpage=  new LoginPage(driver);
		lpage.loginToAppl("Admin", "admin123");

		HomePage  hPage=  new HomePage(driver);
		hPage.isHomePageDisplayed();

		hPage.navigateToAdminMenu();

		// Search with invalid user
		String invalidUser= "Brahma";
		//				String invalidUser= "Admin";
		hPage.EnterValueInUserName(invalidUser);

		//				// click Seacrh button
		hPage.clickSearchBtn();
		Thread.sleep(5000);
	// Verify  'No Records Found'  msg is displayed
		hPage.isNoRecordMsgDisplayed();	


	}

}
