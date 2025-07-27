package oop.animal;

public class Dog extends Animal{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public void makeSound() {
//        System.out.println(name + ": Gau Gau!");
//    }

    public void bark() {
        System.out.println(name + " says Woof!");
    }

    @Override
    public void makeSound() {
        System.out.println("1. " + name + ": Woof Woof!");
    }
}
