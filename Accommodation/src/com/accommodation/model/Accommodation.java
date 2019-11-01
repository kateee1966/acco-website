package com.accommodation.model;

import java.util.ArrayList;

import java.util.Date;

public class Accommodation {
    private String accommodationID; //

    private String photoPath0;
    private String photoPath1;
    private String photoPath2;
    private String photoPath3;
    private String photoPath4;
    private String photoPath5;
    private String photoPath6;
    private String photoPath7;
    private String photoPath8;

    private Double pricePerDay;
    private String city;
    private String address;
    private Integer postCode;
    private Date startDate;
    private Date endDate;
    private Boolean pet;
    private String userName;
    private Integer guestNum;
    private String description;

    private String accommodationType;

    @Override
    public String toString() {
        return "Accommodation{" +
                "accommodationID='" + accommodationID + '\'' +
                ", photoPath0='" + photoPath0 + '\'' +
                ", photoPath1='" + photoPath1 + '\'' +
                ", photoPath2='" + photoPath2 + '\'' +
                ", photoPath3='" + photoPath3 + '\'' +
                ", photoPath4='" + photoPath4 + '\'' +
                ", photoPath5='" + photoPath5 + '\'' +
                ", photoPath6='" + photoPath6 + '\'' +
                ", photoPath7='" + photoPath7 + '\'' +
                ", photoPath8='" + photoPath8 + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", postCode=" + postCode +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pet=" + pet +
                ", userName='" + userName + '\'' +
                ", guestNum=" + guestNum +
                ", description='" + description + '\'' +
                ", accommodationType='" + accommodationType + '\'' +
                '}';
    }

    public String getAccommodationID() {
        return accommodationID;
    }

    public void setAccommodationID(String accommodationID) {
        this.accommodationID = accommodationID;
    }

    public String getPhotoPath0() {
        return photoPath0;
    }

    public void setPhotoPath0(String photoPath0) {
        this.photoPath0 = photoPath0;
    }

    public String getPhotoPath1() {
        return photoPath1;
    }

    public void setPhotoPath1(String photoPath1) {
        this.photoPath1 = photoPath1;
    }

    public String getPhotoPath2() {
        return photoPath2;
    }

    public void setPhotoPath2(String photoPath2) {
        this.photoPath2 = photoPath2;
    }

    public String getPhotoPath3() {
        return photoPath3;
    }

    public void setPhotoPath3(String photoPath3) {
        this.photoPath3 = photoPath3;
    }

    public String getPhotoPath4() {
        return photoPath4;
    }

    public void setPhotoPath4(String photoPath4) {
        this.photoPath4 = photoPath4;
    }

    public String getPhotoPath5() {
        return photoPath5;
    }

    public void setPhotoPath5(String photoPath5) {
        this.photoPath5 = photoPath5;
    }

    public String getPhotoPath6() {
        return photoPath6;
    }

    public void setPhotoPath6(String photoPath6) {
        this.photoPath6 = photoPath6;
    }

    public String getPhotoPath7() {
        return photoPath7;
    }

    public void setPhotoPath7(String photoPath7) {
        this.photoPath7 = photoPath7;
    }

    public String getPhotoPath8() {
        return photoPath8;
    }

    public void setPhotoPath8(String photoPath8) {
        this.photoPath8 = photoPath8;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getPet() {
        return pet;
    }

    public void setPet(Boolean pet) {
        this.pet = pet;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getGuestNum() {
        return guestNum;
    }

    public void setGuestNum(Integer guestNum) {
        this.guestNum = guestNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public Accommodation(String accommodationID, String photoPath0, String photoPath1, String photoPath2, String photoPath3, String photoPath4, String photoPath5, String photoPath6, String photoPath7, String photoPath8, Double pricePerDay, String city, String address, Integer postCode, Date startDate, Date endDate, Boolean pet, String userName, Integer guestNum, String description, String accommodationType) {
        this.accommodationID = accommodationID;
        this.photoPath0 = photoPath0;
        this.photoPath1 = photoPath1;
        this.photoPath2 = photoPath2;
        this.photoPath3 = photoPath3;
        this.photoPath4 = photoPath4;
        this.photoPath5 = photoPath5;
        this.photoPath6 = photoPath6;
        this.photoPath7 = photoPath7;
        this.photoPath8 = photoPath8;
        this.pricePerDay = pricePerDay;
        this.city = city;
        this.address = address;
        this.postCode = postCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pet = pet;
        this.userName = userName;
        this.guestNum = guestNum;
        this.description = description;
        this.accommodationType = accommodationType;
    }

    public Accommodation(){

    }


}
