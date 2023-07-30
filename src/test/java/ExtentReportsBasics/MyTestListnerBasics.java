package ExtentReportsBasics;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class MyTestListnerBasics implements ITestListener
{
	public static ExtentReports exRepo ;
	public static  ExtentTest exTest;
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		System.out.println("onStart - method gets executed only one time before excuting any one Test method");
//		String ResFile= "C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SampleMavenProjectThruCommand1\\src\\test\\java\\ExtentReportsBasics\\ExtentReportsOne.html";
//		String ResFile= ".\\ExtentReportsOne.html";
//		String ResFile= ".\\src\\test\\java\\ExtentReportsBasics\\ExtentReportsOne.html";
		// ExtentReportsOne8Jul20231048.html
		//                          1049.html
		Date d  = new Date();
		System.out.println("date="+d);
		// date=Sat Jul 08 10:50:08 IST 2023
		String ResFile= ".\\src\\test\\java\\ExtentReportsBasics\\ExtentReportsNew" + d+ ".html";
		// Replace :  by Underscore symbol?
		
		ResFile= ResFile.replace(":", "_");
		//ExtentReportsNewSat Jul 08 10_53_47 IST 2023.html
		// replace space by _
		ResFile= ResFile.replace(" ", "_");
		// ExtentReportsNewSat_Jul_08_10_53_47_IST_2023.html
		
		System.out.println("Create one Repots file for all Test Methods"+ResFile);
//		// Create object for -ExtentReports class and pass file name
//		ExtentReports exRepo = new ExtentReports(ResFile);
		 exRepo = new ExtentReports(ResFile);
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("onTestStart - method gets executed multiple times for each @Test method before executing");
		
		// Get test methods name which is running
		String TestMethodname= result.getName();
		System.out.println("TestMethodname="+TestMethodname + " started execution");
//		 exTest= 	exRepo.startTest("TC02: Login");// hard code val so every time same test name will be displayed in reports
		 exTest= 	exRepo.startTest(TestMethodname);
		 System.out.println("exTest="+exTest);
		 
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("onTestSuccess -method gets executed when Test method successfulyy passed");
		// Get test methods name which is running
				String TestMethodname= result.getName();
				System.out.println("TestMethodname="+TestMethodname + " passed succesfully");
//				// to end test  and  pass extent ref var - check results
//				exRepo.endTest(exTest);
//		//
////				// to view reports -flush(); 
//				exRepo.flush();
////				// if we dont write  this line, results file will not be created
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("onTestFailure -executed when test Method fails");
		String tMethodname= result.getName();
		System.out.println(tMethodname+ " Tc failed");
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		System.out.println("onTestSkipped -  gets executed when Test method skipped");
		// Get test methods name which is running
		String TestMethodname= result.getName();
		System.out.println("TestMethodname="+TestMethodname + " skipped succesfully");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		System.out.println("onTestFailedButWithinSuccessPercentage");
		// Get test methods name which is running
		String TestMethodname= result.getName();
		System.out.println("TestMethodname="+TestMethodname + " failed  succesfully ButWithinSuccessPercentage");
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		System.out.println("onTestFailedWithTimeout ");
		// Get test methods name which is running
				String TestMethodname= result.getName();
				System.out.println("TestMethodname="+TestMethodname + " failed with time out error");  
			
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		System.out.println("onFinish - gets executed only one time after executing all Test methods");
		// to end test  and  pass extent ref var - check results
		exRepo.endTest(exTest);
//
//		// to view reports -flush(); 
		exRepo.flush();
//		// if we dont write  this line, results file will not be created
	}
	
	
	
}
