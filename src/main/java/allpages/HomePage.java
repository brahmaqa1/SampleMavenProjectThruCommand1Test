package allpages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 
{
	WebDriver driver;//  defaul val = null
	
	// 1. Define all elements with locators  using @Findby anont
	
	@FindBy(className = "oxd-userdropdown-img")
	public WebElement profileImg;
	
	
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement adminMenu;
	

//	@FindBy(xpath = "//span[text()='Admin']")
//	public WebElement adminMenu;
	
	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement pimMenu;
	
	// system user page 
	
	@FindBy(xpath = "//h5[text()='System Users']")
	public WebElement systemUserTxt;
	
	//h6[text()='Add User']
	
	
//	
//	@FindBy(className =  "oxd-button oxd-button--medium oxd-button--secondary")
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	// clikAddBt //butt   oxd-button oxd-button--medium oxd-button--secondary']
	public WebElement addBtn;	
	
	@FindBy(xpath = "//h6[text()='Add User']")
	public WebElement addUserTxt;
	
	
	@FindBy(xpath = "//label[text()='User Role']/parent::div/following-sibling::div")
	public WebElement userRoleDropdown;
	
	
	//@FindBy(xpath = "//label[text()='User Role']/parent::div/following-sibling::div/following-sibling::div[@role='listbox']//*[text()='Admin']")
//	@FindBy(xpath="//label[text()='User Role']/parent::div/following-sibling::div/following-sibling::div[@role='listbox']//*[text()='Admin']")
	@FindBy(xpath="//div[@role='listbox']//*[text()='Admin']")
	public WebElement adminValInuserRoleDropdown;
	
	//Exception in thread "main" org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //label[text()='User Role']/parent::div/following-sibling::div/following-sibling::div[@role='listbox']']//*[text()='Admin'] because of the following error:
//	SyntaxError: Failed to execute 'evaluate' on 'Document': The string '//label[text()='User Role']/parent::div/following-sibling::div/following-sibling::div[@role='listbox']']//*[text()='Admin']' is not a valid XPath expression.
//			  (Session info: chrome=114.0.5735.199)
	// note: when we give invalid xpath, it throws 'InvalidSelectorException'
	
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	public WebElement employeeNameTxtboxEle;
	
	
	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div")
	public WebElement statusArrowBtn;
	
	
	
	//@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error']")
	@FindBy(xpath="//label[text()='Username']/parent::div/following-sibling::div/input")
	public WebElement UsernameTxtbox;
	
	
	
	@FindBy(xpath="//label[text()='Password']/parent::div/following-sibling::div/input")	
	public WebElement PasswordTxtbox;
	
	
	@FindBy(xpath="//label[text()='Confirm Password']/parent::div/following-sibling::div/input")
	public WebElement ConfirmPasswordTxtbox;
	

	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement saveBtn;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchBtn;
	
	
	@FindBy(xpath="//span[text()='No Records Found']")
	public WebElement norecordFoundMsg;
	
	//div[@role='rowgroup'][@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='David.Morris']
	@FindBy(xpath="//span[text()='No Records Found']")
	public WebElement norecordFoundMsg1;
	
	
	
	@FindBy(xpath="//p[text()='The selected record will be permanently deleted. Are you sure you want to continue?']")
	public WebElement deleteRecordMsg;
	
	
	@FindBy(xpath="//i[@class='oxd-icon bi-trash oxd-button-icon']")
	public WebElement yesDeleteBtn;
	
	
	
	//**************************
	
	 // 2. We have to define constructor  and initialise all elements 
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		// current class driver ref var is assigned with some value
	}
	
	
	//3 utilise all elements in resuable methods
	public void isHomePageDisplayed()
	{
		// check the profile image is displayed
 	   boolean res=	profileImg.isDisplayed();
 	   if(res)
 	   {
 		   System.out.println("Login is succesfull");
 	   }
 	   else
 	   {
 		  System.out.println("Login is not succesfull");
 	   }
	}
	
	// Navigate to diff menu options
		// Navigate to Admin menu
		public void navigateToAdminMenu()
		{
			System.out.println("click admin menu option");
			adminMenu.click();
			verifySystemUserPageDisplayed();
		}
		
		public void navigateToPIMMenu()
		{
			System.out.println("click PIM menu option");
			pimMenu.click();
		}
		
		public void verifySystemUserPageDisplayed()
		{
			
			if(systemUserTxt.isDisplayed())
			{
				System.out.println("System userd page is displayed");
			}
			else
			{
				System.out.println("System userd page is not displayed");
			}
		}
		
		public void clickAddBtn() throws InterruptedException
		{
			Thread.sleep(4000);
			System.out.println("click add btn");
			addBtn.click();
		}
		
		public void verifyAddUserpageDisplayed()
		{
			if(addUserTxt.isDisplayed())
			{
				System.out.println("Add user page is displayed ");
			}
			else
			{
				System.out.println("Add user page is not  displayed ");
			}
		}
		
		
		
		public void selectUserRole(String val) throws InterruptedException
		{
			
			System.out.println("Click user role dropdown");
//			Select sel =  new Select(userRoleDropdown);
//			sel.selectByVisibleText("Admin");
//
//Exception in thread "main" org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "div"
//Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
			System.out.println("Sleect value="+val + " in USer Role dropdown");
			userRoleDropdown.click();
			Thread.sleep(3000);
//			adminValInuserRoleDropdown.click();	
			System.out.println("driver="+driver);// null
			driver.findElement(By.xpath("//div[@role='listbox']//*[text()='" +val+  "']")).click();
			// null * any method --> java.lang.NullPointerException: 
			
		}
		
		// type some employee name(Orange test) - in Employee Name txt box
		public void enterValueinEmployeeName(String empname) throws InterruptedException
		{
			System.out.println("Enter empname="+ empname);
			employeeNameTxtboxEle.sendKeys(empname);
//			Thread.sleep(3000);//			employeeNameValueEle.click();
			
			driver.findElement(By.xpath("//*[text()='Orange  Test']")).click();
			
		}
		
		// Select some status =Enabled
