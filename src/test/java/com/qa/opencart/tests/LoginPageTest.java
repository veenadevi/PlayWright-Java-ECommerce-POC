package com.qa.opencart.tests;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {




	@Test(priority = 0)
	public void homePageURLTest() {
		String actualURL = homePage.getHomePageURL();
		Assert.assertEquals(actualURL, prop.getProperty("url"));
	}

	@Test(dependsOnMethods = "homePageURLTest")
	public void loginPageNavigationTest() {
		loginPage = homePage.navigateToLoginPage();
		String actLoginPageTitle = loginPage.getLoginPageTitle();
		System.out.println("page act title: " + actLoginPageTitle);
		Assert.assertEquals(actLoginPageTitle, AppConstants.LOGIN_PAGE_TITLE);
	}

	@Test(dependsOnMethods ="loginPageNavigationTest")
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@Test(priority = 3)
	public void doLoginTest() {

		userHomePage=loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		Assert.assertEquals(userHomePage.getUserHomePageTitle(), AppConstants.CART_PAGE_TITLE);
	}



	@Test(dependsOnMethods = "doLoginTest")
	public void singleProductBadgeCountTest() {

		cartPage=userHomePage.addFirstProductToCart();

		Assert.assertEquals(cartPage.checkProductCountInBadge(), 1);
	}

}
