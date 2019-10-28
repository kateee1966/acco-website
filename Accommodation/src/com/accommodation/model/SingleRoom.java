package com.accommodation.model;

import java.util.ArrayList;
import java.util.Date;

public class SingleRoom extends Accommodation{
    private int howLongHowBeenDecorated;

    private int roomNumber;
    private int bedNumber;
    private int parking;
    private boolean bathroom;
    private boolean kitchen;
    private boolean balcony;
    private boolean washingMachine;
    private boolean heater;
    private boolean airCondition;
    private boolean television;
    private boolean dryer;
    private String descriptionInDetails;

    public SingleRoom(String accommodationID, ArrayList<String> photoPath, double pricePerDay, String city, String suburbs, String address, int postCode, String hotelType, Date avaliable, Boolean pet, User owner, int guestNum, int howLongHowBeenDecorated, int roomNumber, int bedNumber, int parking, boolean bathroom, boolean kitchen, boolean balcony, boolean washingMachine, boolean heater, boolean airCondition, boolean television, boolean dryer, String descriptionInDetails) {
        super(accommodationID, photoPath, pricePerDay, city, suburbs, address, postCode, hotelType, avaliable, pet, owner, guestNum);
        this.howLongHowBeenDecorated = howLongHowBeenDecorated;
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.parking = parking;
        this.bathroom = bathroom;
        this.kitchen = kitchen;
        this.balcony = balcony;
        this.washingMachine = washingMachine;
        this.heater = heater;
        this.airCondition = airCondition;
        this.television = television;
        this.dryer = dryer;
        this.descriptionInDetails = descriptionInDetails;
    }

    public int getHowLongHowBeenDecorated() {
        return howLongHowBeenDecorated;
    }

    public void setHowLongHowBeenDecorated(int howLongHowBeenDecorated) {
        this.howLongHowBeenDecorated = howLongHowBeenDecorated;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public int getParking() {
        return parking;
    }

    public void setParking(int parking) {
        this.parking = parking;
    }

    public boolean isBathroom() {
        return bathroom;
    }

    public void setBathroom(boolean bathroom) {
        this.bathroom = bathroom;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(boolean washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean isHeater() {
        return heater;
    }

    public void setHeater(boolean heater) {
        this.heater = heater;
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    public boolean isTelevision() {
        return television;
    }

    public void setTelevision(boolean television) {
        this.television = television;
    }

    public boolean isDryer() {
        return dryer;
    }

    public void setDryer(boolean dryer) {
        this.dryer = dryer;
    }

    public String getDescriptionInDetails() {
        return descriptionInDetails;
    }

    public void setDescriptionInDetails(String descriptionInDetails) {
        this.descriptionInDetails = descriptionInDetails;
    }
}
