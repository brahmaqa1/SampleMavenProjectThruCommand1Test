package allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	public WebDriver driver;
	// 1. define elements with locators(name, id, class, xpath, cssSelector, 
	//		linktext, partial linktext
	//		 tagname..)

	//	@FindBy(locName="loc value") // @FindBy is annonation -used to find ele with given loc name = loc value
	@FindBy(name="username")
	public WebElement userNameTxtbox;

	//pwd
	@FindBy(name="password")
	public WebElement pwdTxtbox;


	//login
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement loginBtn;

	// HW  Forgot your password?


	// 2. We have to define constructor  and initialise all elements 
	public LoginPage(WebDriver driver)
	{
		// intialise all elments 
		PageFactory.initElements(driver, this);		
	}


	//3. define reusable method and utlise all defined elements
	// for each step , i will define seperate method 
	// Enter user name in user name text box
	public void enter_UserName(String value)
	{
//		driver.findElement(By.name("")).sendKeys(value);
		System.out.println("enter user name ="+ value);
		userNameTxtbox.sendKeys(value);		
		//  if elemet is not initialised , ele has null
	}

	// Enter pwd in pwd text box
	public void enter_Password(String value)
	{
//		driver.findElement(By.name("")).sendKeys(value);
		System.out.println("enter pwd ="+ value);
		pwdTxtbox.sendKeys(value);		
	}
	

	// Click login btn
	public void clickLoginBtn()
	{
//		driver.findElement(By.name("")).sendKeys(value);
		System.out.println("Click Login button");
		loginBtn.click();
	}
	
	public void loginToAppl(String user, String pwd)
	{
		enter_UserName(user);
		enter_Password(pwd);
		clickLoginBtn();	
	}
	

}
