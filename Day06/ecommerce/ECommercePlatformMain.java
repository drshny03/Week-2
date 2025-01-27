package com.tit.ecommerce;


// Main class
public class ECommercePlatformMain {
    public static void calculateFinalPrice(Product[] products) {
        for (Product product : products) {
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Product[] products = {
                new Electronics(1, "Smartphone", 20000),
                new Clothing(2, "Jeans", 1500),
                new Groceries(3, "Rice", 500)
        };

        calculateFinalPrice(products);
    }
}