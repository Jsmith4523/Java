package StudentFile;

public class Student {
    String fullname;
    int age;
    Course[] courses;


    public Student(String fullname, int age, Course[] courses) {
        this.fullname = fullname;
        this.age = age;
        this.courses = courses;
    }
}
