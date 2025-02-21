package february20;

import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class KthSmallestElementInBST {
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


    public int kthSmallest(Node root, int k) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        int count = 0;

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;

            if (count == k) return current.data;

            current = current.right;
        }
        return -1;
    }

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        KthSmallestElementInBST bst = new KthSmallestElementInBST();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter BST elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            bst.root = bst.insert(bst.root, val);
        }

        System.out.println("Inorder Traversal of BST:");
        bst.inorder(bst.root);
        System.out.println();

        System.out.println("Enter K value:");
        int k = sc.nextInt();

        int result = bst.kthSmallest(bst.root, k);
        if (result != -1) {
            System.out.println("kth smallest  " + result);
        } else {
            System.out.println("not found");
        }
    }
}
