package PowerSeries;

public class Factor {
    public static int factorial(int num) {
        int factorial = 1;

        if (num > 2) {
            for(int i = num; i > 0; i--) {
                factorial *= i;
            }
        } else {
            factorial = num;
        }

        return factorial;
    }

    public static int findPower(int x, int pow) {


        return 0;
    }
}
