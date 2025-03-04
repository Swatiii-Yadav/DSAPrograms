package march4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumDepthOfN_aryTree {
    static class Node {
        int val;
        List<Node> children;

        Node(int val) {
            this.val = val;
            children = new ArrayList<>();
        }

    }

    static Node root;

    public int maxDepth(Node root) {
        if (root == null) return 0;

        int maxChildDepth = 0;
        for (Node child : root.children) {
            maxChildDepth = Math.max(maxChildDepth, maxDepth(child));
        }

        return maxChildDepth + 1;
    }


    public static void main(String[] args) {

        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);


        root.children.add(node3);
        root.children.add(node2);
        root.children.add(node4);
        node3.children.add(node5);
        node3.children.add(node6);
        MaximumDepthOfN_aryTree tree = new MaximumDepthOfN_aryTree();
        System.out.println("Maax depth of given tree "+tree.maxDepth(root));
    }
}
