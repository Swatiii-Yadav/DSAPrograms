package february22;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LowestCommonAncestorOFBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        while (root != null) {
            if (p.data < root.data && q.data < root.data) {
                root = root.left;
            } else if (p.data > root.data && q.data > root.data) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
    public Node findNode(Node root, int val) {
        if (root == null || root.data == val) {
            return root;
        }

        if (val < root.data) {
            return findNode(root.left, val);
        } else {
            return findNode(root.right, val);
        }
    }


    public static void main(String[] args) {


        LowestCommonAncestorOFBST tree = new LowestCommonAncestorOFBST();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter BST elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Enter first node value (p): ");
        int pVal = sc.nextInt();
        System.out.println("Enter second node value (q): ");
        int qVal = sc.nextInt();


        Node p = tree.findNode(tree.root, pVal);
        Node q = tree.findNode(tree.root, qVal);

        if (p == null || q == null) {
            System.out.println("Not found");
        } else {
            Node res = tree.lowestCommonAncestor(tree.root, p, q);
            System.out.println("Lowest Common Ancestor: " + (res != null ? res.data : "Not found"));
        }


    }
}
