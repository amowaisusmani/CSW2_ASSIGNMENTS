class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a node in BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Method to remove a node from BST
    public void delete(int data) {
        root = deleteRec(root, data);
    }

    private TreeNode deleteRec(TreeNode root, int data) {
        if (root == null) {
            return root;
        }

        // Search for the node to be deleted
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else { // Node found, handle deletion cases
            // Case 1: Node has no children or only one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Node has two children
            // Find the minimum value node in the right subtree
            root.data = minValue(root.right);

            // Delete the minimum value node in the right subtree
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    // Method to find the minimum value node in a subtree
    private int minValue(TreeNode root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Method to perform in-order traversal of the BST
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }
}

public class Q07 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("In-order traversal before deletion:");
        bst.inOrderTraversal();

        // Delete node with value 30
        bst.delete(30);
        System.out.println("\nIn-order traversal after deletion:");
        bst.inOrderTraversal();
    }
}
