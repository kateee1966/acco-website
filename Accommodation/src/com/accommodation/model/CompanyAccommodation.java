package com.accommodation.model;

import java.util.ArrayList;
import java.util.Date;

public class CompanyAccommodation extends Accommodation {
    private int star;
    private String roomType;

    private int bedNumber;
    private String bedType;

    private boolean breakfast;
    private boolean pickupAndDeliveryService;

    public CompanyAccommodation(String accommodationID, ArrayList<String> photoPath, double pricePerDay, String city, String suburbs, String address, int postCode, String hotelType, Date avaliable, Boolean pet, User owner, int guestNum, int star, String roomType, int bedNumber, String bedType, boolean breakfast, boolean pickupAndDeliveryService) {
        super(accommodationID, photoPath, pricePerDay, city, suburbs, address, postCode, hotelType, avaliable, pet, owner, guestNum);
        this.star = star;
        this.roomType = roomType;
        this.bedNumber = bedNumber;
        this.bedType = bedType;
        this.breakfast = breakfast;
        this.pickupAndDeliveryService = pickupAndDeliveryService;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean isPickupAndDeliveryService() {
        return pickupAndDeliveryService;
    }

    public void setPickupAndDeliveryService(boolean pickupAndDeliveryService) {
        this.pickupAndDeliveryService = pickupAndDeliveryService;
    }
}
