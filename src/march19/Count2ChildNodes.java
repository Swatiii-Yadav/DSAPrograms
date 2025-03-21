package march19;

import java.util.Scanner;

public class Count2ChildNodes {
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

    Count2ChildNodes() {
        root = null;
        sc = new Scanner(System.in);
    }

    Node BuildTree() {
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

    int countChild(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countChild(root.left);
        int rightCount = countChild(root.right);

        if (root.left != null && root.right != null)  {
            return 1 + leftCount + rightCount;
        }
        return leftCount + rightCount;

    }

    public static void main(String[] args) {
        Count2ChildNodes tree = new Count2ChildNodes();
        root=tree.BuildTree();
        int res= tree.countChild(root);
        System.out.println("Total no of  two node in binaty tree :"+res);

    }
}
