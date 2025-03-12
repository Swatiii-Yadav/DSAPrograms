package march12;

import java.util.LinkedList;
import java.util.Queue;

public class BottomLeftTreeValue {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    BottomLeftTreeValue() {
        root = null;
    }
    public static int findLeft(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int left = root.data;

        while (!queue.isEmpty()) {
            int size = queue.size();
            left = queue.peek().data;

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node.left != null)
                {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.left.left = new Node(8);
        root.left.left.left = new Node(4);
        root.right = new Node(3);

        System.out.println("Bottom Left Value: " + findLeft(root));
    }
}
