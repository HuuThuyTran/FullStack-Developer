package oop.student;

public class Student {
    static String name;
    private int age;
    private double score;

    public Student() {}

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        name = "John Doe"; // Default name if not set
        return name;
    }
}
