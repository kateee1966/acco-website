package com.accommodation.model;

import java.util.ArrayList;

public class IndividualUser extends User{
    private String phoneContact;
    private ArrayList<Order> soldOrderList;
    private ArrayList<Order> boughtOrderLIst;
    private double rate;

    public IndividualUser(){
        super();
    }

    public IndividualUser(String userID, String userName, String password, String profilePhotoPath, String phoneContact) {
        super(userID, userName, password, profilePhotoPath);
        this.phoneContact = phoneContact;
        this.soldOrderList = new ArrayList<Order>();
        this.boughtOrderLIst = new ArrayList<Order>();
        this.rate = 0;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
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
}
