package com.tit.vehiclerental;

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters and Setters with validation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        if (vehicleNumber != null && !vehicleNumber.isEmpty()) {
            this.vehicleNumber = vehicleNumber;
        } else {
            throw new IllegalArgumentException("Vehicle number cannot be null or empty.");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && !type.isEmpty()) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Type cannot be null or empty.");
        }
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate > 0) {
            this.rentalRate = rentalRate;
        } else {
            throw new IllegalArgumentException("Rental rate must be positive.");
        }
    }

    // Abstract method for rental cost calculation
    public abstract double calculateRentalCost(int days);

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}