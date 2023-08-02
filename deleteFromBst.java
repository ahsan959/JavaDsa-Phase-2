class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class deleteFromBst {

    public static Node deleteFromBst(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (root.data > key) {
            root.left = deleteFromBst(root.left, key);
        } else if (root.data < key) {
            root.right = deleteFromBst(root.right, key);
        } else {
            // Case 2: Node to be deleted has one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Node to be Deleted has two Children
            // Copy the value of the inorder successor
            root.data = findMinValue(root.right);
            root.right = deleteFromBst(root.right, root.data);
        }

        return root;
    }

    public static int findMinValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public static void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        // Constructing a sample BST:
        //       50
        //      /  \
        //     30   70
        //    /  \ /  \
        //   20  40 60  80

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int keyToDelete = 30;

        System.out.println("Original BST:");
        inOrderTraversal(root);

        root = deleteFromBst(root, keyToDelete);

        System.out.println("\nBST after deleting " + keyToDelete + ":");
        inOrderTraversal(root);
    }
}
