package com.qa.opencart.pages;

import com.microsoft.playwright.Page;

public class UserHomePage {

    private String userMenuLink="div[class='esh-identity-name']";
    private String firstProductAddToCart = "(//input[@value='[ ADD TO BASKET ]'])[1]";

    private Page page;

    public UserHomePage(Page page) {
        System.out.println("returning userhome page");
        this.page = page;
    }

    public boolean checkuserLoggedIn(){
        if(page.locator(userMenuLink).isVisible()) {
            System.out.println("user is logged in successfully....");
            return true;
        }else {
            System.out.println("user is not logged in successfully....");
            return false;
        }
    }
    public String getUserHomePageTitle() {
        String title =  page.title();
        System.out.println("page title: " + title);
        return title;
    }

    public CartPage addFirstProductToCart(){

        page.click(firstProductAddToCart);
        return new CartPage(page);

    }
}
