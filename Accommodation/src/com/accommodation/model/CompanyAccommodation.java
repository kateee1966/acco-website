package com.accommodation.model;

import java.util.ArrayList;
import java.util.Date;

public class CompanyAccommodation extends Accommodation {
    private String hotelType;
    private Integer star;

    public CompanyAccommodation(){

    }

    @Override
    public String toString() {
        return "CompanyAccommodation{" +
                "hotelType='" + hotelType + '\'' +
                ", star=" + star +
                "} " + super.toString();
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public CompanyAccommodation(String accommodationID, String photoPath0, String photoPath1, String photoPath2, String photoPath3, String photoPath4, String photoPath5, String photoPath6, String photoPath7, String photoPath8, Double pricePerDay, String city, String address, Integer postCode, Date startDate, Date endDate, Boolean pet, String userName, Integer guestNum, String description, String ownerType, String hotelType, Integer star) {
        super(accommodationID, photoPath0, photoPath1, photoPath2, photoPath3, photoPath4, photoPath5, photoPath6, photoPath7, photoPath8, pricePerDay, city, address, postCode, startDate, endDate, pet, userName, guestNum, description, ownerType);
        this.hotelType = hotelType;
        this.star = star;
    }
}
