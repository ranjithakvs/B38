package script;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo4 {

	@BeforeMethod
    public void pc(Method m) {
		String name=m.getName();
		Reporter.log("Next method is:"+name,true);
	}
	
	@Test(enabled=false)
	public void testA()
	{
		Reporter.log("testA",true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log("testB",true);
	}
}

