import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        double x = scanner.nextDouble();

        try {
            double numerator = Math.sin(x) * Math.cos(x);
            double denominator = Math.sin(x) + Math.cos(x);

            if (denominator == 0) {
                throw new ArithmeticException("Denominator is zero, cannot divide by zero");
            }

            double result = numerator / denominator;
            System.out.println("The result is " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
