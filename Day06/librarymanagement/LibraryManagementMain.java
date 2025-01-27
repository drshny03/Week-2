package com.tit.librarymanagement;

// Main class
public class LibraryManagementMain {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book("B101", "Java Programming", "John Doe"),
                new Magazine("M202", "Tech Monthly", "Jane Smith"),
                new DVD("D303", "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
                reservableItem.reserveItem();
                System.out.println("Availability after reservation: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
            }
            System.out.println();
        }
    }
}