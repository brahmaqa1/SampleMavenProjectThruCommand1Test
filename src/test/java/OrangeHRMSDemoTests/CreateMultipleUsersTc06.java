package OrangeHRMSDemoTests;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.BaseTest;
import Utilities.ExcelUtilities;
import allpages.HomePage;
import allpages.LoginPage;

public class CreateMultipleUsersTc06 
{

	@Test
	public void createMultipleUsersTc06() throws InterruptedException, EncryptedDocumentException, IOException
	
//	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	{

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



		String xlfile = ".\\TestData.xlsx";

		ExcelUtilities  xl = new ExcelUtilities();
		ArrayList<String> userRoleList = xl.readColumnData(xlfile, "CreateUsers", "UserRole");
		System.out.println("userRoleList="+userRoleList);

		ArrayList<String> EmployeeNameList = xl.readColumnData(xlfile, "CreateUsers", "EmployeeName");
		System.out.println("EmployeeNameList="+EmployeeNameList);


		ArrayList<String> StatusList = xl.readColumnData(xlfile, "CreateUsers", "Status");
		System.out.println("StatusList="+StatusList);

		ArrayList<String> UsernameList = xl.readColumnData(xlfile, "CreateUsers", "Username");
		System.out.println("UsernameList="+UsernameList);

		ArrayList<String> PasswordList = xl.readColumnData(xlfile, "CreateUsers", "Password");
		System.out.println("PasswordList="+PasswordList);


		ArrayList<String> ConfirmPasswordList = xl.readColumnData(xlfile, "CreateUsers", "ConfirmPassword");
		System.out.println("ConfirmPasswordList="+ConfirmPasswordList);

		
		for(int i=0 ;i<=userRoleList.size()-1;i++)
		{
			
			String userRole= userRoleList.get(i);
			String ename= EmployeeNameList.get(i);
			
			String status= StatusList.get(i);
			String user= UsernameList.get(i);
			String password= PasswordList.get(i);
			String confirmPwd = ConfirmPasswordList.get(i);
			//createNewUser("Admin","orange","Enabled","sita","sita","sita");
			hPage.createNewUser(userRole, ename, status, user, password, confirmPwd);
			
		}
		
		





	}

}
