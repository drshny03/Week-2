package com.tit.week02.day05.assistedproblems.animalhierarchy;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog("Jimmy",06);
        Animal cat = new Cat("Coco",05);
        Animal bird = new Bird ("Lily",10);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
