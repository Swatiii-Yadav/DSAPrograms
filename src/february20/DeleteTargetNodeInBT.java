package february20;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeleteTargetNodeInBT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     Node root;
    Scanner sc;
    DeleteTargetNodeInBT(){
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
    public  void deleteNode(Node root, int key) {
        if (root == null) return;


        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node target = null, lastNode = null, parentNode = null;
        while (!queue.isEmpty()) {
            lastNode = queue.poll();

            if (lastNode.data == key) {
                target = lastNode;
            }
            if (lastNode.left != null) {
                queue.add(lastNode.left);
                parentNode = lastNode;
            }
            if (lastNode.right != null) {
                queue.add(lastNode.right);
                parentNode = lastNode;
            }
        }

        if (target != null) {
            target.data = lastNode.data;
            if (parentNode.left == lastNode) parentNode.left = null;
            else parentNode.right = null;
        }
    }
    public  void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        DeleteTargetNodeInBT tree=new DeleteTargetNodeInBT();
        Scanner sc=new Scanner(System.in);
       tree.root= tree.BuildTree();
       tree.inorder(tree.root);
        System.out.println("Enter target node");
        int target=sc.nextInt();
        tree.deleteNode(tree.root,target);
        tree.inorder(tree.root);

    }
}
