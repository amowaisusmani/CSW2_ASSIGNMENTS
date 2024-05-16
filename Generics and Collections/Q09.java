import java.util.HashSet;

public class Q09 {
    public static void printRepeating(int arr[]) {
        HashSet<Integer> set = new HashSet<Integer>();
        System.out.println("Repeating elements are: ");
        
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i]))
                System.out.println(arr[i]);
            else
                set.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        printRepeating(arr);
    }
}
