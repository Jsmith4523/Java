package PowerSeries;

import PowerSeries.Calculate.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startCalculation();
    }

    public static void startCalculation() {
        Scanner input;

        //Constant...
        int x;
        //The number of times we need to repeat...
        int repeat;
        
        try {
            input = new Scanner(System.in);

            System.out.println("Enter the number you want to calculate:");
            x      = input.nextInt();
            System.out.println("Now, enter the amount of times you want to calculate for:");
            repeat = input.nextInt();

            System.out.printf("%d in power series is %f", x, calculate(x, repeat));

        } catch (Exception e) {
            System.out.println("Not a valid input!");
            //Restart method...
            startCalculation();
        }
    }

    public static double calculate(int x, int repeat) {

        //Immediatey adding 1 + x since it will not be required later...
        int sum = 1+x;

        for(int i = 2; i < repeat; i++) {
            //x to the power of i divided by the factorial of i
            sum += (Calculate.power(x, i)/Calculate.factorial(i));
        }

        return sum;
    }
}