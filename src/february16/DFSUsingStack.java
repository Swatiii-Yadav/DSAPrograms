package february16;

import java.util.Stack;

public class DFSUsingStack {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    Node root;

    void DfsPreOrderTraversal() {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " -> ");
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
        System.out.print("Null");
    }



    public static void main(String[] args) {
        DFSUsingStack dfs = new DFSUsingStack();
        dfs.root = new Node(1);
        dfs.root.left = new Node(2);
        dfs.root.left.left = new Node(4);
        dfs.root.left.right = new Node(5);
        dfs.root.right = new Node(3);
        dfs.root.right.left = new Node(6);
        dfs.root.right.right = new Node(7);
        dfs.DfsPreOrderTraversal();

    }
}
