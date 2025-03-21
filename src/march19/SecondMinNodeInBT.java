package march19;


import java.util.Scanner;
import java.util.Stack;

public class SecondMinNodeInBT {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node root;
    Scanner sc;

    SecondMinNodeInBT() {
        root = null;
        sc = new Scanner(System.in);
    }

    Node BuildTree() {
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

    public int findSecondMinimumValue(Node root) {
        if (root == null) return -1;

        int firstMin = root.data;
        int secondMin = Integer.MAX_VALUE;
        boolean found = false;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();


            if (curr.data > firstMin && curr.data < secondMin) {
                secondMin = curr.data;
                found = true;
            }

            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }

        if (found) {
            return secondMin;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        SecondMinNodeInBT tree=new SecondMinNodeInBT();
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(5);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
       int min= tree.findSecondMinimumValue(root);
        System.out.println("Min smallest val in BT:- "+min);
    }
}
