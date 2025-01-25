package com.tit.week02.day05.assistedproblems.vehicleandtransportsystem;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle car = new Car(225,"Diseal",4,"Sedean");
        Vehicle truck = new Truck(190,"Diseal",3,500);
        Vehicle motorCycle = new MotorCycle(125,"Petrol",2,"Pulsar");

        Vehicle [] vehicles = new Vehicle[3];

        vehicles [0] =  car;
        vehicles [1] =  truck;
        vehicles [2] =  motorCycle;

        for(Vehicle vehicle : vehicles)
        {
            vehicle.displayInfo();
        }




    }
}
