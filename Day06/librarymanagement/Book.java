package com.tit.librarymanagement;

// Book class
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Default availability
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for books is 14 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}