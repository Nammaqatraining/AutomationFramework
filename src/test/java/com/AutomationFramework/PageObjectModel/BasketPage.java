package com.AutomationFramework.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends BasePage{

	public BasketPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how = How.XPATH, using = "//a[text()='Android Quick Start Guide']")
	private WebElement android_quick_start_guide_link;
	
	public WebElement android_quick_start_guide_link() {
		return android_quick_start_guide_link;
	}
}
