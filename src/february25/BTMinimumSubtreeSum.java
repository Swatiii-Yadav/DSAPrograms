package february25;

import java.util.Scanner;

public class BTMinimumSubtreeSum {
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

    BTMinimumSubtreeSum() {
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


    int minSubtree = Integer.MAX_VALUE;

    public int minPathSum(Node root) {
        calculateSubTReeSum(root);
        return minSubtree;
    }

    private int calculateSubTReeSum(Node node) {
        if (node == null) {
            return 0;
        }

        int leftSum = calculateSubTReeSum(node.left);
        int rightSum = calculateSubTReeSum(node.right);

        int currentSubtree = node. data+ leftSum + rightSum;

        minSubtree = Math.min(minSubtree, currentSubtree);


        return minSubtree;
    }

    public static void main(String[] args) {
        BTMinimumSubtreeSum tree=new BTMinimumSubtreeSum();
        tree.root=tree.BuildTree();

       int res= tree.minPathSum(tree.root);
        System.out.println("min subtree sum: "+res);
    }

}
