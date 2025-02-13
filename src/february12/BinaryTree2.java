package february12;
import java.util.Scanner;

import java.util.Scanner;

public class BinaryTree2 {
    // Node class representing each node in the tree
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Root of the binary tree
    static Node root;
    Scanner sc;

    // Constructor to initialize the tree and scanner
    BinaryTree2() {
        root = null;
        sc = new Scanner(System.in);
    }

    // Method to build the tree dynamically
    public Node BuildTree() {
        System.out.println("Enter value for node (-1 for no node):");
        int n = sc.nextInt();

        // Base case: if input is -1, no node is created
        if (n == -1) {
            return null;
        }

        // Create a new node with the given value
        Node treeNode = new Node(n);

        // Recursively build the left subtree
        System.out.println("Going to the left of " + n);
        treeNode.left = BuildTree();  // Call without parameter for left subtree

        // Recursively build the right subtree
        System.out.println("Going to the right of " + n);
        treeNode.right = BuildTree(); // Call without parameter for right subtree

        return treeNode;
    }

    // Inorder Traversal (Left -> Root -> Right)
    void InOrderTraverse(Node curr) {
        if (curr == null) {
            return;
        }
            // Visit left subtree
        System.out.print(curr.data + " ");
        InOrderTraverse(curr.left); // Visit root
        InOrderTraverse(curr.right);       // Visit right subtree
    }

    // Main method to run the tree example
    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();

        // Correctly assign the root after building the tree
        root = tree.BuildTree(); // Corrected: No parameter needed

        // Display the tree using Inorder Traversal
        System.out.println("\nInorder Traversal:");
        tree.InOrderTraverse(root);
    }
}
