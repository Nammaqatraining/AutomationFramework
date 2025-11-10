package com.AutomationFramework.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.AutomationFramework.utils.Wait;

public class BasketPage extends BasePage{

	public BasketPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how = How.XPATH, using = "//a[text()='Android Quick Start Guide']")
	private WebElement android_quick_start_guide_link;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Remove this item']")
	private WebElement remove_item_link;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Android Quick Start Guide removed. ')]")
	private WebElement android_quick_start_guide_removed_text_msg;
	
	
	public WebElement android_quick_start_guide_link() {
		return android_quick_start_guide_link;
	}
	
	public WebElement remove_item_Link() {
		return remove_item_link;
	}
	
	public WebElement android_quick_start_guide_removed_text_msg() {
		Wait.waitForElementPresenceOfElement(driver, 10, android_quick_start_guide_removed_text_msg);
		return android_quick_start_guide_removed_text_msg;
	}
}
