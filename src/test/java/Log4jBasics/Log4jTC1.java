package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jTC1 extends TestBase
{
  //   accessing log class var  from Test base class  into child class
	@Test
	public void LoginTC1()
	{		
		// to log msgs in logger files -Logger.getLogger("Ram");
//		Logger log =  Logger.getLogger("Mahesh");

		log.debug("LoginTC1 -started");
		log.debug("1.Open chrome browser");
		log.debug("2.Enter user name");
		log.debug("3.Enter pwd");
		log.debug("4.click login button");
		log.debug("5.Verify Home page is displayed");	
		log.debug("6.Loggin my own msg");	
		log.info("My info");

	}
}
