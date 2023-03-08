package StudentFile;

import java.util.Scanner;
import StudentFile.Course.*;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Student student;

        String name = inputName();
        int age = inputAge();
        Course[] courses = inputCourses();

        student = new Student(name, age, courses);
        student.printInformation();
    }

    public static String inputName() {
        String fullName = "";

        System.out.println("Enter your firstname:");
        fullName += input.nextLine();
        System.out.println("Enter your lastname:");
        fullName += " "+input.nextLine();

        return fullName;
    }

    public static int inputAge() {
        int age = 0;

        System.out.println("How old are you?");
        
        try {
            age = input.nextInt();
        } catch(Exception e) {
            System.out.println("That is an invalid input!");
        }

        return age;
    }

    public static Course[] inputCourses() {
        Course[] courses = new Course[3];

        for(int i = 0; i < 3; i++) {
            String title;
            String instructorName;
            String days;
            String duration; 

            System.out.println("What is the name of course #"+(i+1));
            title = input.nextLine();
            System.out.println("Who is the instructor of course?");
            instructorName = input.nextLine();
            System.out.println("What days does this course take place? Type in full format such as 'Monday'");
            days = input.nextLine();
            System.out.println("How long is this class?");
            duration = input.nextLine();

            courses[i] = new Course(title, instructorName, days, duration);
        }

        return courses;
    }
}
