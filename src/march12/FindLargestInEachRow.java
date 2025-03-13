package march12;

import march11.FloorInBST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestInEachRow {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    FindLargestInEachRow() {
        root = null;
    }

    public static List<Integer> findLargest(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int maxVal = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                maxVal = Math.max(maxVal, node.data);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(maxVal);
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        System.out.println("Largest Values" + findLargest(root));
    }
}
