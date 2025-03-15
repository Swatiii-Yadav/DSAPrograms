package march14;

public class DeleteSpecificNodeBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node root;


    public Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) return root.left;
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = deleteNode(root.right, successor.data);
        }

        return root;
}


    Node findMin(Node node) {
        while (node.left != null) node = node.left;
        return node;

    }


    public void inorderPrint(Node root) {
        if (root != null) {
            inorderPrint(root.left);
            System.out.print(root.data + " ");
            inorderPrint(root.right);
        }
    }

    public static void main(String[] args) {
        DeleteSpecificNodeBST tree = new DeleteSpecificNodeBST();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);

        System.out.println("Original bst");
        tree.inorderPrint(root);
        System.out.println("enter node to be deleted");

        root = tree.deleteNode(root, 3);

        System.out.println("BST after deletion (In-order):");
        tree.inorderPrint(root);
    }
}


