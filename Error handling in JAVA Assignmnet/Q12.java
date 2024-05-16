import java.lang.Math;

public class Q12 {
    public static void main(String[] args) {
        double x = Math.PI / 4;  // replace with your actual input
        try {
            double result = calculateExpression(x);
            System.out.println("The result is: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateExpression(double x) {
        double denominator = Math.tan(x) + 1;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        double numerator = Math.sin(x) * Math.cos(x);
        if (numerator < 0) {
            throw new IllegalArgumentException("Square root of negative number is not allowed.");
        }

        return Math.sqrt(Math.abs(numerator)) / denominator;
    }
}
