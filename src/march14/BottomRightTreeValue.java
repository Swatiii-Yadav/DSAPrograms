package march14;


import java.util.LinkedList;
import java.util.Queue;

public class BottomRightTreeValue {
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    Node root;
    public int findRight(Node root) {
        if (root == null) return -1;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int right = root.data;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                right = node.data;

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return right;
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.left.left = new Node(8);
        root.left.left.left = new Node(4);
        root.left.left.right = new Node(14);
        root.right = new Node(3);
BottomRightTreeValue tree=new BottomRightTreeValue();
        System.out.println("Bottom right Value: " + tree.findRight(root));
    }
}


