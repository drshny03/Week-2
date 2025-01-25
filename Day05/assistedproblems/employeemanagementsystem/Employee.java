package com.tit.week02.day05.assistedproblems.employeemanagementsystem;

public class Employee  {

   protected String name;
    protected int id;
    protected  double salary;


    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
    protected void displayDetails(){

        System.out.println("Name of Employee : "+name+
                "\nEmploye ID IS : "+id+
                "\nSalary of Employee : "+ salary);

    }
}
