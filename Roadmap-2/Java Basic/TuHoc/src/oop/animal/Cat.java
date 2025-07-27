package oop.animal;

public class Cat extends Animal {
    private String name;
    private int age;

    public Cat(String name, int age) {
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
//        System.out.println(name + ": Meow Meow!");
//    }

    @Override
    public void makeSound() {
        System.out.println("2. " + name + ": Meow Meow!");
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}
