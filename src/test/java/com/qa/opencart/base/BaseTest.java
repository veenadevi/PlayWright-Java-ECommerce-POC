package com.qa.opencart.base;

import com.microsoft.playwright.Page;
import com.qa.opencart.factory.PlaywrightFactory;
import com.qa.opencart.pages.CartPage;
import com.qa.opencart.pages.HomePage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.UserHomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

public class BaseTest {
	
	PlaywrightFactory pf;
	 Page page;
	protected Properties prop;

	protected HomePage homePage;
	protected LoginPage loginPage;

	public UserHomePage userHomePage;

	public CartPage cartPage;

	@BeforeTest
	public void setup() {
		System.out.println("calling setup");
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
		page = pf.initBrowser(prop);
		homePage = new HomePage(page);
		//loginPage= new LoginPage(page);
		//userHomePage= new UserHomePage(page);
	}
	
	
	@AfterSuite
	public void tearDown() {
		System.out.println("closing browser");
		//page.context().browser().close();
	}
	
	
	
	
	

}
