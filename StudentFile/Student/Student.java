package StudentFile.Student;

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
        System.out.println("\n\n***");
        System.out.printf("Hello %s!\n", fullname);
        System.out.printf("From what we see, you are %d years old\n", age);
        System.out.printf("You are taking %d courses\n\n", courses.length);

        System.out.printf("The average between your %d classes is: %f", courses.length, this.getGradeAverage());

        for(Course course: this.courses) {
            course.showCourseInformation();
        }
    }

    private double getGradeAverage() {
        Double average = 0.0;

        for(Course course: this.courses) {
            average += course.grade;
        }

        return (average/courses.length);
    }
}
