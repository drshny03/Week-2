package com.tit.librarymanagement;

// Magazine class
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Default availability
    }

    @Override
    public int getLoanDuration() {
        return 7; // Loan duration for magazines is 7 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}