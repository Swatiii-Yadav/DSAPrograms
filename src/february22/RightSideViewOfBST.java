package february22;



import february21.RangeSumofBST;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RightSideViewOfBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
    Node root;
    public Node insert(Node root, int data) {
        if (root == null){
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
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
        RightSideViewOfBST tree=new RightSideViewOfBST();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter BST elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.root = tree.insert(tree.root, val);
        }
        System.out.println("Inorder Traversal: " + tree.inorderTraversal(tree.root));

    }
}
