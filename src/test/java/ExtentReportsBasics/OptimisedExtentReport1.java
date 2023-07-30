package ExtentReportsBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class OptimisedExtentReport1 extends MyTestListnerBasics
{
	//  gets parent c;lass var exRepo., exTest   to child class i.e OptimisedExtentReport1
	int a;//0 
	String s; // null
//	ExtentReports exRepo;// def val :  null
//	ExtentTest exTest;// // defa  val: null
//	
	
//	@BeforeTest // only once before executing testA
//	public void setup()
//	{
//		String ResFile= "C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SampleMavenProjectThruCommand1\\src\\test\\java\\ExtentReportsBasics\\ExtentReports2.html";
//
////		// Create object for -ExtentReports class and pass file name
////		ExtentReports exRepo = new ExtentReports(ResFile);
//		 exRepo = new ExtentReports(ResFile);
//		
//	}

	@Test
	public void TC01Login()
	{
		System.out.println("stmt-1 from testA");
		//		ExtentReports - prededfined class in extentreports.jar
		//		ExtentTest   -prededfined class  "     "
		

//		String ResFile= "C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SampleMavenProjectThruCommand1\\src\\test\\java\\ExtentReportsBasics\\ExtentReports1.html";

//		// Create object for -ExtentReports class and pass file name
//		ExtentReports exRepo = new ExtentReports(ResFile);

		//  to start test and display Test name in Report 
//		ExtentTest exTest= 	exRepo.startTest("TC01: Login");
//		 exTest= 	exRepo.startTest("TC02: Login");

		//Log diff msgs in reports
		//log pass msgs in extent report
		System.out.println("exTest="+exTest);// null
		
		exTest.log(LogStatus.PASS, "1.Open Browser");
		// null .log() -->  NullPonterException
		exTest.log(LogStatus.PASS, "2.Enter url ");
		
			
		// Log fail  msg in extent reports
		exTest.log(LogStatus.FAIL, "3.enter user name");
		exTest.log(LogStatus.FAIL, "4.enter password");

		//HW  send pass info msg in extent reports
		//HW send warning msg  in extent reports
		// to end test  and  pass extent ref var - check results
//		exRepo.endTest(exTest);
//
//		// to view reports -flush(); 
//		exRepo.flush();
//		// if we dont write  this line, results file will not be created

	}
	
//	@AfterTest
//	public void endTest()
//	{
//		exRepo.endTest(exTest);
//
//		// to view reports -flush(); 
//		exRepo.flush();
//		// if we dont write  this line, results file will not be created
//	}


}



