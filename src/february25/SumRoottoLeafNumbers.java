package february25;

import java.util.Scanner;

public class SumRoottoLeafNumbers {

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

    SumRoottoLeafNumbers() {
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
        return dfs(root, 0);
    }

     int dfs(Node node, int currentSum) {
        if (node == null){
            return 0;
        }

        currentSum = currentSum * 10 + node.data;


        if (node.left == null && node.right == null)
            return currentSum;


        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
    }

    public static void main(String[] args) {
        SumRoottoLeafNumbers tree=new SumRoottoLeafNumbers();
       tree.root= tree.BuildTree();
        int res=tree.sumNumbers(tree.root);
        System.out.println("sum from root to leaf number "+res);
    }
}
