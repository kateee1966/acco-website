package com.accommodation.model;

import java.util.ArrayList;
import java.util.Date;

public class PersonalAccommodation extends Accommodation {
    private String structureType;
    private String rentType;
    private Integer bedroom;
    private Integer bathroom;
    private Integer kitchen;
    private Boolean park;
    private Boolean gym;
    private Boolean wifi;
    private Boolean lift;
    private Boolean television;

    @Override
    public String toString() {
        return "PersonalAccommodation{" +
                "structureType='" + structureType + '\'' +
                ", rentType='" + rentType + '\'' +
                ", bedroom=" + bedroom +
                ", bathroom=" + bathroom +
                ", kitchen=" + kitchen +
                ", park=" + park +
                ", gym=" + gym +
                ", wifi=" + wifi +
                ", lift=" + lift +
                ", television=" + television +
                "} " + super.toString();
    }

    public String getStructureType() {
        return structureType;
    }

    public void setStructureType(String structureType) {
        this.structureType = structureType;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public Integer getBedroom() {
        return bedroom;
    }

    public void setBedroom(Integer bedroom) {
        this.bedroom = bedroom;
    }

    public Integer getBathroom() {
        return bathroom;
    }

    public void setBathroom(Integer bathroom) {
        this.bathroom = bathroom;
    }

    public Integer getKitchen() {
        return kitchen;
    }

    public void setKitchen(Integer kitchen) {
        this.kitchen = kitchen;
    }

    public Boolean getPark() {
        return park;
    }

    public void setPark(Boolean park) {
        this.park = park;
    }

    public Boolean getGym() {
        return gym;
    }

    public void setGym(Boolean gym) {
        this.gym = gym;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getLift() {
        return lift;
    }

    public void setLift(Boolean lift) {
        this.lift = lift;
    }

    public Boolean getTelevision() {
        return television;
    }

    public void setTelevision(Boolean television) {
        this.television = television;
    }

    public PersonalAccommodation(){
        super();
    }

    public PersonalAccommodation(String accommodationID, String photoPath0, String photoPath1, String photoPath2, String photoPath3, String photoPath4, String photoPath5, String photoPath6, String photoPath7, String photoPath8, Double pricePerDay, String city, String address, Integer postCode, Date startDate, Date endDate, Boolean pet, String userName, Integer guestNum, String description, String accommodationType, String structureType, String rentType, Integer bedroom, Integer bathroom, Integer kitchen, Boolean park, Boolean gym, Boolean wifi, Boolean lift, Boolean television) {
        super(accommodationID, photoPath0, photoPath1, photoPath2, photoPath3, photoPath4, photoPath5, photoPath6, photoPath7, photoPath8, pricePerDay, city, address, postCode, startDate, endDate, pet, userName, guestNum, description, accommodationType);
        this.structureType = structureType;
        this.rentType = rentType;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.kitchen = kitchen;
        this.park = park;
        this.gym = gym;
        this.wifi = wifi;
        this.lift = lift;
        this.television = television;
    }
}
