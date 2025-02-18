package february18;

import java.util.Scanner;

public class PathSumInBT {
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
    Scanner sc;
    PathSumInBT(){
        root=null;
        sc = new Scanner(System.in);
    }

    public Node BuildTree() {
        System.out.println("Enter value for node (-1 for no node):");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }

        Node treeNode = new Node(data);

        // Left child
        System.out.println("Enter left child of " + treeNode.data + " (-1 for no node):");
        treeNode.left = BuildTree();

        // Right child
        System.out.println("Enter right child of " + treeNode.data + " (-1 for no node):");
        treeNode.right = BuildTree();

        return treeNode;
    }

    public boolean   findSum(Node root,int target ) {
        if(root==null){
            return false;
        }

        target -= root.data;
       if (root.left==null&& root.right==null){
           return target==0;
       }
        boolean leftCheck = findSum(root.left, target);
        boolean rightCheck = findSum(root.right, target);

        return leftCheck||rightCheck;
    }

public boolean checkTarget(int target){
        return findSum(root,target);
}
    public static void main(String[] args) {
        PathSumInBT tree = new PathSumInBT();
       tree.root=tree.BuildTree();
        int target = 9;
        boolean  check = tree.checkTarget(target);
        if (check) {
            System.out.println("target found");
        }
        else{
            System.out.println("target not found");
        }
    }
}