//		selectStatus("Enabled")
//		selectStatus("Disabled");
		public void selectStatus(String status) throws InterruptedException
		{
			System.out.println("select status="+ status);
			
			statusArrowBtn.click();
			Thread.sleep(3000);
//			statusvalue.click();		
			
			driver.findElement(By.xpath("//div[@role='listbox']//*[text()='" +status+  "']")).click();
			
		}

		// Type some value in user name text box 
		// EnterValueInUserName("RamaRao");
		public void EnterValueInUserName(String username) throws InterruptedException
		{
			System.out.println("enter user name="+ username);
			UsernameTxtbox.sendKeys(username);
			Thread.sleep(3000);
			
		}
		
		// Type some value in password  text box
//		EnterValueInPassword("Test@123321")
		public void EnterValueInPassword(String pwd) throws InterruptedException
		{
			System.out.println("enterpwd="+ pwd);
			PasswordTxtbox.sendKeys(pwd);
		}
		
	//// Type some value in Confirm password  text box
		//EnterValueInConfirmPassword("Test@123321")
		public void EnterValueInConfirmPassword(String confirmPwd) throws InterruptedException
		{
			ConfirmPasswordTxtbox.sendKeys(confirmPwd);
		}
		
		// clikc on Save button
		public void ClickSaveBtn() throws InterruptedException
		{
			System.out.println("click save button");
			saveBtn.click();
		}
		
		public void searchForGivenUser(String userName ) throws InterruptedException
		{
			Thread.sleep(7000);
			System.out.println("Enter userName="+ userName);
			UsernameTxtbox.sendKeys(userName);	
//			
//			// click Seacrh button			
			searchBtn.click();	
			
			//div[@class='oxd-table-body']//*[text()='RamaRao1']
			String myxpath = "//div[@role='table']//div[text()='"+userName+ "']";
//			
			try {
				boolean  userDisplayed= driver.findElement(By.xpath(myxpath)).isDisplayed();
//				
				if(userDisplayed)
				{
					System.out.println("User name ="+ userName + " is displayed in table");
				}
				else
				{
					System.out.println("User name ="+ userName + " is not displayed in table");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("User name ="+ userName + " is not displayed in table");
			}
		
			
		}
		
		public void clickSearchBtn()
		{
			System.out.println("Click Search btn");
			searchBtn.click();
		}
		
		public void isNoRecordMsgDisplayed()
		{
			try
			{
				if(norecordFoundMsg.isDisplayed())
				{
					System.out.println("No Records Found Msg is Displayed");
				}
				else
				{
					System.out.println("No Records Found Msg is not Displayed");
				}
			}
			catch (Exception e) {
				System.out.println("No Records FoundMsg is not Displayed");
			}	
			
		}
		
		public void selectCheckboxForGivenUser(String user) throws InterruptedException
		{			
			String myxpath="//div[@role='rowgroup'][@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" +user+ "']/../preceding-sibling::div//input";
			// Error:
//			String myxpath="//div[@role='rowgroup'][@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" +user+ "']/../preceding-sibling::div//input/..";
			System.out.println("Select checkbox for user="+ user);
			Thread.sleep(4000);
			
//			driver.findElement(By.xpath(myxpath)).click();
			// JSE 
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement checkboxEle= driver.findElement(By.xpath(myxpath));
			jse.executeScript("arguments[0].click();", checkboxEle);
			
		}
		
		public void deleteUser(String user) throws InterruptedException
		{
			Thread.sleep(2000);
			String myxpath="//div[@role='rowgroup'][@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" +user+"']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']";
			System.out.println("click Delete image icon for user="+ user);
			driver.findElement(By.xpath(myxpath)).click();				
		}
		
		public void isDeleteConfirmationMsgDisplayed() throws InterruptedException
		{
			Thread.sleep(2000);
			if(deleteRecordMsg.isDisplayed())
			{
				System.out.println("The selected record will be permanently deleted. Are you sure you want to continue? msg is displayed");
				
			}
			else
			{
				System.out.println("Fail.The selected record will be permanently deleted. Are you sure you want to continue? msg is   not displayed");
			}
			
		}
		
		public void clickYEsDeleteBtn() throws InterruptedException
		{
			Thread.sleep(2000);
			System.out.println("click Yes delete btn");
			yesDeleteBtn.click();
		}
		
		public void searchForInvalidUser(String userName) throws InterruptedException
		{
			Thread.sleep(5000);
			System.out.println("Enter userName="+ userName);
			UsernameTxtbox.sendKeys(userName);	
//			
//			// click Seacrh button			
			searchBtn.click();	
			
			isNoRecordMsgDisplayed();		
			
		}
		
		//createNewUser("Admin","orange","Enabled","sita","sita","sita");
		public void createNewUser(String userRole,String empname, String status, String username,String pwd,String confirmPWd) throws InterruptedException
		{
			//Click add +   button
			//				oxd-button oxd-button--medium oxd-button--secondary
			clickAddBtn();		
			

			// Verify - Add User page is displayed
			//h6[text()='Add User']
			verifyAddUserpageDisplayed();

			
			//Select some value (Admin) in User Role dropdown
				selectUserRole(userRole);		
	

			// type some employee name(Orange test) - in Employee Name txt box
			enterValueinEmployeeName("Orange  Test");

			// Select some status =Enabled
			selectStatus(status);

			// create new user every time  --  add random no at end 
			Random  r  = new Random();
			int rno=  r.nextInt(100);//  
			System.out.println("rno="+rno);
			username =  username + rno;
			//           RamaRao  23
			
			// Type some value in user name text box 
			EnterValueInUserName(username);
			

			// Type some value in password  text box
			 pwd = username +"@123321"  ;
			EnterValueInPassword(pwd);

			//// Type some value in Confirm password  text box
			EnterValueInConfirmPassword(pwd);
			

			// clikc on Save button
			ClickSaveBtn();	
			
			// Verify  new user name is exist in table or not
			
			searchForGivenUser(username);

		}
		
}
