package StudentFile;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String name = inputName();
        int age = inputAge();

        Course[] courses;
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
        
    }
}
