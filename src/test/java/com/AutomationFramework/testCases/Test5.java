package com.AutomationFramework.testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationFrameowork.listeners.ExtentListeners;
import com.AutomationFramework.utils.ExcelLibraries;
import com.aventstack.extentreports.Status;

public class Test5 {

	@Test(dataProvider = "userCredentials")
	public void validateLoginWithMultipleUser(String userName, String pwd) {
			ExtentListeners.test.log(Status.INFO, "Enter user name "+userName);
			ExtentListeners.test.log(Status.INFO, "Enter password "+pwd);
			ExtentListeners.test.log(Status.INFO, "Click on Sign in button");
			ExtentListeners.test.log(Status.INFO, "Verify i am on the dashboard page");
	}
	
	
	@DataProvider(name = "userCredentials")
	public Object[][] getUserData() {
		
		Object[][] data = new Object[6][2];
		
		data[0][0] = "user1"; data[0][1] = "pwd1";
		data[1][0] = "user2"; data[1][1] = "pwd2";
		data[2][0] = "user3"; data[2][1] = "pwd3";
		data[3][0] = "user4"; data[3][1] = "pwd4";
		data[4][0] = "user5"; data[4][1] = "pwd5";
		data[5][0] = "user6"; data[5][1] = "pwd6";
		
		return data;
	}
	
}
