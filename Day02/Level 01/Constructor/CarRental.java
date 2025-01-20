// CarRental class definition
public class CarRental {
    private String customerName; // Name of the customer
    private String carModel;     // Model of the car being rented
    private int rentalDays;      // Number of rental days
    private static final double DAILY_RATE = 50.0; // Daily rental rate (constant)

    // Default constructor
    public CarRental() {
        this("Nikhil", "Standard", 15); // Default values
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total cost of the rental
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }
 
    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: INR " + calculateTotalCost());
    }

    class arRentalMain
    {
        // Main method to demonstrate the Car Rental System
        public static void main(String[] args) {
            // Using default constructor
            CarRental defaultRental = new CarRental();
            System.out.println("Default Constructor Rental:");
            defaultRental.displayRentalDetails();

            // Using parameterized constructor
            CarRental customRental = new CarRental("Darshan Yadav", "SUV", 30);
            System.out.println("\nParameterized Constructor Rental:");
            customRental.displayRentalDetails();
         }
    }
}
