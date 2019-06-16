package script;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class DemoA {
	@Test
	public void testA()
	{
		Reporter.log("Executing testA",true);
		Assert.fail();
	}
	@Test
	public void testB()
	{
		Reporter.log("Executing testB",true);
		Reporter.log("Executing testB",true);
	}
	
	@AfterMethod
	public void m2(ITestResult testResult)
	{
		String name = testResult.getName();
		Reporter.log(name,true);
		int res=testResult.getStatus();
		Reporter.log(res+" ",true);
		
	}

}
