package march4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pathSumIII {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
    static Node root;
    Scanner sc;
    pathSumIII(){
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


        System.out.println("Enter left child of " + treeNode.data );
        treeNode.left = BuildTree();


        System.out.println("Enter right child of " + treeNode.data );
        treeNode.right = BuildTree();

        return treeNode;
    }

    public void   findSum(Node node, int target , List<Integer> pathlist, List<List<Integer>>res) {
        if(root==null){
            return;
        }
        if (node == null) return;

        pathlist.add(node.data);
        target -= node.data;

        if (node.left == null && node.right == null && target == 0) {
            res.add(new ArrayList<>(pathlist));
        } else {
            findSum(node.left, target, pathlist, res);
            findSum(node.right, target, pathlist, res);
        }

        pathlist.removeLast();

    }
    public List<List<Integer>> paths(Node root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findSum(root, targetSum, new ArrayList<>(), result);
        return result;
    }


    public static void main(String[] args) {
        pathSumIII tree = new pathSumIII();
        root=tree.BuildTree();
        int target = 22;
        List<List<Integer>>  result = tree.paths(root,target);
        System.out.println(result.size());
    }
}
