class Country {
    private String name;
    private int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

class BNode {
    private Country info;
    private BNode left;
    private BNode right;

    public BNode(Country info) {
        this.info = info;
        left = null;
        right = null;
    }

    // Getters and setters
    public Country getInfo() {
        return info;
    }

    public void setInfo(Country info) {
        this.info = info;
    }

    public BNode getLeft() {
        return left;
    }

    public void setLeft(BNode left) {
        this.left = left;
    }

    public BNode getRight() {
        return right;
    }

    public void setRight(BNode right) {
        this.right = right;
    }
}

class Q03 {
    private BNode root;

    public Q03() {
        root = null;
    }

    // Method to insert a node into the binary search tree
    public void insert(Country country) {
        root = insertRec(root, country);
    }

    // Helper method to recursively insert a node into the binary search tree
    private BNode insertRec(BNode root, Country country) {
        // If the tree is empty, create a new node as the root
        if (root == null) {
            root = new BNode(country);
            return root;
        }

        // Otherwise, recur down the tree
        if (country.getName().compareTo(root.getInfo().getName()) < 0) {
            root.setLeft(insertRec(root.getLeft(), country));
        } else if (country.getName().compareTo(root.getInfo().getName()) > 0) {
            root.setRight(insertRec(root.getRight(), country));
        }

        // Return the unchanged node pointer
        return root;
    }
}
