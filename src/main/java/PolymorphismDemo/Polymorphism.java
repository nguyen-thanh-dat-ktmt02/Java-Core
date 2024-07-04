package PolymorphismDemo;

public class Polymorphism {
    public static void main(String[] args) {
        // Tính đa hình: Dùng để quản lý
        // person --> student
        Student student = new Student("Dat", 22);
        student.run();
        student.study();
        Person person = (Person) student;
        person.run();


        // instenceof: Kiểm tra xem person có phải là học sinh hay không, kỹ sư hay không, công nhân hay không
        boolean isStudent = person instanceof Student;
        System.out.println("isStudent = " + isStudent);



    }
}
