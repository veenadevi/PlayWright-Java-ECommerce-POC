package com.qa.opencart.pages;

import com.microsoft.playwright.Page;

public class HomePage {



	private Page page;

	// 1. String Locators - OR

	private String loginLink = "a:text('Login')";

	

	// 2. page constructor:
	public HomePage(Page page) {
		this.page = page;
	}

	// 3. page actions/methods:
	public String getHomePageTitle() {
		String title =  page.title();
		System.out.println("page title: " + title);
		return title;
	}

	public String getHomePageURL() {
		String url =  page.url();
		System.out.println("page url : " + url);
		return url;
	}


	
	public LoginPage navigateToLoginPage() {

		page.click(loginLink);
		return new LoginPage(page);
	}

}
