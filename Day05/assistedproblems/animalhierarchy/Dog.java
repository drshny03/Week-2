package com.tit.week02.day05.assistedproblems.animalhierarchy;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    protected void makeSound()
    {
        System.out.println("Barking");
    }
}
