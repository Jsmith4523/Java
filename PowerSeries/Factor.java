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

    public static int power(int x, int pow) {
        int product  = 0;

        for(int i = 1; i <= pow; i++) {
            product += i*pow;
        }

        return product;
    }
}
