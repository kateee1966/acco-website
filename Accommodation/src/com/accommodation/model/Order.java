package com.accommodation.model;

import java.util.Date;

public class Order {
    private String accommodationID;
    private User seller;
    private User buyer;
    private Date orderCreationDate;

    public Order(String accommodationID, User seller, User buyer, Date orderCreationDate) {
        this.accommodationID = accommodationID;
        this.seller = seller;
        this.buyer = buyer;
        this.orderCreationDate = orderCreationDate;
    }

    public String getAccommodationID() {
        return accommodationID;
    }

    public void setAccommodationID(String accommodationID) {
        this.accommodationID = accommodationID;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Date getOrderCreationDate() {
        return orderCreationDate;
    }

    public void setOrderCreationDate(Date orderCreationDate) {
        this.orderCreationDate = orderCreationDate;
    }
}
