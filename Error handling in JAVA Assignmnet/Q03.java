class CustomNullPointerException extends NullPointerException {
    public CustomNullPointerException(String message) {
        super(message);
    }
}
public class Q03 {
    public static void main(String[] args) {
        try {
            throw new CustomNullPointerException("This is a custom null pointer exception");
        } catch (CustomNullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
