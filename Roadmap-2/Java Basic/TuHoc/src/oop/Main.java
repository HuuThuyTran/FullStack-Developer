package oop;

import oop.animal.Cat;
import oop.animal.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky", 5);
        Cat cat = new Cat("Persian", 3);

        dog.makeSound();
        cat.makeSound();


    }
}
