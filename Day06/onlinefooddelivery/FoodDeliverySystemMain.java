package com.tit.onlinefooddelivery;

// Main class
public class FoodDeliverySystemMain {
    public static void main(String[] args) {
        FoodItem[] order = {
                new VegItem("Paneer Butter Masala", 200.0, 2),
                new NonVegItem("Chicken Biryani", 300.0, 1)
        };

        double totalOrderPrice = 0.0;

        for (FoodItem item : order) {
            item.getItemDetails();
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price (before discount): " + totalPrice);

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(10); // Applying 10% discount
                double discount = discountable.getDiscountDetails();
                System.out.println("Discount: " + discount);
                totalPrice -= discount;
            }

            System.out.println("Final Price (after discount): " + totalPrice);
            totalOrderPrice += totalPrice;
            System.out.println();
        }

        System.out.println("Total Order Price: " + totalOrderPrice);
    }
}