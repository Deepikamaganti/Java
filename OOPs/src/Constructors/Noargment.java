package Constructors;

public class Noargment {

    public static void main(String[] args) {
        Student1 s = new Student1();
        System.out.println(s.name + "  " + s.age); 
    }
}

class Student1 {
    String name;
    int age;

    // No-argument constructor
    Student1() {
        name = "Deepika";
        age = 20;
    }
}
