package february18;

public class SumOfNodeInBinaryTree {
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
    static Node root;
    public int SumOFNodes(Node root) {
        if(root==null){
            return 0;
        }

        int leftSum=(SumOFNodes(root.left));
        int rightSum=(SumOFNodes(root.right));

        return leftSum+rightSum+root.data;
    }
    public static void main(String[] args) {
        SumOfNodeInBinaryTree tree=new SumOfNodeInBinaryTree();
        root = new Node(75);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(30);
        root.left.right = new Node(15);
        root.left.left.left = new Node(20);
        root.left.left.right = new Node(5);
        int sum= tree.SumOFNodes(root);
        System.out.println("Total sum  of nodes in Complete binary tree : "+sum);
    }
}
