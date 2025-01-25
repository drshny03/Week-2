package com.tit.week02.day05.hybridinheritance.vehiclemanagement;

class PetrolVehicle extends Vehicle implements Refuelable {
    private String fuelType;

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, String fuelType) {
        super(model, maxSpeed);
        this.fuelType = fuelType;
    }

    // Getter for fuelType
    public String getFuelType() {
        return fuelType;
    }

    // Implement refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println(getModel() + " is being refueled with " + fuelType + ".");
    }

    // Overriding displayDetails to include fuel type
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}
