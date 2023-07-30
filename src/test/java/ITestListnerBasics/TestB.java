package ITestListnerBasics;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListnerBasics.class)
public class TestB 
{
	@Test
	public void testA()
	{
		System.out.println("Caling test A -stmt-1");
		System.out.println("Caling test A -stmt -2");
	}
	
	
	@Test
	public void testB()
	{
		System.out.println("Caling test B -stmt-1");
		System.out.println("Caling test B -stmt -2");
		//  make fail
		Assert.assertEquals("Ramu", "Sita");
	}
	
	
	@Test
	public void testC()
	{
		System.out.println("Caling test C -stmt-1");
		System.out.println("Caling test C -stmt -2");
		//  make skip
		throw new SkipException("Skipping test C Methods");			
	}
	
	@Test(timeOut = 3000) // if test mehods takes > 3 sec,  it fails test method  ThreadTimeoutException:
	public void testD() throws InterruptedException
	{
		System.out.println("Caling test D -stmt-1");
		Thread.sleep(4000); //   it calls  onTestFailedWithTimeout
		System.out.println("Caling test D -stmt -2");
			
	}


}
