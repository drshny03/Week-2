package com.tit.week02.day05.hybridinheritance.restaurant;

class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implement performDuties from Worker interface
    @Override
    public void performDuties() {
        System.out.println(getName() + " is cooking " + specialty + " in the kitchen.");
    }

    // Getter for specialty
    public String getSpecialty() {
        return specialty;
    }
}