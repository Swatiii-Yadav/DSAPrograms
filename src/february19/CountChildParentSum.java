package february19;

import february18.PathSumInBT;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CountChildParentSum {
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

    CountChildParentSum() {
        root = null;
        sc = new Scanner(System.in);
    }

    public Node BuildTree() {
        System.out.println("Enter value for node (-1 for no node):");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }

        Node treeNode = new Node(data);
        System.out.println("Enter left child of " + treeNode.data + " (-1 for no node):");
        treeNode.left = BuildTree();

        System.out.println("Enter right child of " + treeNode.data + " (-1 for no node):");
        treeNode.right = BuildTree();

        return treeNode;
    }

    int count = 0;

    int countNodes(Node node) {
        List<Integer> list = new LinkedList<>();


        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.data;
        }
        int leftSum = countNodes(root.left);
        int rightSum = countNodes(root.right);
        if (root.data == leftSum + rightSum) {
            list.add(root.data);
            count++;
        }

        return root.data;
    }

    public static void main(String[] args) {


        CountChildParentSum tree = new CountChildParentSum();
        tree.BuildTree();
        System.out.println("Nodes where parent value is equal to child sum: " + tree.count);
        System.out.println("Matching Parent Nodes: " + tree.countNodes(tree.root));

    }
}

