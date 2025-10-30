package com.AutomationFramework.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void testA() {
		Reporter.log("This is my first test case in automation framework", true);	
	}

}
