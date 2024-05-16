import java.util.Scanner;
import static java.lang.Math.*;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for x:");
        double x = scanner.nextDouble();

        try {
            double result = log(sin(x) + cos(x)) / (tan(x) - 1 / tan(x));
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException. Possibly division by zero.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Caught an Exception.");
            e.printStackTrace();
        }
    }
}
