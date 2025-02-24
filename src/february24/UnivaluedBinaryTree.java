package february24;


import java.util.*;

public class UnivaluedBinaryTree {

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

    UnivaluedBinaryTree() {
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


        public boolean isUnivalTree (Node root){
            if (root == null) return true;

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            int value = root.data;

            while (!queue.isEmpty()) {
                Node node = queue.poll();
                if (node.data != value) return false;

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

        return true;
    }

    public static void main(String[] args) {
        UnivaluedBinaryTree tree = new UnivaluedBinaryTree();
        tree.BuildTree();
        boolean res=tree.isUnivalTree(tree.root);
        System.out.println("univalue BT ?? "+res);

    }
}
