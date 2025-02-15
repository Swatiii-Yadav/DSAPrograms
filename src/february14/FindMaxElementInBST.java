package february14;

import java.util.Scanner;

public class FindMaxElementInBST {

    class Node {
        int data;
        Node left;
        Node right;
        int height;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 0;
        }

        public int getValue() {
            return data;
        }

    }

    public int treeHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    Scanner sc = new Scanner(System.in);

    Node BuildTree(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = BuildTree(node.left, data);
        } else if (data > node.data) {
            node.right = BuildTree(node.right, data);
        }

        node.height = Math.max(treeHeight(node.left), treeHeight(node.right)) + 1;

        return node;
    }
    public void insert(int data) {
        root = BuildTree(root, data);
    }


    static Node root;

    public int findMax(Node root) {
        if (root == null) {
            System.out.println("tree is empty");
            return -1;
        }
        Node curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.data;
    }

    public static void main(String[] args) {
        FindMaxElementInBST bst=new FindMaxElementInBST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(15);
        bst.insert(60);
        bst.insert(75);
        bst.insert(90);
        bst.insert(100);
        System.out.println("Min element in tree ->"+bst.findMax(root));
    }

}
