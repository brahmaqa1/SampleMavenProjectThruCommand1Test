package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jTC2 
{

	@Test
	public void LoginTC2()
	{		
		// to log msgs in logger files -Logger.getLogger("Ram");
//		Logger log =  Logger.getLogger("Mahesh");

		// create obj for TestBase clas
		TestBase tb  = new TestBase();
		
		
		
		tb.log.debug("LoginTC2 -started");
		tb.log.debug("1.Open chrome browser");
		tb.log.debug("2.Enter user name");
		tb.log.debug("3.Enter pwd");
		tb.log.debug("4.click login button");
		tb.log.debug("5.Verify Home page is displayed");	
		tb.log.debug("6.Loggin my own msg");	
		tb.log.info("My info");

	}
}
