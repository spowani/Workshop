package com.hellofresh;

import com.hellofresh.data.DeliveryInfo;
import com.hellofresh.data.PaymentCard;
import com.hellofresh.data.User;
import com.hellofresh.pages.CheckoutSuccessPage;
import com.hellofresh.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    WebDriver driver;

    User user;
    DeliveryInfo deliveryInfo;
    PaymentCard creditCard;
    MainPage mainPage;
    CheckoutSuccessPage checkoutSuccessPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        user = new User().getUser();
        creditCard = new PaymentCard().getCreditCard();
        deliveryInfo = new DeliveryInfo().getDeliveryInfo();
        mainPage = new MainPage(driver);
        checkoutSuccessPage = new CheckoutSuccessPage(driver);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
