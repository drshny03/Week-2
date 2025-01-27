package com.tit.ridehailingapp;

// Main class
public class RideHailingAppMain {
    public static void main(String[] args) {
        // Create vehicle instances
        Vehicle car = new Car("C001", "Darshan", 15.0);
        Vehicle bike = new Bike("B001", "Rajveer", 10.0);
        Vehicle auto = new Auto("A001", "Aditya", 8.0);

        // Update GPS locations
        ((GPS) car).updateLocation("MP Nagar");
        ((GPS) bike).updateLocation("Lake View");
        ((GPS) auto).updateLocation("Rani Kamplapati Railway Station");

        // Array of vehicles
        Vehicle[] vehicles = {car, bike, auto};

        // Calculate fares for a distance of 20 km
        double distance = 20.0;
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println();
        }
    }
}