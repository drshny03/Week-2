package com.tit.ecommerce;

// Groceries class
class Groceries extends Product {
    private static final double DISCOUNT_RATE = 0.05; // 5% discount

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }

    // Groceries are not taxable
    public String getTaxDetails() {
        return "Groceries are not taxable.";
    }
}