package University;

import StringStream.main;

public class Student {

    public static int ID = 0;
    private String name;
    public int studentID;
    public int age;
    public double gpa;


    public Student() {
        this.configure();
    
        //Leave zero for now
        this.studentID = 0;
    }

    public Student(Student[] students, int id) {
        
        if (this.alreadyHasExisitingID(students, id)) {

        }

        this.configure();
    }

    private Boolean alreadyHasExisitingID(Student[] students, int id) {
        for(Student student: students) {
            return student.ID == id;
        }
        return false;
    }

    private void configure() {
        this.name = "Unknown";
        this.age = 0;
        this.gpa = 0;
    }

    public void information() {
        System.out.printf("Name: %s", name);
        System.out.printf("Age: %d", age);
        System.out.printf("GPA: %d", gpa);
        System.out.printf("Student ID: %d", studentID);
    }


}