package Selenium4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver  = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		// Relative locators can be used locate the element based on location of element i.e left to the ele, right to the ele, above ele
		// below ele,above ele ,  near ele.
		
		// identify first names textbox with last name textbox
		driver.findElement(RelativeLocator.with(By.name("firstname")).toLeftOf(By.name("lastname"))).clear();
		driver.findElement(RelativeLocator.with(By.name("firstname")).toLeftOf(By.name("lastname"))).sendKeys("Lef of last name");
		

//		//identify last name text box   with reference of first name 
		driver.findElement(RelativeLocator.with(By.name("lastname")).toRightOf(By.name("firstname"))).sendKeys("right of first name");
		
//		driver.findElement(RelativeLocator.with(By.xpath("//input[@name='lastname']")).toRightOf(By.name("firstname"))).sendKeys("yadhav");
//		
		
		// HW Testfield with reference to password 
		
		// HW Password with reference to Test field:
		
		//  below
//		// click 'I ahve a bike' checkbox using 'Male'  radio btn
		driver.findElement(RelativeLocator.with(By.xpath("//input[@value='Bike']")).below(By.id("maleid"))).click();
		
//		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("maleid"))).click();
//		
//		
//		// above
//		// HW Clikc 'male radio' btn using I have a bike' chkbox 
//		
//		// HW Click 'Female radio' btn using I have a bike' chkbox 		
//	
//		
//		// near  50 
////		If the relative positioning is not obvious, or it varies based on window size,
		//you can use the near method to identify an element that is at most 50px away from the provided locator
//		
//		driver.findElement(RelativeLocator.with(By.xpath("//input[@type='password']")).near(By.name("lastname"))).sendKeys("near ele");	
		// enter data in Test field based on near element with last name
//		driver.findElement(RelativeLocator.with(By.xpath("//input[@id='testid232101']")).near(By.name("lastname"))).sendKeys("near ele");
////		
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.name("lastname"))).sendKeys("near ele -2");// password 
//			
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.name("firstname"))).sendKeys("near ele -2"); // test field
//

	}

}
