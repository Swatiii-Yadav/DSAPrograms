package february25;

import java.util.Scanner;

public class SumLeafToRootNumbers {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;
    private Scanner sc;


    public SumLeafToRootNumbers() {
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

        System.out.println("Going to the left of " + treeNode.data);
        treeNode.left = BuildTree();

        System.out.println("Going to the right of " + treeNode.data);
        treeNode.right = BuildTree();

        return treeNode;
    }


    public int sumNumbers(Node root) {
        return dfs(root, 0,1);
    }

    private int dfs(Node node, int currentSum, int rev) {
        if (node == null) {
            return 0;
        }


        currentSum = node.data * rev + currentSum;

        if (node.left == null && node.right == null) {
            return currentSum;
        }

      int   leftsum= dfs(node.left, currentSum, rev * 10) ;
        int rightSum=dfs(node.right, currentSum, rev * 10);
        return leftsum+rightSum;
    }


    public static void main(String[] args) {
        SumLeafToRootNumbers tree = new SumLeafToRootNumbers();
        tree.root = tree.BuildTree();
        System.out.println("Sum of leaf to root numbers: " + tree.sumNumbers(tree.root));
    }
}
