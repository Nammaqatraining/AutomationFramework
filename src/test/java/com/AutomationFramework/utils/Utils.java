package com.AutomationFramework.utils;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.AutomationFramework.testCases.BaseTest;

public class Utils{

	
	public static String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	public static String getTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public static String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}
	
	public static void navigateTo(WebDriver driver,String url) {
		driver.navigate().to(url);
	}
	
	public static void refesh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public static void back(WebDriver driver) {
		driver.navigate().back();
	}
	
	
	public static void forward(WebDriver driver) {
		driver.navigate().forward();
	}
	
	public static void setDimension(WebDriver driver,int width, int height) {
		Dimension dim = new Dimension(width, height);
		driver.manage().window().setSize(dim);
	}
	
	public static void setPosition(WebDriver driver, int width, int height) {
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
	
	public static List<WebElement> findElements(WebDriver driver,By locator) {
		List<WebElement> elements = driver.findElements(locator);
		return elements;
	}
	
	public static void singleSelectDropDown_visibleText(WebElement ele, String text) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public static void singleSelectDropDown_selectByContainsVisibleText(WebElement ele, String text) {
		Select sel = new Select(ele);
		sel.selectByContainsVisibleText(text);
	}
	
	public static void singleSelectDropDown_selectByIndex(WebElement ele, int index) {
		Select sel = new Select(ele);
		sel.selectByIndex(index);
	}
	
	public static void singleSelectDropDown_value(WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByValue(value);
	}
	
	public static String singleSelectDropDown_FirstSelectedOption(WebElement ele, String value) {
		Select sel = new Select(ele);
		return sel.getFirstSelectedOption().getText();
	}
	
	public static void onMouseOver(WebDriver driver,WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
	
	public static void onMouseOver_click(WebDriver driver,WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).click().perform();
	}
	
	public static void scroll(WebDriver driver,int x, int y) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public static void executeAutoItScript(String path) {
		Runtime r = Runtime.getRuntime();
		try {
			r.exec(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
