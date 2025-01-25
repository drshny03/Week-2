package com.tit.week02.day05.hybridinheritance.restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        // Create Chef object
        Chef chef = new Chef("Chef Ramu Kaka", 034, "Indian Dish");
        chef.performDuties();

        System.out.println("\n");

        // Create Waiter object
        Waiter waiter = new Waiter("Waiter Ankit", 18, "A");
        waiter.performDuties();
    }
}