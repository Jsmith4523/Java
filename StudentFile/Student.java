package StudentFile;

import StudentFile.Course.*;;

public class Student {
    String fullname;
    int age;
    Course[] courses;


    public Student(String fullname, int age, Course[] courses) {
        this.fullname = fullname;
        this.age = age;
        this.courses = courses;
    }

    public void printInformation() {
        System.out.printf("Hello %s!\n", fullname);
        System.out.printf("From what we see, you are %d years old\n", age);
        System.out.printf("You are taking %d courses\n\n", courses.length);

        for(Course course: this.courses) {
            course.showCourseInformation();
        }
    }
}
