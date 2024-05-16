public class Q27 {
    public static void main(String[] args) {
        Object obj = "This is a string object";
        try {
            Integer intObj = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
