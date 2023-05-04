package University;

import java.util.ArrayList;

public class Student {

    public static int ID = 0;
    private String name;
    public int studentID;
    public int age;
    public double gpa;


    public Student() {
        this.configure();
    
        //Leave zero for now
        Student.ID += 1;
    }

    public Student(Student[] students, int id) {

        System.out.println(this.alreadyHasExisitingID(students, id));
        if (this.alreadyHasExisitingID(students, id)) {
            ID = setID(students, id);
        }

        ID = id;

        this.configure();
    }

    private Boolean alreadyHasExisitingID(Student[] students, int id) {
        for(Student student: students) {
            return student.ID == id;
        }
        return false;
    }

    private int setID(Student[] students, int id) {
        ArrayList<Student> studentList = new ArrayList<Student>();

        if (!studentList.isEmpty()) {
            return id;
        }

        //Adding students to the student list
        for(Student student: students) {
            studentList.add(student);
        }

        if (studentList.contains(studentList.get(id-1))) {
            Student student = studentList.get(id-1);

            System.out.println("That id is taken already!");
            return studentList.get(ID-1).ID + 1;
        }

        return id;
    }

    private void configure() {
        this.name = "Unknown";
        this.age = 0;
        this.gpa = 0;
        this.studentID = 0;
    }

    public void information() {
        System.out.println("\n----------");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("GPA: %f\n", gpa);
        System.out.printf("Student ID: %d\n", studentID);
        System.out.printf("Identifer: %d\n", ID);
        System.out.println("----------\n");
    }


}