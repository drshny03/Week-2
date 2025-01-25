package com.tit.week02.day05.assistedproblems.vehicleandtransportsystem;

public class MotorCycle extends Vehicle {

    int seatCapacity; String  brand;

    public MotorCycle(float maxSpeed, String fuelType, int seatCapacity, String  brand) {
        super(maxSpeed, fuelType);
        this.brand = brand;
    }
    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity+
                "\n MotorCycle Brand : "+ brand);
    }
}
