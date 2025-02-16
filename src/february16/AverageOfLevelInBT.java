package february16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelInBT {

   static   class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

   static Node root;


    public List<Double> levelOrder(Node root) {
        List<Double> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double avgLevel = 0;
            for (int i = 0; i < levelSize; i++) {
                Node curr = queue.poll();
                avgLevel +=curr.data;
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }

            }
            avgLevel=avgLevel/levelSize;
            list.add(avgLevel);

        }
        return list;
    }


public static void main(String[] args) {
    AverageOfLevelInBT bst=new AverageOfLevelInBT();
    root =new Node(1);
    root.left=new Node(2);
    root.left.left=new Node(4);
     root.left.right=new Node(5);
     root.right=new Node(3);
    root.right.left=new Node(6);
     root.right.right=new Node(7);
    List<Double> res=bst.levelOrder(root);
    System.out.println(res);
}
}
