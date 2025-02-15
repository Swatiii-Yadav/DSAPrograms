package february14;

import java.util.Scanner;

class SearchBSTSubtree {
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

    Node BuildTree(Node node, int data) {
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

    public void insert(int data) {
        root = BuildTree(root, data);
    }

    static Node root;


    public Node search(Node root, int target) {
        if (root == null || root.data == target) {
            return root;
        }

        if (target < root.data) {
            return search(root.left, target);
        } else {
            return search(root.right, target);
        }

    }

    public static void printTree(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        printTree(node.left);
        printTree(node.right);
    }

    public static void main(String[] args) {
        SearchBSTSubtree bst = new SearchBSTSubtree();
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        int target = 60;
        Node subtree = bst.search(root,target);
        System.out.println("output:");
        printTree(subtree);
    }
}

