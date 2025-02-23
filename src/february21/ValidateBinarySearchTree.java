package february21;

import java.util.Scanner;
import java.util.Stack;

public class ValidateBinarySearchTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;

        }
    }

    Node root;

    public Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public boolean isValidBST(Node root) {
        Stack<Node> stack = new Stack<>();
        Node temp = null;

        while (root != null || !stack.isEmpty()) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (temp != null && root.data <= temp.data) {
                return false;
            }
            temp = root;
            root = root.right;
        }
        return true;
    }

    public static void main(String[] args) {

        ValidateBinarySearchTree tree = new ValidateBinarySearchTree();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter BST elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.root = tree.insert(tree.root, val);
        }


        System.out.println("is this valid subtree ? "+tree.isValidBST(tree.root));

    }
}
