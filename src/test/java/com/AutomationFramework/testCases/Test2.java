package com.AutomationFramework.testCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Test2 {

	
	public ExtentSparkReporter htmlReporter; //creating the html file
	public ExtentReports extent; //Adding configurations to the test cases
	public ExtentTest test; //maintaining test cases
	
	
	@BeforeTest
	public void setReport() {
		htmlReporter = new ExtentSparkReporter("./extentReports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation FW Extent Report");
		htmlReporter.config().setReportName("Automation Extent Report");
		htmlReporter.config().setReportName("Manager name is ABC");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Automation Tester", "XYZ");
		extent.setSystemInfo("Company name", "TEST ORGANIZATION");
		extent.setSystemInfo("Build version", "10001");
		
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
	
	
	@Test
	public void login1() {
		test = extent.createTest("Login user 1");
		test.log(Status.INFO, "Enter user name");
		test.log(Status.INFO, "Enter password");
		test.log(Status.INFO, "Click on Sign in button");
		test.log(Status.INFO, "Verify i am on the dashboard page");
	}
	
	@Test
	public void login2() {
		test = extent.createTest("Login user 2");
		test.log(Status.INFO, "Enter user name");
		test.log(Status.INFO, "Enter password");
		test.log(Status.INFO, "Click on Sign in button");
		test.log(Status.INFO, "Verify i am on the dashboard page");
		Assert.fail();
	}
	
	@AfterMethod
	public void updateResults(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.fail("Test case failed - "+result.getMethod().getMethodName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.pass("Test case passed - "+result.getMethod().getMethodName());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			test.skip("Test case skipped - "+result.getMethod().getMethodName());
		}
	}
	
}
