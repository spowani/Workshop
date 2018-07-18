package com.hellofresh.pages;

import com.hellofresh.data.DeliveryInfo;
import com.hellofresh.data.PaymentCard;
import com.hellofresh.data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage<CheckoutPage> {

    protected CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public String getPageUrl() {
        return null;
    }

    public CheckoutPage register(User user) {
        clearInputAndFillWith(By.xpath("//input[contains(@id,'email')]"), user.getEmail());
        clearInputAndFillWith(By.xpath("//input[contains(@id,'password')]"), user.getPassword());
        waitAndClick(By.xpath("//*[@data-translation-id='checkout.form-register.button']"));

        return this;
    }

    public CheckoutPage fillDeliveryAddress(DeliveryInfo deliveryInfo) {
        clearInputAndFillWith(By.id("fist-name"), deliveryInfo.getFirstName());
        clearInputAndFillWith(By.id("last-name"), deliveryInfo.getLastName());
        clearInputAndFillWith(By.id("city"), deliveryInfo.getCity());
        clearInputAndFillWith(By.id("address"), deliveryInfo.getAddress());
        clearInputAndFillWith(By.id("phone"), deliveryInfo.getPhone());
        clearInputAndFillWith(By.id("post-code"), deliveryInfo.getPostCode());

        return this;
    }

    public CheckoutPage clickNextButton() {
        waitAndClick(By.xpath("//*[@data-test-id='next-step-button']"));
        return this;
    }

    public CheckoutPage fillCCDetails(PaymentCard creditCard) {
        clearInputAndFillWith(By.id("payment-number"), creditCard.getNumber());
        clearInputAndFillWith(By.id("payment-expiryDate"), creditCard.getExpiration());
        clearInputAndFillWith(By.id("payment-cvc"), creditCard.getCvc());
        return this;
    }
}
