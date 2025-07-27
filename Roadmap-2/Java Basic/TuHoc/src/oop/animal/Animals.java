package oop.animal;

public interface Animals {
    // Đây là các biến hằng số
    String TYPE = "Animal";
    int MAX_AGE = 100;
    String COLOR = "RED";

    // Đây là các phương thức abstract, không có thân hàm
    void makeSound();
    String getName();
    int getAge();

    // Muốn kế thừa phải dùng từ khóa implements
    // vd: class Dog implements Animals
}
