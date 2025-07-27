package oop.animal;

public abstract class Animal {
    private void eating() {
        System.out.println("This animal is eating....");
    }

    private void sleeping() {
        System.out.println("This animal is sleeping....");
    }

    protected void working() {
        eating();
        System.out.println("This animal is working....");
        sleeping();
    }

//    public void makeSound() {
//        System.out.println("This animal makes a sound.");
//    }

    public abstract void makeSound();
}
