// Vehicle class definition
 class Vehicle {
    private String ownerName;     // Name of the vehicle's owner
    private String vehicleType;   // Type of the vehicle (e.g., Car, Bike, etc.)
    private static double registrationFee = 1000.0; // Fixed registration fee for all vehicles

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: INR " + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

// Main class with the main method
public class VehicleMain {
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("Darshan Yadav", "Bike");
        Vehicle vehicle2 = new Vehicle("Nikhil Yadav", "Car");

        // Display details of vehicles before updating the registration fee
        System.out.println("Before Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();

        // Update the registration fee using the class method
        Vehicle.updateRegistrationFee(2000);

        // Display details of vehicles after updating the registration fee
        System.out.println("\nAfter Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
