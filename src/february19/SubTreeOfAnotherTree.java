package february19;

import java.util.Scanner;

public class SubTreeOfAnotherTree {
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

    public static boolean checkSubTree(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        boolean leftSubtree = checkSubTree(root.left, subRoot.left);
        boolean rightSubtree = checkSubTree(root.right, subRoot.right);

        return (root.data == subRoot.data) && (leftSubtree && rightSubtree);

    }

    public boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (checkSubTree(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);

        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);
        SubTreeOfAnotherTree tree = new SubTreeOfAnotherTree();
        boolean res=tree.isSubtree(root, subRoot);
        System.out.println(res);
    }
}
