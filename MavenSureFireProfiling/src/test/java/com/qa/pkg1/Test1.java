package com.qa.pkg1;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority=1)
	public void validateLoginPage()
	{
		System.out.println("Login page validated successfully");
	}
	
	@Test(priority=2)
	public void validateHomePage()
	{
		System.out.println("Home page validated successfully");
	}

}
