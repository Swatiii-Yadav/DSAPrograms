package february24;

import java.util.Scanner;
import java.util.Stack;

public class IncreasingOrderSearchList {
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

    IncreasingOrderSearchList() {
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
    public Node increasingBST(Node root) {
        if (root == null) return null;

        Stack<Node> stack = new Stack<>();
        Node curr = root;
        Node dummy = new Node(-1);
        Node prev = dummy;

        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            prev.right = curr;
            prev = curr;
            curr.left = null;

            curr = curr.right;
        }

        return dummy.right;
    }
    public void printTree(Node root) {
        Node curr = root;
        while (curr != null) {
            System.out.print(curr.data + " ---> ");
            curr = curr.right;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        IncreasingOrderSearchList tree = new IncreasingOrderSearchList();
        tree.root = tree.BuildTree();
        tree.root = tree.increasingBST(tree.root);
        tree.printTree(tree.root);
    }


}
