package march4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinimumDistanceBetweenBSTNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data=data;
        }

    }
    public int minDiffInBST(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        Integer prev = null;
        int minDiff = Integer.MAX_VALUE;

        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            if (prev != null) {
                minDiff = Math.min(minDiff, curr.data - prev);
            }
            prev = curr.data;

            curr = curr.right;
        }
        return minDiff;
    }

}
