package february22;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeepestLeavesSum {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
    Node root;
    Scanner sc;

    DeepestLeavesSum() {
        root = null;
        sc = new Scanner(System.in);
    }


    public Node BuildTree() {
        System.out.println("Enter value for node (-1 for no node):");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }

        Node treeNode = new Node(data);

        System.out.println("Going to the left of " + treeNode.data);
        treeNode.left = BuildTree();


        System.out.println("Going to the right of " + treeNode.data);
        treeNode.right = BuildTree();

        return treeNode;
    }



    public int deepestLeavesSum(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;

        while (!queue.isEmpty()) {
            sum = 0;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                sum += node.data;

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);

                }
            }

        }
        return sum;

    }

    public static void main(String[] args) {
        DeepestLeavesSum tree=new DeepestLeavesSum();
        tree.root=tree.BuildTree();
        int sum=tree.deepestLeavesSum(tree.root);
        System.out.println("sum of deepesr sum: "+sum);
    }
}
