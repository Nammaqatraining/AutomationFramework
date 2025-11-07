package com.AutomationFramework.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AutomationFramework.testCases.BaseTest;

public class Wait {

	public static void waitForTitleContainsExpectedText(WebDriver driver,int duration, String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public static void waitForURLContainsExpectedURL(WebDriver driver,int duration, String url) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.urlContains(url));
	}
	
	public static void waitForVisibleOfElement(WebDriver driver,int duration, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void waitForElementToBeEnabled(WebDriver driver,int duration, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return ele.isEnabled();
			}
		});
	}
	
	public static void waitForElementToBeSelected(WebDriver driver,int duration, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return ele.isSelected();
			}
		});
	}
	
	public static void waitForElementPresenceOfElement(WebDriver driver,int duration, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return ele.isDisplayed();
			}
		});
	}
	
}
