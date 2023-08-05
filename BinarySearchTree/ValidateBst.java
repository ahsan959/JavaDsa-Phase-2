package BinarySearchTree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class ValidateBst {
    public static boolean isValidBst(Node root, int minValue, int maxValue) {
        // Base case
        if (root == null) {
            return true;
        }

        // Check if the current node's data violates the BST property
        if (root.data <= minValue || root.data >= maxValue) {
            return false;
        }

        // Recursively validate the left subtree (with updated maxValue) and
        // the right subtree (with updated minValue)
        return isValidBst(root.left, minValue, root.data) &&
               isValidBst(root.right, root.data, maxValue);
    }

    public static void main(String[] args) {
        // Creating a sample valid Binary Search Tree
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);

        // Calling the validation function with appropriate min and max values
        boolean isValid = isValidBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
        if (isValid) {
            System.out.println("The given binary tree is a valid BST.");
        } else {
            System.out.println("The given binary tree is not a valid BST.");
        }
    }
}
