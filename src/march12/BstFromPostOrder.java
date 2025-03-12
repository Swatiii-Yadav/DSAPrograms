package march12;

import java.util.Stack;

public class BstFromPostOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    BstFromPostOrder() {
        root = null;
    }

    int index;

    public Node buildBSTFromPostorder(int[] postorder) {
        index = postorder.length - 1;
        return construct(postorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private Node construct(int[] postorder, int min, int max) {
        if (index < 0) return null;
        int val = postorder[index];

        if (val < min || val > max) return null;

        index--;

        Node root = new Node(val);

        root.right = construct(postorder, val, max);
        root.left = construct(postorder, min, val);

        return root;
    }

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void main(String[] args) {

        BstFromPostOrder solution = new BstFromPostOrder();
        int[] postorder = {2, 4, 3, 8, 7, 5};
        Node root = solution.buildBSTFromPostorder(postorder);

        System.out.println("Inorder Traversal of Constructed BST:");
        solution.inorder(root);
    }
}
