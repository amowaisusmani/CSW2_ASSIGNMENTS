public class Q01 {
    int info;
    Q01 left;
    Q01 right;

    // Constructor
    public Q01(int info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }

    // Method to insert a node into a binary search tree
    public void insert(int value) {
        if (value <= info) {
            if (left == null) {
                left = new Q01(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Q01(value);
            } else {
                right.insert(value);
            }
        }
    }
}
