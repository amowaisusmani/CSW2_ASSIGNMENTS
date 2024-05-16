class Q03 {
    private String name;

    public Q03(String name) {
        this.name = name;
    }

    public void finalize() {
        System.out.println("Object " + name + " has been garbage collected.");
    }

    public static void main(String[] args) {
        Q03 obj = new Q03("Object1");
        System.out.println("Object created: " + obj.name);

        // Nullify the reference
        obj = null;

        // Explicitly invoke garbage collector
        System.gc();
    }
}
