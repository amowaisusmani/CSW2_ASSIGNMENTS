import java.util.Scanner;
import static java.lang.Math.*;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x:");
        double x = scanner.nextDouble();

        try {
            double result = computeExpression(x);
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double computeExpression(double x) throws ArithmeticException {
        double numerator = abs(sin(x) + cos(x));
        if (numerator <= 0) {
            throw new ArithmeticException("Logarithm of zero or negative number is undefined.");
        }

        double denominator = tan(x) - 1 / tan(x);
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return log(numerator) / denominator;
    }
}
