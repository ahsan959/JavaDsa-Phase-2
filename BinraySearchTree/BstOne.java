package BinraySearchTree;

class Node {
    int key;
    Node left;
    Node right;

    public Node(int data) {
        this.key = data;
        this.left = null;
        this.right = null;
    }
}

public class BstOne {
    public Node root;

    public BstOne() {
        this.root = null;
    }

    public void insertNewData(int key) {
        root = insertRecord(root, key);
    }

    public Node insertRecord(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else {
            if (key < root.key) {
                root.left = insertRecord(root.left, key);
            } else if (key > root.key) {
                root.right = insertRecord(root.right, key);
            }
        }
        return root;
    }

    public boolean searchInTree(int key) {
        return search(root, key);
    }

    public boolean search(Node root, int key) {
        if (root == null)
            return false; // Base case

        if (root.key == key)
            return true;

        if (key < root.key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public void printInorder() {
        printInorderTraversal(root);
    }

    public void printInorderTraversal(Node root) {
        if (root == null)
            return;

        printInorderTraversal(root.left);
        System.out.print(" " + root.key);
        printInorderTraversal(root.right);
    }

    public static void main(String[] args) {
        BstOne tree = new BstOne();

        // Inserting elements into the tree
        tree.insertNewData(8);
        tree.insertNewData(3);
        tree.insertNewData(10);
        tree.insertNewData(1);
        tree.insertNewData(6);
        tree.insertNewData(14);
        tree.insertNewData(4);
        tree.insertNewData(7);
        tree.insertNewData(13);

        // Printing the tree in inorder traversal
        System.out.println("Inorder traversal of the binary search tree:");
        tree.printInorder();

        // Searching for an element in the tree
        int searchKey = 6;
        if (tree.searchInTree(searchKey)) {
            System.out.println("\nElement " + searchKey + " found in the tree.");
        } else {
            System.out.println("\nElement " + searchKey + " not found in the tree.");
        }
    }
}
