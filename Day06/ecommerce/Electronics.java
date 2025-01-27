package com.tit.ecommerce;

// Electronics class
class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.15; // 15% tax
    private static final double DISCOUNT_RATE = 0.10; // 10% discount

    public Electronics(int productId, String name, double price) {
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
        return "Electronics Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}
