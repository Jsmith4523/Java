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

        Student[] studentsArr1 = {student1, student2, student3, student4};
    
        Student student5 = new Student(studentsArr1, 18);

        Student[] studentsArr2 = {student1, student2, student3, student4, student5};

        Student student6 = new Student(studentsArr2, 18);

        student5.information();
        student6.information();

    }
}
