package Selenium4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//		//open chrome browser
		driver =  new ChromeDriver();

		/*
		 * // // open given url ib browser driver.get(
		 * "file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html"
		 * );
		 * 
		 * // open new window and switch to that window //
		 * driver.switchTo().window(WindowType.WINDOW);// dont use this
		 * driver.switchTo().newWindow(WindowType.WINDOW);
		 * 
		 * // open some url in 2nd browser driver.get("https://www.google.com/");
		 * 
		 * 
		 * // search Rama in google driver.findElement(By.name("q")).sendKeys("Rama");
		 */
		
		
		//********************
//		// open given url ib browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		//  o//   open new tab and swicth
//		driver.switchTo().window(WindowType.WINDOW);// dont use this 
		driver.switchTo().newWindow(WindowType.TAB); // tab-1
		
		// open some url in 2nd browser
		driver.get("https://www.google.com/");
		
		
		// search Rama in google
		driver.findElement(By.name("q")).sendKeys("Rama");	
		
		//  
		driver.switchTo().newWindow(WindowType.TAB);// tab -2
		driver.switchTo().newWindow(WindowType.TAB); // tab- 3
		

	}

}
