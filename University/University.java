package University;

import StringStream.main;

public class University {
    
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.information();
        Student student2 = new Student();
        student2.information();
        Student student3 = new Student();
        student3.information();
        Student student4 = new Student();
        student4.information();
    
        Student[] students = {student1, student2, student3, student4};
    
        Student student5 = new Student(students, 18);

        student5.information();

    }
}
