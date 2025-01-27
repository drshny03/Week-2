package com.tit.ecommerce;

// Clothing class
class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.05; // 5% tax
    private static final double DISCOUNT_RATE = 0.20; // 20% discount

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}