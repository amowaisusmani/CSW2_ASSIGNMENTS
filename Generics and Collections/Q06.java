import java.util.Scanner;
import java.util.TreeSet;

public class Q06 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // (a) Display the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // (b) Ask the user to enter a number and search that number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int number = scanner.nextInt();

        if (treeSet.contains(number)) {
            System.out.println(number + " is present in the TreeSet.");
        } else {
            System.out.println(number + " is not present in the TreeSet.");
        }

        // (c) Remove an element from tree
        System.out.print("Enter a number to remove: ");
        int removeNumber = scanner.nextInt();

        if (treeSet.remove(removeNumber)) {
            System.out.println(removeNumber + " has been removed from the TreeSet.");
        } else {
            System.out.println(removeNumber + " is not present in the TreeSet, so it cannot be removed.");
        }

        // Display the TreeSet after removal
        System.out.println("TreeSet after removal: " + treeSet);

        scanner.close();
    }
}
