import java.lang.reflect.Method;

public class Q26 {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass");
            Method method = Q26.class.getMethod("nonExistentMethod");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed regardless of whether an exception was thrown or not.");
        }
    }
}
