package com.AutomationFramework.utils;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.AutomationFramework.testCases.BaseTest;

public class Utils extends BaseTest{

	
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static String getPageSource() {
		return driver.getPageSource();
	}
	
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	public static void refesh() {
		driver.navigate().refresh();
	}
	
	public static void back() {
		driver.navigate().back();
	}
	
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void setDimension(int width, int height) {
		Dimension dim = new Dimension(width, height);
		driver.manage().window().setSize(dim);
	}
	
	public static void setPosition(int width, int height) {
		Point point = new Point(width, height);
		driver.manage().window().setPosition(point);
	}
	
	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clear(WebElement element, String value) {
		element.clear();
	}
	
	public static void click(WebElement element, String value) {
		element.click();
	}
	
	public static String getTagName(WebElement element) {
		return element.getTagName();
	}
	

	public static String getAttribute(WebElement element, String locator) {
		return element.getAttribute(locator);
	}
	
	public static String getText(WebElement element) {
		return element.getText();
	}
}
