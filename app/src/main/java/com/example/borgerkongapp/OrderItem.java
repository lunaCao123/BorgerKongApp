package com.example.borgerkongapp;

import java.util.List;

public class OrderItem {

    private String orderitemName;
    private double orderitemPrice;
    private double orderitemTotal;
    private int orderitemQuantity;
    private double orderTotal;
    public List<OrderItem>saved;


    public OrderItem(String orderitemName, double orderitemPrice, int orderitemQuantity, double orderTotal) {

        this.orderitemName = orderitemName;
        this.orderitemPrice = orderitemPrice;
        this.orderitemQuantity = orderitemQuantity;
        this.orderTotal = orderTotal;
    }

//    public int getOrderID() {
//        return orderID;
//    }
//
//    public void setOrderID(int orderID) {
//        this.orderID = orderID;
//    }

    public String getOrderitemName() {
        return orderitemName;
    }

    public void setOrderitemName(String orderitemName) {
        this.orderitemName = orderitemName;
    }

    public double getOrderitemPrice() {
        return orderitemPrice;
    }

    public void setOrderitemPrice(double orderitemPrice) {
        this.orderitemPrice = orderitemPrice;
    }

    public int getOrderitemQuantity() {
        return orderitemQuantity;
    }

    public void setOrderitemQuantity(int orderitemQuantity) {
        this.orderitemQuantity = orderitemQuantity;
    }

    public double getOrderitemTotal() {
        return orderitemTotal;
    }

    public void setOrderitemTotal(double orderitemTotal) {
        this.orderitemTotal = orderitemTotal;
    }

}
