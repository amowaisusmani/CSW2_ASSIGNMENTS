import java.util.HashMap;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 9, 10};
        System.out.println(findSmallestMissing(arr));
    }

    public static int findSmallestMissing(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, 1);
        }
        for (int i = 1; i <= 10; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return -1; // return -1 if no positive number is missing
    }
}
