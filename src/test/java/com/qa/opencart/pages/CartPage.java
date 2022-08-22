package com.qa.opencart.pages;

import com.microsoft.playwright.Page;

public class CartPage {


    private String checkoutButton=".esh-basket-checkout[value=\"[ Checkout ]\"]";
    private String badgeCount =".esh-basketstatus-badge";

    private Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    public boolean isCheckOutExist() {
        return page.isVisible(checkoutButton);
    }

    public int checkProductCountInBadge() {
       int badgeCountValue=Integer.parseInt(page.locator(badgeCount).innerText());
     return badgeCountValue;

    }
}
