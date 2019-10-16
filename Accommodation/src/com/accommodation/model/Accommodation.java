package com.accommodation.model;

import java.util.ArrayList;

public class Accommodation {
    private String accommodationID;
    private ArrayList<String> photoPath;
    private double pricePerDay;
    private String city;
    private String suburbs;
    private String address;
    private int postCode;
    private User owner;
    private int guest;

    public Accommodation(String accommodationID, ArrayList<String> photoPath, double pricePerDay, String city, String suburbs, String address, int postCode, User owner, int guest) {
        this.accommodationID = accommodationID;
        this.photoPath = photoPath;
        this.pricePerDay = pricePerDay;
        this.city = city;
        this.suburbs = suburbs;
        this.address = address;
        this.postCode = postCode;
        this.owner = owner;
        this.guest = guest;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public Accommodation(){

    }

    public String getAccommodationID() {
        return accommodationID;
    }

    public void setAccommodationID(String accommodationID) {
        this.accommodationID = accommodationID;
    }

    public ArrayList<String> getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(ArrayList<String> photoPath) {
        this.photoPath = photoPath;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSuburbs() {
        return suburbs;
    }

    public void setSuburbs(String suburbs) {
        this.suburbs = suburbs;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGuest() { return guest; }

    public void setGuest(int guest) { this.guest = guest; }
}
