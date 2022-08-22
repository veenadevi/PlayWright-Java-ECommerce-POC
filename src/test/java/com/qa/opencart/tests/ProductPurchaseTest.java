package com.qa.opencart.tests;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.UserHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPurchaseTest extends BaseTest {


	@Test(priority = 3)
	public void addCartTest() {

		userHomePage=loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		Assert.assertEquals(userHomePage.getUserHomePageTitle(), prop.getProperty("CART_PAGE_TITLE"));
	}



	@Test(dependsOnMethods = "addCartTest")
	public void singleProductBadgeCountTest() {

		cartPage=userHomePage.addFirstProductToCart();

		Assert.assertEquals(cartPage.checkProductCountInBadge(), 1);
	}

}
