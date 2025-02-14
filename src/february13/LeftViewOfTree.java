package february13;

import java.util.Scanner;

public class LeftViewOfTree {
    class Node {
        int data;
        Node left;
        Node right;
        int height;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    static Node root;

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


    int maxLevelLeft = -1;

    // Function to print the Left View of the binary tree
    public void leftsideView(Node root) {
        System.out.print("Left View Traversal: ");
        printLeftView(root, 0);
        System.out.println();
    }

    private void printLeftView(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level > maxLevelLeft) {
            System.out.print(root.data + " ");
            maxLevelLeft = level;
        }

        printLeftView(root.left, level + 1);
    }

    public static void main(String[] args) {
        LeftViewOfTree tree = new LeftViewOfTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.leftsideView(root);
    }
}

