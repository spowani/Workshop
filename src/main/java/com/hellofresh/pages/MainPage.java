package com.hellofresh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage<MainPage> {

    private By ViewBoxesButton = By.xpath("//*[@id='homeBannerCTA']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getPageUrl() {
        return "";
    }

    public FoodBoxPage clickViewOurBoxesButton() {
        waitAndClick(ViewBoxesButton);
        return new FoodBoxPage(driver);
    }
}
