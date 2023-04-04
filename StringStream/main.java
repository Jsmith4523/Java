package StringStream;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {

        String firstName, lastName;
        int age;

        System.out.println("Enter your details (F-Name L-Name Age) : ");

        Scanner scnr = null;
        Scanner inSS = null;

        scnr = new Scanner(System.in);
        String userInput = scnr.nextLine();

        inSS = new Scanner(userInput);

        firstName = inSS.next();
        lastName = inSS.next();
        age = inSS.nextInt();
        
        System.out.printf("Last Name: %s\nFirst Name: %s\nAge: %d\n", lastName, firstName, age);
    }
}
