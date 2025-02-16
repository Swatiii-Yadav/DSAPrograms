package february16;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindSuccesorInBT {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

     static Node root;

    Node bfsTraversal(int key) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
            if (curr.data==key){
                return  queue.peek();
            }

        }
       return null;

    }
    public static void main(String[] args) {
        FindSuccesorInBT bst=new FindSuccesorInBT();
        root =new Node(11);
        root.left=new Node(82);
        root.left.left=new Node(64);
        root.left.right=new Node(95);
        root.right=new Node(33);
        root.right.left=new Node(67);
        root.right.right=new Node(71);
       Node res=bst.bfsTraversal(33);
       if (res!=null){
           System.out.println(res.data);
       }
       else {
           System.out.println("Not found");
       }



    }
}
