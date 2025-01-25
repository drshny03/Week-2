package com.tit.week02.day05.assistedproblems.vehicleandtransportsystem;

public class Truck extends  Vehicle{

    int seatCapacity; float volume;
    public Truck(float maxSpeed, String fuelType, int seatCapacity,float volume) {
        super(maxSpeed, fuelType);
        this.volume = volume;
    }

    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity+
                "\n Truck Volume : "+ volume);
    }
}
