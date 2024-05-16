public class Q01 {
    private String name;

    // Constructor initializing an object with a given name
    public Q01(String name) {
        this.name = name;
    }

    // Show method creating an instance of UnreachableObject class and then invoking display
    public void show() {
        Q01 obj = new Q01("Test Object");
        obj.display();
    }

    // Display method creating an UnreachableObject instance
    public void display() {
        Q01 obj = new Q01("Display Object");
    }

    // Override the finalize method to print the object's name upon successful garbage collection
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Garbage collected from object: " + name);
    }

    // Main method calling show followed by an explicit invocation of the garbage collector
    public static void main(String[] args) {
        Q01 mainObj = new Q01("Main Object");
        mainObj.show();
        System.gc();
    }
}
