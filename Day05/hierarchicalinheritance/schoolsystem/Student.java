package com.tit.week02.day05.hierarchicalinheritance.schoolsystem;

class Student extends Person {
    private int grade;

    // Constructor
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Override to display role
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Grade: " + grade);
    }
}