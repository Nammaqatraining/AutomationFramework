package com.AutomationFramework.testCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.AutomationFrameowork.listeners.ExtentListeners;
import com.AutomationFramework.PageObjectModel.AndroidQuickStartGuidePage;
import com.AutomationFramework.PageObjectModel.BasketPage;
import com.AutomationFramework.PageObjectModel.HomePage;
import com.AutomationFramework.PageObjectModel.ShopPage;
import com.AutomationFramework.utils.Utils;
import com.aventstack.extentreports.Status;

public class BasketTestCases extends BaseTest{

	@Test
	public void verifyUserAbleToAddProductsIntoTheBasket() {
		Assert.assertEquals(Utils.getTitle(driver), "Automation Practice Site");
		ExtentListeners.test.log(Status.INFO,"User able to land on home page successfully");
		
		HomePage home_po = new HomePage(driver);
		home_po.shop_link().click();
		ExtentListeners.test.log(Status.INFO,"Clicked on shop link successfully from home page");
		
	    ShopPage shop_po = new ShopPage(driver);
	    Utils.scroll(driver, 0, 250);
	    shop_po.androidQuickStartGuide_link().click();
	    ExtentListeners.test.log(Status.INFO,"Clicked on android QuickStart Guide link successfully from Shop page");
		
	    
	    AndroidQuickStartGuidePage android_po = new AndroidQuickStartGuidePage(driver);
	    android_po.addProductToTheBasket();
	    ExtentListeners.test.log(Status.INFO,"Clicked on Add to basket and View basket button successfully from Android page");

	    BasketPage basket_po = new BasketPage(driver);
	    
	    Assert.assertEquals(basket_po.android_quick_start_guide_link().getText(), "Android Quick Start Guide");
	    ExtentListeners.test.log(Status.INFO,"User able to add android product success fully inside the basket page");
	}
	
	@Test
	public void userAbleToRemoveTheProductSuccessfullyFromTheBasket() {
		Assert.assertEquals(Utils.getTitle(driver), "Automation Practice Site");
		ExtentListeners.test.log(Status.INFO,"User able to land on home page successfully");
		
		HomePage home_po = new HomePage(driver);
		home_po.shop_link().click();
		ExtentListeners.test.log(Status.INFO,"Clicked on shop link successfully from home page");
		
	    ShopPage shop_po = new ShopPage(driver);
	    Utils.scroll(driver, 0, 250);
	    shop_po.androidQuickStartGuide_link().click();
	    ExtentListeners.test.log(Status.INFO,"Clicked on android QuickStart Guide link successfully from Shop page");
		
	    
	    AndroidQuickStartGuidePage android_po = new AndroidQuickStartGuidePage(driver);
	    android_po.addProductToTheBasket();
	    ExtentListeners.test.log(Status.INFO,"Clicked on Add to basket and View basket button successfully from Android page");

	    BasketPage basket_po = new BasketPage(driver);
	    Assert.assertEquals(basket_po.android_quick_start_guide_link().getText(), "Android Quick Start Guide");
	    ExtentListeners.test.log(Status.INFO,"User able to add android product success fully inside the basket page");
	    
	    basket_po.remove_item_Link().click();
	    ExtentListeners.test.log(Status.INFO,"Clicked on remove link from the Android page");
	    
	   
	    Assert.assertEquals(basket_po.android_quick_start_guide_removed_text_msg().getText(), "Android Quick Start Guide removed. Undo?");
	    ExtentListeners.test.log(Status.INFO,"User able to remove android product success fully from the basket");
	}
	
}
