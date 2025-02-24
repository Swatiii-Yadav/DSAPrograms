package february24;

import february12.BinaryTree2;

import java.util.Scanner;

public class SumofNodeswithEvenValuedGrandparent {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;

        }
    }
    Node root;
    Scanner sc;
    SumofNodeswithEvenValuedGrandparent(){
        root=null;
        sc=new Scanner(System.in);
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

    public int sumEvenGrandparent(Node root) {
        return dfs(root, null, null);
    }

    private int dfs(Node node, Node parent, Node grandparent) {
        if (node == null) return 0;

        int sum = 0;
        if (grandparent != null && grandparent.data % 2 == 0) {
            sum += node.data;
        }

        sum += dfs(node.left, node, parent);
        sum += dfs(node.right, node, parent);

        return sum;
    }

    public static void main(String[] args) {
        SumofNodeswithEvenValuedGrandparent tree=new SumofNodeswithEvenValuedGrandparent();
        tree.BuildTree();
       int res= tree.sumEvenGrandparent(tree.root);
        System.out.println("sum of even grand parent: "+res);
    }
}
