package february21;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RangeSumofBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;

        }
    }

    Node root;

    public Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public int rangeSumBST(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if (root.data >= low && root.data <= high) {
            sum += root.data;
        }

        if (root.data > low) {
            sum += rangeSumBST(root.left, low, high);
        }

        if (root.data < high) {
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;

    }

    public List<Integer> inorderTraversal(Node node) {
        List<Integer> res = new LinkedList<>();
        if (node == null) {
            return res;
        }
        res.addAll(inorderTraversal(node.left));
        res.add(node.data);
        res.addAll(inorderTraversal(node.right));

        return res;
    }

    public static void main(String[] args) {

        RangeSumofBST tree = new RangeSumofBST();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter BST elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.root = tree.insert(tree.root, val);
        }


        System.out.println("Inorder Traversal: " + tree.inorderTraversal(tree.root));
        System.out.println("Enter low :");
        int low=sc.nextInt();
        System.out.println("Enter high :");
        int high=sc.nextInt();
        System.out.println("Range Sum : " + tree.rangeSumBST(tree.root, low, high));
    }

}
