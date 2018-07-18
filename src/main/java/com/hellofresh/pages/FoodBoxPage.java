package com.hellofresh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FoodBoxPage extends BasePage<FoodBoxPage> {

    public FoodBoxPage(WebDriver driver) {
        super(driver);
    }

    public String getPageUrl() {
        return null;
    }

    public CheckoutPage clickFirstPlan() {
        waitAndClick(By.xpath("//*[@data-test-id='select-plan-button']"));
        return new CheckoutPage(driver);
    }
}
