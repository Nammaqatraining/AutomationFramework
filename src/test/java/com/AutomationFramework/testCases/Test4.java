package com.AutomationFramework.testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.AutomationFrameowork.listeners.ExtentListeners;
import com.AutomationFramework.utils.ExcelLibraries;
import com.aventstack.extentreports.Status;

public class Test4 {

	String fileName = System.getProperty("user.dir")+"\\testData\\userListTestData.xlsx";
	String sheetName = "Sheet1";
	
	@Test
	public void validateLoginWithMultipleUsers() {
		try {
			int lastRowNumber = ExcelLibraries.getNumberOfRows(fileName, sheetName);
			
			for(int i=1;i<=lastRowNumber;i++) {
				ExtentListeners.test.log(Status.INFO, "Enter user name "+ExcelLibraries.readCellValue(fileName, sheetName, i, 0));
				ExtentListeners.test.log(Status.INFO, "Enter password "+ExcelLibraries.readCellValue(fileName, sheetName, i, 1));
				ExtentListeners.test.log(Status.INFO, "Click on Sign in button");
				ExtentListeners.test.log(Status.INFO, "Verify i am on the dashboard page");
			}
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
