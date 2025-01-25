package com.tit.week02.day05.hybridinheritance.restaurant;

class Waiter extends Person implements Worker {
    private String section;

    // Constructor
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    // Implement performDuties from Worker interface
    @Override
    public void performDuties() {
        System.out.println(getName() + " is serving customers in section " + section + ".");
    }

    // Getter for section
    public String getSection() {
        return section;
    }
}