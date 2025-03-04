package march4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class N_aryTreePreOrderTraversal {
    static class Node {
        int val;
        List<Node> children;

        Node(int val) {
            this.val = val;
            children = new ArrayList<>();
        }

    }

    static Node root;

    public List<Integer> preOrder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            list.add(curr.val);
            if (curr.children != null) {
                for (int i = curr.children.size() - 1; i >= 0; i--) {
                    stack.push(curr.children.get(i));
                }
            }


        }
        return list;
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
        N_aryTreePreOrderTraversal tree = new N_aryTreePreOrderTraversal();
        List<Integer> list = tree.preOrder(root);
        System.out.println(list);
    }
}
