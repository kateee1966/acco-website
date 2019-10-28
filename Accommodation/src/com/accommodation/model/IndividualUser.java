package com.accommodation.model;

import java.util.ArrayList;

public class IndividualUser extends User{
    private String phoneContact;
    private String salutation;
    private String gender;
    private String firstName;
    private String lastName;
    private String email;
    private String zip;
    private String state;
    private String address;
    private String country;
    private String cardType;
    private String cardNum;
    private String cvc;
    private String cardName;
    private int expireMonth;
    private int expireYear;
    private ArrayList<Order> soldOrderList;
    private ArrayList<Order> boughtOrderLIst;
    private double rate;

    public IndividualUser(String userID, String userName, String password, String profilePhotoPath, String phoneContact, String salutation, String gender, String firstName, String lastName, String email, String zip, String state, String address, String country, String cardType, String cardNum, String cvc, String cardName, int expireMonth, int expireYear, ArrayList<Order> soldOrderList, ArrayList<Order> boughtOrderLIst, double rate) {
        super(userID, userName, password, profilePhotoPath);
        this.phoneContact = phoneContact;
        this.salutation = salutation;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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
        this.soldOrderList = soldOrderList;
        this.boughtOrderLIst = boughtOrderLIst;
        this.rate = rate;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
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

    public int getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(int expireMonth) {
        this.expireMonth = expireMonth;
    }

    public int getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(int expireYear) {
        this.expireYear = expireYear;
    }

    public ArrayList<Order> getSoldOrderList() {
        return soldOrderList;
    }

    public void setSoldOrderList(ArrayList<Order> soldOrderList) {
        this.soldOrderList = soldOrderList;
    }

    public ArrayList<Order> getBoughtOrderLIst() {
        return boughtOrderLIst;
    }

    public void setBoughtOrderLIst(ArrayList<Order> boughtOrderLIst) {
        this.boughtOrderLIst = boughtOrderLIst;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
