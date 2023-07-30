package ITestListnerBasics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListnerBasics implements ITestListener
{
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		System.out.println("onStart - method gets executed only one time before excuting any one Test method");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("onTestStart - method gets executed multiple times for each @Test method before executing");
		
		// Get test methods name which is running
		String TestMethodname= result.getName();
		System.out.println("TestMethodname="+TestMethodname + " started execution");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("onTestSuccess -method gets executed when Test method successfulyy passed");
		// Get test methods name which is running
				String TestMethodname= result.getName();
				System.out.println("TestMethodname="+TestMethodname + " passed succesfully");
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
	}
	
	
	
}
