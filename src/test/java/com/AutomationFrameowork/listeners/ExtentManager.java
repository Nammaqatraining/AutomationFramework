package com.AutomationFrameowork.listeners;

import com.AutomationFramework.utils.Generic;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	public static ExtentSparkReporter htmlReporter; //creating the html file
	public static ExtentReports extent; //Adding configurations to the test cases
	public static ExtentTest test; //maintaining test cases
	
	public static ExtentReports createInstance(String fileName) {
		htmlReporter = new ExtentSparkReporter("./extentReports/"+fileName+"_"+Generic.currentDateAndTime()+".html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation FW Extent Report");
		htmlReporter.config().setReportName("Automation Extent Report");
		htmlReporter.config().setReportName("Manager name is ABC");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Automation Lead", "CDE");
		extent.setSystemInfo("Automation Tester", "XYZ");
		extent.setSystemInfo("Company name", "TEST ORGANIZATION");
		extent.setSystemInfo("Build version", "10001");
		return extent;
	}
}
