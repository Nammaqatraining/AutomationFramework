package com.AutomationFramework.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this); //Lazy initialization
	}

	@FindBy(how = How.LINK_TEXT, using = "Shop")
	private WebElement shop;
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='My Account']")
	private WebElement myAccount;
	
	public WebElement shop_link() {
		return shop;
	}
	
	public WebElement myAccount_link() {
		return myAccount;
	}
	
	
}
