package march11;

import java.util.Scanner;

public class FindKthSmallestInBt {
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

    FindKthSmallestInBt() {
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

    public  int kthSmallest(Node root, int k) {
        count = 0;
        res = -1;
        inorder(root, k);
        return res;
    }

     static void inorder(Node node, int k) {
        if (node == null || count >= k) {
            return;
        }
        inorder(node.left, k);

        count++;
        if (count == k) {
            res = node.data;
            return;
        }

        inorder(node.right, k);
    }


public static void main(String[] args) {
FindKthSmallestInBt tree=new FindKthSmallestInBt();
tree.BuildTree();
tree.kthSmallest(tree.root,3);
}
}
