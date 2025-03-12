package march11;

import java.util.Scanner;

public class FindKthLargestInBst {
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

    FindKthLargestInBst() {
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

    static int count = 0;
    static int res = -1;

    public  int kthLargest(Node root, int k) {
        count = 0;
        res = -1;
        reverseInorder(root, k);
        return res;
    }

    static void reverseInorder(Node node, int k) {
        if (node == null || count >= k) {
            return;
        }
        reverseInorder(node.right, k);

        count++;
        if (count == k) {
            res = node.data;
            return;
        }

        reverseInorder(node.left, k);
    }


    public static void main(String[] args) {
        FindKthLargestInBst tree=new FindKthLargestInBst();
        tree.BuildTree();
        tree.kthLargest(tree.root,3);
    }
}
