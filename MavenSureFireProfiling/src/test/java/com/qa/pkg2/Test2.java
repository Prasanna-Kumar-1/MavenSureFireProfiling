package com.qa.pkg2;

import org.testng.annotations.Test;

public class Test2 {

	@Test(priority=1)
	public void browserOpened()
	{
		System.out.println("The Browser is Opened");
	}
	
	@Test(priority=2)
	public void applicationLaunched()
	{
		System.out.println("The Application is Launched");
	}
}
