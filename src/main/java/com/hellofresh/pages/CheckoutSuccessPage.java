package com.hellofresh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutSuccessPage extends BasePage<CheckoutSuccessPage> {

    private By successFragment = By.xpath("//div[contains(@id, 'checkout-success-fragment')]");

    public CheckoutSuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getPageUrl() {
        return "";
    }

    public boolean isCheckoutSuccessFragmentPresent() {
        return findElement(successFragment).isDisplayed();
    }
}
