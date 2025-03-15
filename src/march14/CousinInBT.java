package march14;

import java.util.LinkedList;
import java.util.Queue;

public class CousinInBT {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
     static Node root;
    
        public boolean isCousins(Node root, int left, int right) {
            if (root == null){
                return false;
            }

            Queue<Node> queue = new LinkedList<>();
            Queue<Node> res = new LinkedList<>();

            queue.add(root);
            res.add(null); 

            while (!queue.isEmpty()) {
                int size = queue.size();
                Node leftParent = null, rightParent = null;

                for (int i = 0; i < size; i++) {
                    Node node = queue.poll();
                    Node parent = res.poll();

                    if (node.data == left){
                        leftParent = parent;
                    }
                    if (node.data == right) {
                        rightParent = parent;
                    }

                    if (node.left != null) {
                        queue.add(node.left);
                        res.add(node);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                        res.add(node);
                    }
                }

              
                if (leftParent != null && rightParent != null) {
                    return leftParent != rightParent; 
                }
                
                if (leftParent != null || rightParent != null) {
                    return false;
                }
            }

            return false;
        }

        public static void main(String[] args) {
            CousinInBT tree = new CousinInBT();

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.right.left = new Node(5);
            root.right.right = new Node(6);

            System.out.println(tree.isCousins(root, 4, 5));  
        
        }
    }


