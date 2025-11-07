package com.AutomationFramework.utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Switch {

	
	public static void switchToFrame_index(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	public static void switchToFrame_name(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}
	
	public static void switchToFrame_Element(WebDriver driver,WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	public static void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	
	public static void switchToDefaultParentFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public static void switchToAlert_Accept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public static void switchToAlert_Dismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public static String getTextFromAlert(WebDriver driver) {
		 return driver.switchTo().alert().getText();
	}
	
	public static String getParentWindowId(WebDriver driver) {
		return driver.getWindowHandle();
	}
	
	public static Set<String> getAllWindowIds(WebDriver driver) {
		Set<String> windowIds = driver.getWindowHandles();
		return windowIds;
	}
	
	public static void switchToWindow(WebDriver driver, String windowId) {
		driver.switchTo().window(windowId);
	}
	
}
