package com.tit.onlinefooddelivery;

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double NON_VEG_EXTRA_CHARGE = 50.0; // Additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0; // Default discount
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_EXTRA_CHARGE) * getQuantity();
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = (calculateTotalPrice() * discountPercentage) / 100;
    }

    @Override
    public double getDiscountDetails() {
        return discount;
    }
}
