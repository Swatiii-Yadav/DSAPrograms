package march19;

import java.util.Scanner;
import java.util.Stack;

public class SecondMaxNodeInBT {

        static class Node {
            int data;
            Node left, right;

            Node(int data) {
                this.data = data;
                left = right = null;
            }
        }

        static Node root;

        SecondMaxNodeInBT() {
            root = null;

        }


        public int findSecondMaximumValue(Node root) {
            if (root == null) return -1;

            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            boolean found = false;

            Stack<Node> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                Node curr = stack.pop();

                if (curr.data > firstMax) {
                    secondMax = firstMax;
                    firstMax = curr.data;
                    found = true;
                } else if (curr.data < firstMax && curr.data > secondMax) {
                    secondMax = curr.data;
                    found = true;
                }


                if (curr.right != null){
                    stack.push(curr.right);}
                if (curr.left != null)
                {
                    stack.push(curr.left);}
            }

            if (found){

               return secondMax;}
            return  -1;
        }

        public static void main(String[] args) {
            SecondMaxNodeInBT tree = new SecondMaxNodeInBT();

            Node root = new Node(20);
            root.left = new Node(15);
            root.right = new Node(30);
            root.left.left = new Node(10);
            root.left.right = new Node(18);
            root.right.left = new Node(25);
            root.right.right = new Node(40);
            root.right.right.left = new Node(35);
            root.right.right.right = new Node(50);

            int secondMax = tree.findSecondMaximumValue(root);
            System.out.println("Second largest value in BT: " + secondMax);
        }
    }


