package february18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InvertBinaryTree {
    class Node {
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

    InvertBinaryTree() {
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

    void invert() {
        if (root == null) {
            return ;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();


            Node temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            if (curr.right != null) {
                queue.add(curr.right);
            }
            if (curr.left != null) {
                queue.add(curr.left);
            }

        }

    }
    void display(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " -> ");
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        InvertBinaryTree tree = new InvertBinaryTree();
        tree.root = tree.BuildTree();
        tree.invert();
        tree.display(tree.root);
    }
}
