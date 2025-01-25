package com.tit.week02.day05.hybridinheritance.vehiclemanagement;

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Getter for batteryCapacity
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    // Method to charge the vehicle
    public void charge() {
        System.out.println(getModel() + " is being charged. Battery capacity: " + batteryCapacity + " kWh.");
    }

    // Overriding displayDetails to include battery capacity
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}