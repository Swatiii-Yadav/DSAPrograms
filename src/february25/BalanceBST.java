package february25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalanceBST {

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

    BalanceBST() {
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

    public Node balanceBST(Node root) {

        List<Integer> list = new ArrayList<>();
        inOrderTraversal(root, list);
        return balance(list, 0, list.size() - 1);
    }

     Node balance(List<Integer> values, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        Node root = new Node(values.get(mid));

        root.left = balance(values, left, mid - 1);
        root.right = balance(values, mid + 1, right);

        return root;
    }

    void inOrderTraversal(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, list);
        list.add(root.data);
        inOrderTraversal(root.right, list);

    }
    private void inOrderPrint(Node root) {
        if (root == null) return;
        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);
    }

    public static void main(String[] args) {
        BalanceBST tree = new BalanceBST();
        tree.BuildTree();

       tree.root= tree.balanceBST(tree.root);
        tree.inOrderPrint(tree.root);

    }
}
