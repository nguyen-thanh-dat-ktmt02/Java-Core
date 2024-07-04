package PolymorphismDemo;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Studen is running");
    }

    public  void study(){
        System.out.println("Student is studing");
    }
}
