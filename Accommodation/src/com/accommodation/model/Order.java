package com.accommodation.model;

import java.util.Date;

public class Order {
    private String OrderID;
    private String accommodationID;
    private String sellerName;
    private String buyerName;
    private Date orderCreatedDate;

    public Order(){

    }

    public Order(String orderID, String accommodationID, String sellerName, String buyerName, Date orderCreatedDate) {
        this.OrderID = orderID;
        this.accommodationID = accommodationID;
        this.sellerName = sellerName;
        this.buyerName = buyerName;
        this.orderCreatedDate = orderCreatedDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderID='" + OrderID + '\'' +
                ", accommodationID='" + accommodationID + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", orderCreatedDate=" + orderCreatedDate +
                '}';
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getAccommodationID() {
        return accommodationID;
    }

    public void setAccommodationID(String accommodationID) {
        this.accommodationID = accommodationID;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public Date getOrderCreatedDate() {
        return orderCreatedDate;
    }

    public void setOrderCreatedDate(Date orderCreatedDate) {
        this.orderCreatedDate = orderCreatedDate;
    }
}
