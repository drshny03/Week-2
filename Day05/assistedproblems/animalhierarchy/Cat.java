package com.tit.week02.day05.assistedproblems.animalhierarchy;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    protected void makeSound()
    {
        System.out.println("Meow Meow");
    }

}
