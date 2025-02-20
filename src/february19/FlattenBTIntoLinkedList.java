package february19;

import february12.BinaryTree2;

import java.util.Scanner;

public class FlattenBTIntoLinkedList {
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

    FlattenBTIntoLinkedList() {
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

    public void flatten(Node root) {
        Node curr = root;

        while (curr != null) {
            if (curr.left != null) {
                Node temp = curr.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

    public void printList(Node root) {
        while (root != null) {
            System.out.print(root.data + " -> ");
            root = root.right;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        FlattenBTIntoLinkedList tree = new FlattenBTIntoLinkedList();
        tree.BuildTree();
        tree.flatten(tree.root);
        tree.printList(tree.root);

    }
}
