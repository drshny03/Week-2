package com.tit.week02.day05.assistedproblems.vehicleandtransportsystem;

public class Vehicle {
    private float maxSpeed ;
    private  String fuelType;

    public Vehicle(float maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    protected void displayInfo()
    {
        System.out.println("Max Speed : "+maxSpeed+
                "\n Fuel Type : "+ fuelType);
    }

}
