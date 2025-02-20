package february19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTreePAths {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    BinaryTreePAths(){
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


    Node root;
    Scanner sc;

    public  List<String> binaryTreePaths( Node root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;

        Stack<Node> temp = new Stack<>();
        Stack<String> pathS = new Stack<>();

        temp.push(root);
        pathS.push("" + root.data);

        while (!temp.isEmpty()) {
            Node node = temp.pop();
            String path = pathS.pop();

            if (node.left == null && node.right == null) {
                result.add(path);
            } else {
                if (node.right != null) {
                    temp.push(node.right);
                    pathS.push(path+"-->" +node.right.data);
                }
                if (node.left != null) {
                    temp.push(node.left);
                    pathS.push(path +"->" +node.left.data);
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        BinaryTreePAths tree=new BinaryTreePAths();
        tree.BuildTree();
        tree.binaryTreePaths(tree.root);
    }
}
