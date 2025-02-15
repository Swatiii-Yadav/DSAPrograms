package february14;

import java.util.Stack;

public class CheckIfTreeisBSTorBT {
   static class Node {
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
    }
    static Node root;
    public boolean isBST(Node root) {
        if (root == null) {
            return true;
        }

        Stack<Node> stack = new Stack<>();
        Node curr = root;
        Integer  prev = null;

        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (prev != null && curr.data <= prev) {
                return false;
            }
            prev = curr.data;
            curr = curr.right;
        }
        return true;
    }

    public static void main(String[] args) {
        Node root =new Node(30);
        root.left=new Node(57);
        root.left.left=new Node(80);
        root.left.right=new Node(90);
        root.right=new Node(67);
        root.right.left=new Node(55);
        root.right.right=new Node(120);
        CheckIfTreeisBSTorBT tree=new CheckIfTreeisBSTorBT();

        if (tree.isBST(root)){
        System.out.println(" tree is  binary search tree");
        }else{
            System.out.println("tree is binary tree");
        }

    }
}
