package february18;

import java.util.Stack;

public class SumOfLeftLeaves
{ static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
    static Node root;
    public int SumOFNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        Node curr = root;
        Stack<Node> stack = new Stack<>();
        stack.push(curr);

        while (!stack.isEmpty()) {
            curr= stack.pop();
            if (curr.left != null) {
                if (curr.left.left == null && curr.left.right == null) {
                    sum += curr.left.data;
                } else {
                    stack.push(curr.left);
                }
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        SumOfLeftLeaves tree=new SumOfLeftLeaves();
        root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right .right= new Node(7);
        int sum= tree.SumOFNodes(root);
        System.out.println("Total sum  of left leaf  nodes in  binary tree : "+sum);
    }

}
