class Pair<K, V> {
    private K key;
    private V value;

    // Parameterized constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter and setter methods
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class Q01 {
    public static void main(String[] args) {
        // Create Pair objects
        Pair<String, Integer> pair1 = new Pair<>("Alice", 123);
        Pair<String, String> pair2 = new Pair<>("Bob", "456");

        // Retrieve and print the pair of key and value
        System.out.println("Pair1: Key = " + pair1.getKey() + ", Value = " + pair1.getValue());
        System.out.println("Pair2: Key = " + pair2.getKey() + ", Value = " + pair2.getValue());
    }
}
