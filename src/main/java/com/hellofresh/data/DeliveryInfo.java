package com.hellofresh.data;

public class DeliveryInfo {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String postCode;
    private String phone;

    public DeliveryInfo() {
    }

    private DeliveryInfo(String firstName, String lastName, String address, String city, String postCode, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postCode = postCode;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getPhone() {
        return phone;
    }

    public DeliveryInfo getDeliveryInfo() {
        return new DeliveryInfo("Darth", "Vader", "Torstrasse 6", "Berlin", "10190", "0498787654");
    }
}
