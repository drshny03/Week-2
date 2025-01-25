package com.tit.week02.day05.assistedproblems.vehicleandtransportsystem;

public class Car extends Vehicle {

    int seatCapacity; String carType;
    public Car(float maxSpeed, String fuelType, int seatCapacity, String carType) {
        super(maxSpeed, fuelType);
        this.carType = carType;
    }

    @Override
    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity+
                            "\n Car Type : "+ carType);
    }
}
