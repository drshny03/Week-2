

package com.tit.week02.day05.assistedproblems.animalhierarchy;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    protected void makeSound() {
        System.out.println("Creep Creep");
    }
}
