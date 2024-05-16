public class Q06 {
    int info;
    Q06 left;
    Q06 right;

    // Constructor
    public Q06(int info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }

    // Method to insert a node into a binary search tree
    public void insert(int value) {
        if (value <= info) {
            if (left == null) {
                left = new Q06(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Q06(value);
            } else {
                right.insert(value);
            }
        }
    }

    // Method to check if a binary tree is a binary search tree
    public boolean isBST(int min, int max) {
        if (info < min || info > max) {
            return false;
        }

        if (left != null && !left.isBST(min, info - 1)) {
            return false;
        }

        if (right != null && !right.isBST(info + 1, max)) {
            return false;
        }

        return true;
    }
}
