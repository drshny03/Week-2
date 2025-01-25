package com.tit.week02.day05.hybridinheritance.vehiclemanagement;

public class VehicleMain {
    public static void main(String[] args) {
        // Create ElectricVehicle object
        ElectricVehicle electricCar = new ElectricVehicle("Tesla Model S", 250, 100);
        electricCar.displayDetails();
        electricCar.charge();

        System.out.println("\n");

        // Create PetrolVehicle object
        PetrolVehicle petrolCar = new PetrolVehicle("Hyundai Verna X", 180, "Disel");
        petrolCar.displayDetails();
        petrolCar.refuel();
    }
}