package BinarySearchTree;

class Node {
    int key; // Corrected field name from 'data' to 'key'
    Node left;
    Node right;

    public Node(int key) { // Corrected parameter name from 'data' to 'key'
        this.key = key; // Corrected field name from 'data' to 'key'
        this.left = null;
        this.right = null;
    }
}

public class findMaxAndMin {
    public Node root; // Declare root node

    public findMaxAndMin() {
        this.root = null; // Initialize root node to null
    }

    public void insertData(int data) {
        root = insertRecord(root, data);
    }

    public Node insertRecord(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        } else {
            if (data < root.key) // Corrected field name from 'data' to 'key'
                root.left = insertRecord(root.left, data);
            else if (data > root.key) // Corrected field name from 'data' to 'key'
                root.right = insertRecord(root.right, data);
        }
        return root;
    }

    public int findMaxValue() {
        // Base case
        if (root == null) {
            throw new IllegalArgumentException("BST is Empty");
        }
        return findMaxValueMethod(root);
    }

    public int findMaxValueMethod(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.key; // Corrected field name from 'data' to 'key'
    }

    public int findMinValue() {
        // Base case
        if (root == null) {
            throw new IllegalArgumentException("BST is Empty");
        }
        return findMinValueMethod(root);
    }

    public int findMinValueMethod(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.key; // Corrected field name from 'data' to 'key'
    }

    public static void main(String[] args) {
        findMaxAndMin tree = new findMaxAndMin();

        // Inserting elements into the tree
        tree.insertData(8);
        tree.insertData(3);
        tree.insertData(10);
        tree.insertData(1);
        tree.insertData(6);
        tree.insertData(14);
        tree.insertData(4);
        tree.insertData(7);
        tree.insertData(13);

        // Find the maximum value in the BST
        try {
            int maxValue = tree.findMaxValue();
            System.out.println("Maximum value in the BST: " + maxValue);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Find the minimum value in the BST
        try {
            int minValue = tree.findMinValue();
            System.out.println("Minimum value in the BST: " + minValue);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
