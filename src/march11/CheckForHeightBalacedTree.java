package march11;

import java.util.Scanner;


public class CheckForHeightBalacedTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;
    Scanner sc;

    CheckForHeightBalacedTree() {
        root = null;
        sc = new Scanner(System.in);
    }

    Node BuildTree() {
        System.out.println("Enter value for node (-1 for no node):");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node treeNode = new Node(data);
        System.out.println("Enter left child of " + treeNode.data);
        treeNode.left = BuildTree();

        System.out.println("Enter Right child of " + treeNode.data);
        treeNode.right = BuildTree();
        return treeNode;
    }

    static int checkHeight(Node node) {
        if (node == null)
        {
            return 0;
        }
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1)
        {
            return -1;
        }

        int rightHeight = checkHeight(node.right);

        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

      boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    public static void main(String[] args) {
        CheckForHeightBalacedTree tree=new CheckForHeightBalacedTree();
        tree.BuildTree();
        tree.isBalanced(tree.root);

    }
}
