package march19;


import java.util.Scanner;

public class CountOneChildNodes {

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

    CountOneChildNodes() {
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

      int countOneChild(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countOneChild(root.left);
        int rightCount = countOneChild(root.right);

        if ((root.left == null && root.right != null) ||
                (root.left != null && root.right == null)) {
            return 1 + leftCount + rightCount;
        }
        return leftCount + rightCount;

    }

    public static void main(String[] args) {
        CountOneChildNodes tree = new CountOneChildNodes();
        root=tree.BuildTree();
       int res= tree.countOneChild(root);
        System.out.println("Total no of  one node in binaty tree :"+res);

    }
}
