// HotelBooking class definition
public class HotelBooking {
    private String guestName; // Name of the guest
    private String roomType;  // Type of the room (e.g., Single, Double, Suite)
    private int nights;       // Number of nights booked

    // Default constructor
    public HotelBooking() {
        this.guestName = "Nikhil";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    
    class HotelBookingMain
    {
            // Main method to demonstrate the constructors
            public static void main(String[] args) {
                // Using default constructor
                HotelBooking booking1 = new HotelBooking();
                System.out.println("Default Constructor Booking:");
                booking1.displayBookingDetails();

                // Using parameterized constructor
                HotelBooking booking2 = new HotelBooking("Darshan Yadav", "AC Room", 3);
                System.out.println("\nParameterized Constructor Booking:");
                booking2.displayBookingDetails();

                // Using copy constructor
                HotelBooking booking3 = new HotelBooking(booking2);
                System.out.println("\nCopy Constructor Booking:");
                booking3.displayBookingDetails();
            }
    }
}
