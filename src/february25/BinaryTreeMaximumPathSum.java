package february25;

import java.util.Scanner;

public class BinaryTreeMaximumPathSum {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    Node root;
    Scanner sc;

    BinaryTreeMaximumPathSum() {
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
         int maxSum = Integer.MIN_VALUE;

        public int maxPathSum(Node root) {
            dfs(root);
            return maxSum;
        }

        private int dfs(Node node) {
            if (node == null) {
                return 0;
            }
            int leftMax = Math.max(dfs(node.left), 0);
            int rightMax = Math.max(dfs(node.right), 0);

            int newPathSum = node.data + leftMax + rightMax;
            maxSum = Math.max(maxSum, newPathSum);
            int res= node.data + Math.max(leftMax, rightMax);
            return res;
        }

    public static void main(String[] args) {
        BinaryTreeMaximumPathSum tree=new BinaryTreeMaximumPathSum();
        tree.BuildTree();
        int max= tree.maxPathSum(tree.root);
        System.out.println("Max sum:" +max);
    }

}
