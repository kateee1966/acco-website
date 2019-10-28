package com.accommodation.model;

import java.util.ArrayList;
import java.util.Date;

public class PersonalAccommodation extends Accommodation {
    private int howLongHowBeenDecorated;

    private int roomNumber;
    private int bedNumber;
    private int bathroomNumber;
    private int kitchenNumber;
    private int balconyNumber;
    private int parking;
    private int washingMachine;
    private int heater;
    private int airCondition;
    private int television;
    private int dryer;
    private String descriptionInDetails;

    public PersonalAccommodation(String accommodationID, ArrayList<String> photoPath, double pricePerDay, String city, String suburbs, String address, int postCode, String hotelType, Date avaliable, Boolean pet, User owner, int guestNum, int howLongHowBeenDecorated, int roomNumber, int bedNumber, int bathroomNumber, int kitchenNumber, int balconyNumber, int parking, int washingMachine, int heater, int airCondition, int television, int dryer, String descriptionInDetails) {
        super(accommodationID, photoPath, pricePerDay, city, suburbs, address, postCode, hotelType, avaliable, pet, owner, guestNum);
        this.howLongHowBeenDecorated = howLongHowBeenDecorated;
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.bathroomNumber = bathroomNumber;
        this.kitchenNumber = kitchenNumber;
        this.balconyNumber = balconyNumber;
        this.parking = parking;
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

    public int getBathroomNumber() {
        return bathroomNumber;
    }

    public void setBathroomNumber(int bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    public int getKitchenNumber() {
        return kitchenNumber;
    }

    public void setKitchenNumber(int kitchenNumber) {
        this.kitchenNumber = kitchenNumber;
    }

    public int getBalconyNumber() {
        return balconyNumber;
    }

    public void setBalconyNumber(int balconyNumber) {
        this.balconyNumber = balconyNumber;
    }

    public int getParking() {
        return parking;
    }

    public void setParking(int parking) {
        this.parking = parking;
    }

    public int getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(int washingMachine) {
        this.washingMachine = washingMachine;
    }

    public int getHeater() {
        return heater;
    }

    public void setHeater(int heater) {
        this.heater = heater;
    }

    public int getAirCondition() {
        return airCondition;
    }

    public void setAirCondition(int airCondition) {
        this.airCondition = airCondition;
    }

    public int getTelevision() {
        return television;
    }

    public void setTelevision(int television) {
        this.television = television;
    }

    public int getDryer() {
        return dryer;
    }

    public void setDryer(int dryer) {
        this.dryer = dryer;
    }

    public String getDescriptionInDetails() {
        return descriptionInDetails;
    }

    public void setDescriptionInDetails(String descriptionInDetails) {
        this.descriptionInDetails = descriptionInDetails;
    }
}
