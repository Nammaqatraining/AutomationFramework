package com.AutomationFramework.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AndroidQuickStartGuidePage extends BasePage{

	public AndroidQuickStartGuidePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Add to basket']")
	private WebElement addToBasket_Button;
	
	@FindBy(how = How.XPATH, using = "//a[text()='View Basket']")
	private WebElement viewBasket_Button;
	
	
	public WebElement addToBasket_Button() {
		return addToBasket_Button;
	}
	
	public WebElement viewBasket_Button() {
		return viewBasket_Button;
	}
	
	public void addProductToTheBasket() {
		addToBasket_Button.click();
		viewBasket_Button.click();
	}
	
}
