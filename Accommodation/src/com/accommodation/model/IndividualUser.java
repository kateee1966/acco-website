package com.accommodation.model;

import java.util.ArrayList;

public class IndividualUser extends User{
    private String salutation;
    private String gender;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneContact;
    private Integer zip;
    private String state;
    private String address;
    private String country;
    private String cardType;
    private String cardNum;
    private String cvc;
    private String cardName;
    private Integer expireMonth;
    private Integer expireYear;
    private Double rate;

    public IndividualUser(){

    }

    @Override
    public String toString() {
        return "IndividualUser{" +
                "salutation='" + salutation + '\'' +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneContact='" + phoneContact + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", cvc='" + cvc + '\'' +
                ", cardName='" + cardName + '\'' +
                ", expireMonth=" + expireMonth +
                ", expireYear=" + expireYear +
                ", rate=" + rate +
                "} " + super.toString();
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Integer getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(Integer expireMonth) {
        this.expireMonth = expireMonth;
    }

    public Integer getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(Integer expireYear) {
        this.expireYear = expireYear;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public IndividualUser(String userName, String password, String salutation, String gender, String firstName, String lastName, String email, String phoneContact, Integer zip, String state, String address, String country, String cardType, String cardNum, String cvc, String cardName, Integer expireMonth, Integer expireYear, Double rate) {
        super(userName, password);
        this.salutation = salutation;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneContact = phoneContact;
        this.zip = zip;
        this.state = state;
        this.address = address;
        this.country = country;
        this.cardType = cardType;
        this.cardNum = cardNum;
        this.cvc = cvc;
        this.cardName = cardName;
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
        this.rate = rate;
    }
}
