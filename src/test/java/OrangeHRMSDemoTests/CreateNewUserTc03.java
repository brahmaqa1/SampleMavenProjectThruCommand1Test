package OrangeHRMSDemoTests;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import allpages.HomePage;
import allpages.LoginPage;

public class CreateNewUserTc03 
{
	@Test
	public void createNewUserTc03() throws InterruptedException
//	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
	// Tester2 added comment 
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

		//  check naviate menu option
		hPage.navigateToAdminMenu();	


		// Verify System user page is displayed or not
		//h5[text()='System Users']
		hPage.verifySystemUserPageDisplayed();

//		//Click add +   button
//		//				oxd-button oxd-button--medium oxd-button--secondary
//		hPage.clickAddBtn();
//		
//		
//
//		// Verify - Add User page is displayed
//		//h6[text()='Add User']
//		hPage.verifyAddUserpageDisplayed();


//		//Select some value (Admin) in User Role dropdown
//		hPage.selectUserRole("ESS");
//		
//		hPage.selectUserRole("Admin");
//
//		// type some employee name(Orange test) - in Employee Name txt box
//		hPage.enterValueinEmployeeName("Orange  Test");
//
//		// Select some status =Enabled
//		hPage.selectStatus("Enabled");
//
//		String username= "Ramarao";
//		// create new user every time  --  add random no at end 
//		Random  r  = new Random();
//		int rno=  r.nextInt(100);//  
//		System.out.println("rno="+rno);
//		username =  username + rno;
//		//           RamaRao  23
//		
//		// Type some value in user name text box 
//		hPage.EnterValueInUserName(username);
//		
//
//		// Type some value in password  text box
//		String pwd = username +"@123321"  ;
//		hPage.EnterValueInPassword(pwd);
//
//		//// Type some value in Confirm password  text box
//		hPage.EnterValueInConfirmPassword(pwd);
//		
//
//		// clikc on Save button
//		hPage.ClickSaveBtn();		
//
//		// Verify  new user name is exist in table or not
//		hPage.searchForGivenUser(username);
		
		hPage.createNewUser("Admin","orange","Enabled","sita","sita","sita");



	}


}
