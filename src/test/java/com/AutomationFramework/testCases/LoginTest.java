package com.AutomationFramework.testCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

	@Test
	public void loginValidCredentails() {
		Reporter.log("User Name ", true);
		Assert.fail();
	}
	
	@Test
	public void loginInValidCredentails() {
		Reporter.log("User Name ", true);
		//Assert.fail();
	}
	
}
