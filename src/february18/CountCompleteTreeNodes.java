package february18;


import february17.CheckForBalancedBT;

public class CountCompleteTreeNodes {
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
    public int countNodes(Node root) {
        if(root==null){
            return 0;
        }

        int leftCount=(countNodes(root.left));
        int rightCount=(countNodes(root.right));


        return leftCount+rightCount+1;
    }

    public static void main(String[] args) {
        CountCompleteTreeNodes tree=new CountCompleteTreeNodes();
        root = new Node(75);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(30);
        root.left.right = new Node(15);
        root.left.left.left = new Node(20);
        root.left.left.right = new Node(5);
       int count= tree.countNodes(root);
        System.out.println("Total number of nodes in Complete binary tree : "+count);
    }

}
