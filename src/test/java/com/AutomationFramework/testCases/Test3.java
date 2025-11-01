package com.AutomationFramework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AutomationFrameowork.listeners.ExtentListeners;
import com.aventstack.extentreports.Status;

public class Test3 {

	@Test
	public void login1() {
		ExtentListeners.test.log(Status.INFO, "Enter user name");
		ExtentListeners.test.log(Status.INFO, "Enter password");
		ExtentListeners.test.log(Status.INFO, "Click on Sign in button");
		ExtentListeners.test.log(Status.INFO, "Verify i am on the dashboard page");
	}
	
	@Test
	public void login2() {
		ExtentListeners.test.log(Status.INFO, "Enter user name");
		ExtentListeners.test.log(Status.INFO, "Enter password");
		ExtentListeners.test.log(Status.INFO, "Click on Sign in button");
		ExtentListeners.test.log(Status.INFO, "Verify i am on the dashboard page");
		Assert.fail();
	}
}
