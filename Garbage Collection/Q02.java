public class Q02 {
    private String name;

    public Q02(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Garbage collected for object: " + name);
    }

    public static void main(String[] args) {
        Q02 ref1 = new Q02("Object 1");
        Q02 ref2 = new Q02("Object 2");

        // Reassigning reference
        ref1 = ref2;

        // Explicitly invoking garbage collector
        System.gc();
    }
}
