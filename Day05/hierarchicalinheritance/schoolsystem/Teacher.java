package com.tit.week02.day05.hierarchicalinheritance.schoolsystem;

class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Override to display role
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + subject);
    }
}