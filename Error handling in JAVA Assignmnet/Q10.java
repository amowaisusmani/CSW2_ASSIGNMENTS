import java.util.Scanner;
import java.lang.Math;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            double x = scanner.nextDouble();
            
            // Check if x is close to multiples of pi/2
            double remainder = x % (Math.PI / 2);
            if (Math.abs(remainder) < 0.0001 || Math.abs(remainder - Math.PI / 2) < 0.0001) {
                System.out.println("Error: Division by zero is not defined. Please enter a different number.");
            } else {
                // Calculate the expression
                double result = (Math.sin(x) + Math.cos(x)) / Math.tan(x);
                System.out.println("The value of the expression (sin(x) + cos(x)) / tan(x) for x = " + x + " is " + result);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
