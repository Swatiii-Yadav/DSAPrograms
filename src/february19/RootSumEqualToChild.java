package february19;


public class RootSumEqualToChild {
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
    public static boolean checkTree(Node root) {
        if (root==null){
            return false;
        }
        int leftSum=root.left.data;
        int rightSum=root.right.data;

        return root.data==leftSum+rightSum;
    }

    public static void main(String[] args) {
        Node root = new Node(19);
        root.left = new Node(4);
        root.right = new Node(5);
        System.out.println(checkTree(root));

    }
}
