package com.tit.week02.day05.assistedproblems.employeemanagementsystem;

public class Manager extends Employee{
     private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    protected void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size Of Manager is : "+teamSize);
    }
}
