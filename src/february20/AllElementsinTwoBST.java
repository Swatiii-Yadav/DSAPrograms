package february20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllElementsinTwoBST {
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

    AllElementsinTwoBST() {
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

    private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> res = new ArrayList<>();
        int l1 = 0, l2 = 0;

        while (l1 < list1.size() && l2 < list2.size()) {
            if (list1.get(l1) < list2.get(l2)) {
                res.add(list1.get(l1++));
            } else {
                res.add(list2.get(l2++));
            }
        }

        while (l1 < list1.size()) {
            res.add(list1.get(l1++));
        }
        while (l2 < list2.size()) {
            res.add(list2.get(l2++));
        }

        return res;
    }

    public List<Integer> getAllElements(Node root1, Node root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        inorderTraversal(root1, list1);
        inorderTraversal(root2, list2);

        return merge(list1, list2);
    }

    static void inorderTraversal(Node root, List<Integer> list) {
        if (root == null) return;
        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
    }

    public static void main(String[] args) {
        AllElementsinTwoBST tree1 = new AllElementsinTwoBST();
        AllElementsinTwoBST tree2 = new AllElementsinTwoBST();

        System.out.println("first BST:");
        Node root1 = tree1.BuildTree();

        System.out.println("second BST:");
        Node root2 = tree2.BuildTree();

        List<Integer> merged = tree1.getAllElements(root1, root2);

        System.out.println("Merged Sorted Elements: " + merged);

    }
}
