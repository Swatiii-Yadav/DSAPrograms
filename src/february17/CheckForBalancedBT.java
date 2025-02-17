package february17;


public class CheckForBalancedBT {
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
    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
CheckForBalancedBT  tree=new CheckForBalancedBT();
root=new Node(75);
        root.left=new Node(3);
        root.right=new Node(6);
        root.left.left = new Node(30);
        root.left.right = new Node(15);
        root.left.left.left = new Node(20);
        root.left.left.right = new Node(5);
      boolean res=  tree.isBalanced(root);
if (res){
    System.out.println("balanced");
}else {
    System.out.println(" not balanced");
}

    }
}