package february17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindMaxEleInBT {
   static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

   static Node root;
    Scanner sc;

    FindMaxEleInBT() {
        root = null;
        sc = new Scanner(System.in);
    }

    Node insert() {
        System.out.println("Do you want to insert values");
        int val = sc.nextInt();
        if (val == -1) {
            return null;
        }
        Node node = new Node(val);
        System.out.println("left side of the " + node.data);
        node.left = insert();
        System.out.println("right side if the " + node.data);
        node.right = insert();

        return node;
    }

    int findMax(Node node){
        if (root == null){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            max = Math.max(max, current.data);
            if (current.left != null){
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        FindMaxEleInBT tree=new FindMaxEleInBT();
        root=new Node(1);
        root.left=new Node(3);
        root.left.left=new Node(3);
        root.left.right=new Node(3);
        root.right=new Node(3);
        root.right.left=new Node(8);
        root.right.right=new Node(31);
        int max=tree.findMax(root);
        System.out.println("MAx element in tree: "+max);

    }
}
