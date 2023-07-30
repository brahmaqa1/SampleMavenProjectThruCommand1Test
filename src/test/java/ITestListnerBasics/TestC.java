package ITestListnerBasics;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//ITestListnerBasics.TestC
public class TestC 
{
		@Test
	public void testC1()
	{
		System.out.println("Calling test A -stmt-1");
		System.out.println("Calling test A -stmt -2");// passes - onTestSuccess() 
//		Assert.assertEquals("ram", "sita");// Fail test mehod -calls onTestFailure ()
//		throw new SkipException("Skipping test "); //  onTestSkipped()
	}
	
	
	@Test
	public void testC2()
	{
		System.out.println("Caling test B -stmt-1");
		System.out.println("Caling test B -stmt -2");
	}

}
