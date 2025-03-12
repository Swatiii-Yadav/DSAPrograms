package march12;


import java.util.Stack;

public class BstFromPreorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

   static Node root;

    BstFromPreorder() {
        root = null;
    }

        public  Node PreOrder(int[] preorder) {
            if (preorder.length == 0) return null;

            Node root = new Node(preorder[0]);
            Stack<Node> stack = new Stack<>();
            stack.push(root);

            for (int i = 1; i < preorder.length; i++) {
                Node node = new Node(preorder[i]);
                Node parent = stack.peek();


                if (preorder[i] < parent.data) {
                    parent.left = node;
                } else {

                    while (!stack.isEmpty() && stack.peek().data < preorder[i]) {
                        parent = stack.pop();
                    }
                    parent.right = node;
                }

                stack.push(node);
            }

            return root;
        }
    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void main(String[] args) {
        BstFromPreorder tree = new BstFromPreorder();
        int[] preorder = {2, 4, 3, 8, 7, 5};
        Node root = tree.PreOrder(preorder);

        System.out.println("Inorder Traversal of Constructed BST:");
       tree.inorder(root);
    }
    }


