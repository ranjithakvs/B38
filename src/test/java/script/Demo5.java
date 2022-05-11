package script;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo5 {

	@Test(enabled=false)
	public void testA() {
		Reporter.log("hi",true);
		Assert.assertEquals("abcd","xyz");
	}

	
	@AfterMethod
	public void am(ITestResult result) {
		String name = result.getName();
		System.out.println(name);
		int status=result.getStatus();
		System.out.println(status);
		
		String msg=result.getThrowable().getMessage();
		System.out.println("****"+msg+"****");
	}
}

