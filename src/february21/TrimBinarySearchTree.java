package february21;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrimBinarySearchTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
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

    public  Node trimBST(Node root, int low, int high) {
        if (root == null){
            return null;
        }

        if (root.data < low) {
            return trimBST(root.right, low, high);
        }

        if (root.data > high) {
            return trimBST(root.left, low, high);
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
    public  void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TrimBinarySearchTree tree=new TrimBinarySearchTree();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of node you want to insert");
        int n = sc.nextInt();
        System.out.println("Enter BST elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.root = tree.insert(tree.root, val);
        }
        System.out.println("enter low ");
        int low=sc.nextInt();
        System.out.println("enter high ");
        int high=sc.nextInt();
        System.out.println("original bst");
        tree.inorder(tree.root);
        tree.trimBST(tree.root, low,high);
        System.out.println("after trim");
        tree.inorder(tree.root);

    }
}
