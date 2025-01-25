package com.tit.week02.day05.hierarchicalinheritance.schoolsystem;

class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Override to display role
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + department);
    }
}