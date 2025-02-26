package february25;

import java.util.Scanner;

public class BinaryTreeMinimmunPathSum
{

        static class Node {
            int data;
            Node left;
            Node right;

            public Node(int data) {
                this.data = data;
            }
        }

       static Node root;
        Scanner sc;

        BinaryTreeMinimmunPathSum() {
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

        int minSum = Integer.MAX_VALUE;

        public int minPathSum(Node root) {
            dfs(root);
            return minSum;
        }

         int dfs(Node node) {
            if (node == null) {
                return 0;
            }
            int leftMax = Math.min(dfs(node.left), 0);
            int rightMax = Math.min(dfs(node.right), 0);

            int newPathSum = node.data + leftMax + rightMax;
            minSum = Math.max(minSum, newPathSum);
            int res= node.data + Math.max(leftMax, rightMax);
            return res;
        }

        public static void main(String[] args) {
            BinaryTreeMinimmunPathSum tree=new BinaryTreeMinimmunPathSum();
            tree.BuildTree();
            int min= tree.minPathSum(root);
            System.out.println("Min sum: "+min);
        }

    }


