package com.tit.vehiclerental;


public class VehicleRentalMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("MP12MJ0007", 500),
                new Bike("MP12ZZ9706", 200),
                new Truck("MO12KL1212", 1000)
        };

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0.0;
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println("Final Cost (Rental + Insurance): " + (rentalCost + insuranceCost));
            System.out.println();
        }
    }
}