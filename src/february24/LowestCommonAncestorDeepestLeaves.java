package february24;

import java.util.Scanner;

public class LowestCommonAncestorDeepestLeaves {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;
    Scanner sc;

    LowestCommonAncestorDeepestLeaves() {
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

    public static int getDepth(Node root) {
        if (root == null) {
            return 0;
        }
        return  + Math.max(getDepth(root.left), getDepth(root.right))+1;
    }

    public static Node findLCA(Node root, int maxDepth, int currentDepth) {
        if (root == null) {
            return null;
        }

        if (currentDepth == maxDepth) {
            return root;
        }

        Node leftLCA = findLCA(root.left, maxDepth, currentDepth + 1);
        Node rightLCA = findLCA(root.right, maxDepth, currentDepth + 1);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static Node findDeepLCA(Node root) {
        int maxDepth = getDepth(root);
        return findLCA(root, maxDepth, 1);
    }

    public static void main(String[] args) {
        LowestCommonAncestorDeepestLeaves tree = new LowestCommonAncestorDeepestLeaves();
        tree.root = tree.BuildTree();

//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//        tree.root.right.right = new Node(6);
//        tree.root.left.left.left = new Node(7);
//        tree.root.left.left.right = new Node(8);

        Node res = findDeepLCA(tree.root);
        if (res != null) {
            System.out.println(" " + res.data);
        } else {
            System.out.println("result not found");
        }
    }
}
