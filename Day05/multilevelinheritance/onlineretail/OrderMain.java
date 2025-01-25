package com.tit.week02.day05.multilevelinheritance.onlineretail;

public class OrderMain {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder("O12345", "2025-01-24", "987654", "2025-01-27");
        order.displayInfo();
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
