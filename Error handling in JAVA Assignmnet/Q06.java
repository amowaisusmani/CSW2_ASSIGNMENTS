public class Q06 {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException.");
            e.printStackTrace();
        }
    }
}
