package com.tit.week02.day05.multilevelinheritance.onlineretail;

public class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public void displayInfo() {
        System.out.println("Order ID: " + orderId + "\nOrder Date: " + orderDate);
    }
}


