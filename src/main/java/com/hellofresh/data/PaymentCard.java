package com.hellofresh.data;

public class PaymentCard {
    private String number;
    private String expiration;
    private String cvc;

    public PaymentCard() {
    }

    private PaymentCard(String number, String expiration, String cvc) {
        this.number = number;
        this.expiration = expiration;
        this.cvc = cvc;
    }

    public String getNumber() {
        return number;
    }

    public String getExpiration() {
        return expiration;
    }

    public String getCvc() {
        return cvc;
    }

    public PaymentCard getCreditCard() {
        return new PaymentCard("111111111111", "08/18", "737");
    }
}
