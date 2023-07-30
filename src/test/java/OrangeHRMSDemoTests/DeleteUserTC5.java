package OrangeHRMSDemoTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import allpages.HomePage;
import allpages.LoginPage;

public class DeleteUserTC5 {

	@Test
	public void deleteUserTC5() throws InterruptedException
//	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
//		WebDriver driver = null;	
//
//		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		// . Represents current project folder name
//
//		//		//open chrome browser
//		driver =  new ChromeDriver();
//
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// call openBrowser()
				BaseTest btest=  new BaseTest();
			     WebDriver driver=	btest.openBrowser();

		//  access logiPAge class variables + Methods		
		LoginPage  lPage =  new LoginPage(driver);
		lPage.loginToAppl("Admin", "admin123");


		// Verify Home page is dispalyed or not
		HomePage  hPage =  new HomePage(driver);
		hPage.isHomePageDisplayed();

		//  check navigate menu option
		hPage.navigateToAdminMenu();	


//		// Delete the given user - 
//				// Select user checkbox , 
				String username= "Chenzira.Chuki";// 
				hPage.selectCheckboxForGivenUser(username);
			
//				// Click delete image icon
				hPage.deleteUser(username);
//				
//				// Verify the msg -The selected record will be permanently deleted. Are you sure you want to continue?
//				
				hPage.isDeleteConfirmationMsgDisplayed();
//				
//				// Click Yes Delete button
				hPage.clickYEsDeleteBtn();
//				
//				// Verify Record should not be available in table  or No recods found
//				hPage.searchForGivenUser(username);
//				hPage.isNoRecordMsgDisplayed();	
				
				hPage.searchForInvalidUser(username);
				
			
		

	}

}
