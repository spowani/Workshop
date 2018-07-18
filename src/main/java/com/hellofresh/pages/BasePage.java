package com.hellofresh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage<T> {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public abstract String getPageUrl();

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30, 30);
    }

    public T open() {
        driver.get(getPageUrl());
        return (T) this;
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitAndClick(By by) {
        findElement(by).click();
    }

    public void clearInputAndFillWith(By by, String text) {
        wait.until(ExpectedConditions.visibilityOf(findElement(by)));
        findElement(by).clear();
        findElement(by).sendKeys(text);
    }
}
