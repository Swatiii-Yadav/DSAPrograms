package february20;

import java.util.*;
import java.util.*;

public class RightSideViewOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public Node BuildTree(Scanner sc) {
        System.out.println("Enter value for node (-1 for no node):");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node treeNode = new Node(data);

        System.out.println("Going to the left of " + treeNode.data);
        treeNode.left = BuildTree(sc);

        System.out.println("Going to the right of " + treeNode.data);
        treeNode.right = BuildTree(sc);

        return treeNode;
    }


    public List<Integer> rightSideView(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

                if (i == size - 1) {
                    result.add(node.data);
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RightSideViewOfTree tree = new RightSideViewOfTree();
        Scanner sc = new Scanner(System.in);

        tree.root = tree.BuildTree(sc);

        List<Integer> result = tree.rightSideView(tree.root);
        System.out.println("Right Side View: " + result);


    }
}
