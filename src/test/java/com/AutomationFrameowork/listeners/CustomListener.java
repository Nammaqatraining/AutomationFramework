package com.AutomationFrameowork.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener implements ITestListener{

	  public void onTestStart(ITestResult result) {
		    // not implemented
		  }

		  public void onTestSuccess(ITestResult result) {
		    // not implemented
			  //Reporter.log("<a href='file:///C:/Users/Admin/Desktop/Slenium/fb-inputbox.png'>"
				//  		+ "<img src='file:///C:/Users/Admin/Desktop/Slenium/fb-inputbox.png' height=100 width=100> </a>", true);
			  System.setProperty("org.uncommons.reportng.escape-output","false");
			 Reporter.log("<a href=\"file:///C:/Users/Admin/Desktop/Slenium/fb-inputbox.png\" target=\"_blank\">click here to see the sc</a>");
			  Reporter.log("Test case passed", true);	
		  }


		  public void onTestFailure(ITestResult result) {
		    // not implemented
			  System.setProperty("org.uncommons.reportng.escape-output","false");
			 // Reporter.log("<a href='file:///C:/Users/Admin/Desktop/Slenium/fb-inputbox.png'>"
			 //		+ "<img src='file:///C:/Users/Admin/Desktop/Slenium/fb-inputbox.png' height=100 width=100> </a>", true);
			  
			  
			  Reporter.log("<a href=\"file:///C:/Users/Admin/Desktop/Slenium/fb-inputbox.png\" target=\"_blank\"> click here </a>");
			  Reporter.log("Test case failed", true);	
		  }


		  public void onTestSkipped(ITestResult result) {
		    // not implemented
			  Reporter.log("Test case skipped", true);	
		  }


		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }


		  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }


		  public void onStart(ITestContext context) {
		    // not implemented
		  }

	
		  public void onFinish(ITestContext context) {
		    // not implemented
		  }
}
