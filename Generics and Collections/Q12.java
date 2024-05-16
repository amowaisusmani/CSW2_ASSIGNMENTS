import java.util.PriorityQueue;

public class Q12 {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] arr = {1,2,10,8,7,3,4,6,5,9};

        // Create a min heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
        }

        // Dequeue elements from the PriorityQueue
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
