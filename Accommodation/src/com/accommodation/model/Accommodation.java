package com.accommodation.model;

import java.util.ArrayList;

import java.util.Date;

public class Accommodation {
    private String accommodationID; //
    private ArrayList<String> photoPath;
    private double pricePerDay; //
    private String city; //
    private String suburbs; //
    private String address;
    private int postCode; //
    private String hotelType;
    private Date avaliable;
    private Boolean pet;
    private User owner;
    private int guestNum;

    public Accommodation(String accommodationID, ArrayList<String> photoPath, double pricePerDay, String city, String suburbs, String address, int postCode, String hotelType, Date avaliable, Boolean pet, User owner, int guestNum) {
        this.accommodationID = accommodationID;
        this.photoPath = photoPath;
        this.pricePerDay = pricePerDay;
        this.city = city;
        this.suburbs = suburbs;
        this.address = address;
        this.postCode = postCode;
        this.hotelType = hotelType;
        this.avaliable = avaliable;
        this.pet = pet;
        this.owner = owner;
        this.guestNum = guestNum;
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

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public Date getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(Date avaliable) {
        this.avaliable = avaliable;
    }

    public Boolean getPet() {
        return pet;
    }

    public void setPet(Boolean pet) {
        this.pet = pet;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getGuestNum() {
        return guestNum;
    }

    public void setGuestNum(int guestNum) {
        this.guestNum = guestNum;
    }

}
