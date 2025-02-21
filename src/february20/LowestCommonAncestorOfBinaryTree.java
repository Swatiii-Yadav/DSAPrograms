package february20;

import java.util.Scanner;
public class LowestCommonAncestorOfBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node findLCA(Node root, Node p, Node q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        Node leftLCA = findLCA(root.left, p, q);
        Node rightLCA = findLCA(root.right, p, q);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        if (leftLCA != null) {
            return leftLCA;
        }

       return rightLCA;
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(35);
        root.right = new Node(71);
        root.left.left = new Node(96);
        root.left.right = new Node(12);
        root.right.left = new Node(90);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        Node p = root.left.left;
        Node q = root.left.right;

        Node result = findLCA(root, p, q);
        if (result != null) {
            System.out.println(result.data);
        } else {
            System.out.println("null");
        }
    }
}
