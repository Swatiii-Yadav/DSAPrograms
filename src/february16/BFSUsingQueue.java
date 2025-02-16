package february16;
import java.util.LinkedList;
import java.util.Queue;

public class BFSUsingQueue {


    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

     Node root;

     void bfsTraversal() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data+" -> ");

            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }

        }
         System.out.println("Null");

    }
    public static void main(String[] args) {
        BFSUsingQueue bfs=new BFSUsingQueue();
         bfs.root =new Node(1);
       bfs.root.left=new Node(2);
        bfs.root.left.left=new Node(4);
       bfs. root.left.right=new Node(5);
      bfs.  root.right=new Node(3);
        bfs.root.right.left=new Node(6);
       bfs. root.right.right=new Node(7);
        bfs.bfsTraversal();
    }
}
