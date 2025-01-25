package com.tit.week02.day05.assistedproblems.employeemanagementsystem;

public class Intern extends Employee{

    private String skill;
    public Intern(String name, int id, double salary,String skill) {
        super(name, id, salary);
        this.skill = skill;

    }

    @Override
    protected void displayDetails() {
        super.displayDetails();
    }
}
