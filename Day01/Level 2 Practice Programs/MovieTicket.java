import java.util.Scanner; // Importing Scanner class for user input

// Class to represent a Movie Ticket
public class MovieTicket {
    // Attributes to store movie ticket details
    String movieName;
    String seatNumber;
    double price;

    // Constructor to initialize movie ticket with movie name, seat number, and price
    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName; // Assigning movie name
        this.seatNumber = seatNumber; // Assigning seat number
        this.price = price; // Assigning ticket price
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber; // Assigning the chosen seat number
        this.price = price; // Setting the ticket price for the booked seat
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName); // Printing movie name
        System.out.println("Seat Number: " + seatNumber); // Printing seat number
        System.out.println("Ticket Price: INR "+ price); // Printing the price of the ticket
    }
}

// Main class to test MovieTicket class
class MovieTicketMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input

        // Prompting the user to enter movie ticket details
        System.out.println("Enter Movie Name:");
        String movieName = input.nextLine(); // Reading the movie name

        System.out.println("Enter Seat Number:");
        String seatNumber = input.nextLine(); // Reading seat number

        System.out.println("Enter Ticket Price:");
        double price = input.nextDouble(); // Reading ticket price

        // Creating a MovieTicket object with user-provided details
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        // Displaying the ticket details
        System.out.println("\nTicket Booking Successful!");
        ticket.displayTicketDetails(); // Display ticket details

        input.close(); // Closing the Scanner object
    }
}
