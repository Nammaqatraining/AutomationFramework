package com.AutomationFramework.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

	
	public static WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void openBrowser(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
		}
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
