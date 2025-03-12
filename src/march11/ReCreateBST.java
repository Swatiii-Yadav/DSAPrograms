package march11;

import february21.RecoverBinarySearchTree;

import java.util.Stack;

public class ReCreateBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    ReCreateBST(Node root) {
        this.root = root;
    }

    public void recoverBST(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        Node prev = null, first = null, second = null;

        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            if (prev != null && prev.data > curr.data) {
                if (first == null) {
                    first = prev;
                }
                second = curr;
            }

            prev = curr;
            curr = curr.right;
        }

        if (first != null && second != null) {
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }
    }

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(90);
        root.right = new Node(30);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        root.right.right = new Node(130);
        ReCreateBST tree = new ReCreateBST(root);
        System.out.println("BST before:");
        tree.inorder(tree.root);
        tree.recoverBST(tree.root);
        System.out.println(" after recovery BST :");
        tree.inorder(tree.root);

    }
}
