package com.AutomationFramework.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShopPage  extends BasePage{

	public ShopPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how = How.XPATH, using = "//h3[text()='Android Quick Start Guide']")
	private WebElement androidQuickStartGuide;
	
	
	public WebElement androidQuickStartGuide_link() {
		return androidQuickStartGuide;
	}
}
