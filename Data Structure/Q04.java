class Node {
    int key;
    int population;
    Node left, right;

    public Node(int key, int population) {
        this.key = key;
        this.population = population;
        left = right = null;
    }
}

public class Q04 {
    Node root;

    public Q04() {
        root = null;
    }

    // Insert a node in the BST
    public void insert(int key, int population) {
        root = insertRec(root, key, population);
    }

    private Node insertRec(Node root, int key, int population) {
        if (root == null) {
            root = new Node(key, population);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key, population);
        else if (key > root.key)
            root.right = insertRec(root.right, key, population);

        return root;
    }

    // Perform level order traversal of the tree
    public void levelOrderTraversal() {
        int height = height(root);
        for (int i = 1; i <= height; i++)
            printGivenLevel(root, i);
    }

    private int height(Node root) {
        if (root == null)
            return 0;
        else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    private void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.println(root.key + " " + root.population);
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    // Find the node with maximum population
    public Node findMax() {
        return findMax(root);
    }

    private Node findMax(Node root) {
        if (root == null || root.right == null)
            return root;
        return findMax(root.right);
    }

    // Find the node with minimum population
    public Node findMin() {
        return findMin(root);
    }

    private Node findMin(Node root) {
        if (root == null || root.left == null)
            return root;
        return findMin(root.left);
    }

    public static void main(String[] args) {
        Q04 tree = new Q04();
        tree.insert(50, 100);
        tree.insert(30, 200);
        tree.insert(70, 50);
        tree.insert(20, 300);
        tree.insert(40, 150);
        tree.insert(60, 80);
        tree.insert(80, 120);

        System.out.println("Level Order Traversal:");
        tree.levelOrderTraversal();

        Node maxPopulationNode = tree.findMax();
        System.out.println("\nNode with Maximum Population: Key = " + maxPopulationNode.key + ", Population = " + maxPopulationNode.population);

        Node minPopulationNode = tree.findMin();
        System.out.println("Node with Minimum Population: Key = " + minPopulationNode.key + ", Population = " + minPopulationNode.population);
    }
}
