package march14;

public class LCAofDeepestLeaves {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }
    static int findDepth(Node node) {
        if (node == null) return 0;
        return Math.max(findDepth(node.left), findDepth(node.right)) + 1;
    }


    Node lca;

    Node deepestNode(Node root) {
        int maxDepth = findDepth(root);
        findLCA(root, 0, maxDepth);
        return lca;
    }


    private int findLCA(Node node, int depth, int maxDepth) {
        if (node == null) return depth;

        int leftDepth = findLCA(node.left, depth + 1, maxDepth);
        int rightDepth = findLCA(node.right, depth + 1, maxDepth);


        if (leftDepth == maxDepth && rightDepth == maxDepth) {
            lca = node;
        }

        int max = Math.max(leftDepth, rightDepth);
        return max;
    }

    public static void main(String[] args) {
        LCAofDeepestLeaves tree = new LCAofDeepestLeaves();

        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);


        Node result = tree.deepestNode(root);
        System.out.println(result.data);
    }


}
