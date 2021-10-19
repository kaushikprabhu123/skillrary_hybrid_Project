package chapter3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng {

	@Test (priority = 10, enabled=false)
	public void demo()
	{
		Reporter.log("Hello python, true");
	}
	@Test (priority = -1,invocationCount = 5)
	public void demo1()
	{
		Reporter.log("Hello selenium, true");
	}
	@Test (priority = 2)
	public void demo2()
	{
		Reporter.log("Hello java, true");
	}
}
