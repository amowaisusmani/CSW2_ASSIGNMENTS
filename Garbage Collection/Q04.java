class AnonymousObject {
    private String name;

    public AnonymousObject(String name) {
        this.name = name;
    }

    public void finalize() {
        System.out.println("Object " + name + " is being garbage collected.");
    }
}

public class Q04 {
    public static void main(String[] args) {
        // Creating an anonymous object
        new AnonymousObject("Anonymous1");

        // Invoking garbage collector
        System.gc();

        // Note: System.gc() doesn't guarantee immediate garbage collection.
        // So, you may not see the finalization message immediately.
    }
}
