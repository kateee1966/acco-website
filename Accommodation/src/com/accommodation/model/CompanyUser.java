package com.accommodation.model;

public class CompanyUser extends User{
    private String websiteLink;
    private String address;
    private String contactNumber;
    private String hotelType;


    public CompanyUser(String userID, String userName, String password, String profilePhotoPath, String websiteLink, String address, String contactNumber, String hotelType) {
        super(userID, userName, password, profilePhotoPath);
        this.websiteLink = websiteLink;
        this.address = address;
        this.contactNumber = contactNumber;
        this.hotelType = hotelType;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public CompanyUser(){
        super();
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public void setWebsiteLink(String websiteLink) {
        this.websiteLink = websiteLink;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
