package Selenium4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownToEle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//		//open chrome browser
		driver =  new ChromeDriver();
		
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		System.out.println("Scroling to browser file btn");
		Thread.sleep(4000);
		// scroll down to browse file btn		

		Actions  act = new Actions(driver);
		WebElement   browseFileBtn=  driver.findElement(By.id("fileid"));
		act.scrollToElement(browseFileBtn).perform();
		
		//HW open  webtableall.html (file:///C:/brahma/Practise/qtp%20practise/web%20apps/WebTableAll.html
		//  scroll to last webtable 


	}

}
