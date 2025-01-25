package com.tit.week02.day05.hierarchicalinheritance.schoolsystem;

abstract class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method to display role
    public abstract void displayRole();
}
