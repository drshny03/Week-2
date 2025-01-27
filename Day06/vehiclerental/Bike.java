package com.tit.vehiclerental;

// Bike class
class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.01; // 1% insurance rate

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Rate: " + (INSURANCE_RATE * 100) + "%";
    }
}
