package com.hellofresh;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class InitialCheckoutTest extends BaseTest {

    @Test
    public void initialCheckoutWithCreditCard() throws Exception {
        mainPage
                .open()
                .clickViewOurBoxesButton()
                .clickFirstPlan()
                .register(user)
                .fillDeliveryAddress(deliveryInfo)
                .clickNextButton()
                .fillCCDetails(creditCard)
                .clickNextButton();
        assertTrue(checkoutSuccessPage.isCheckoutSuccessFragmentPresent(), "Checkout success fragment is not shown");
    }
}