package ExtentReportsBasics;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports1 
{
	@Test
	public void testA()
	{
		System.out.println("stmt-1 from testA");
		//		ExtentReports - prededfined class in extentreports.jar
		//		ExtentTest   -prededfined class  "     "
		

		String ResFile= "C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SampleMavenProjectThruCommand1\\src\\test\\java\\ExtentReportsBasics\\ExtentReports1.html";

		// Create object for -ExtentReports class and pass file name
		ExtentReports exRepo = new ExtentReports(ResFile);

		//  to start test and display Test name in Report 
		ExtentTest exTest= 	exRepo.startTest("TC01: Login");

		//Log diff msgs in reports
		//log pass msgs in extent report
		exTest.log(LogStatus.PASS, "1.Open Browser");
		exTest.log(LogStatus.PASS, "2.Enter url ");
		
			
		// Log fail  msg in extent reports
		exTest.log(LogStatus.FAIL, "3.enter user name");
		exTest.log(LogStatus.FAIL, "4.enter password");

		//HW  send pass info msg in extent reports
		//HW send warning msg  in extent reports
		// to end test  and  pass extent ref var - check results
		exRepo.endTest(exTest);

		// to view reports -flush(); 
		exRepo.flush();
		// if we dont write  this line, results file will not be created


	}

}
