package february13;
import java.util.Scanner;

import java.util.Scanner;

public class BinarySearchTreeOperations {

    class Node {
        int data;
        Node left;
        Node right;
        int height;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 0;
        }

        public int getValue() {
            return data;
        }
    }

    Node root;

    public int treeHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty() {
        return root == null;
    }

    Scanner sc = new Scanner(System.in);

    public void insert(int data) {
        root = BuildTree(root, data);
    }

    private Node BuildTree(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = BuildTree(node.left, data);
        } else if (data > node.data) {
            node.right = BuildTree(node.right, data);
        }

        node.height = Math.max(treeHeight(node.left), treeHeight(node.right)) + 1;

        return node;
    }


    public boolean DFSSearch(Node node, int key) {
        if (node == null) {
            return false;
        }
        if (node.data == key) {
            return true;
        }
        return DFSSearch(node.left, key) || DFSSearch(node.right, key);
    }
    public void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
    public void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinarySearchTreeOperations bst = new BinarySearchTreeOperations();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder Traversal: ");
        bst.inorderTraversal(bst.root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        bst.preorderTraversal(bst.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        bst.postorderTraversal(bst.root);
        System.out.println();


        int key = 60;
        System.out.println("check " + key + "  in the tree " + bst.DFSSearch(bst.root, key));

    }
}