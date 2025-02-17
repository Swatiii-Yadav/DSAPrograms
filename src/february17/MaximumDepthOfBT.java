package february17;

public class MaximumDepthOfBT {

  static   class TreeNode{
       int data;
       TreeNode left;
       TreeNode right;
       TreeNode(int data){
           this.data=data;
       }
   }
   static TreeNode root;
int maxDepth(TreeNode root){
    if (root==null){
        return 0;
    }
    int leftDepth=maxDepth(root.left);
    int rightDepth=maxDepth(root.right);
    return Math.max(leftDepth,rightDepth)+1;
}
    public static void main(String[] args) {
       MaximumDepthOfBT tree=new MaximumDepthOfBT();
       root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(3);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(8);
        root.right.right=new TreeNode(3);
       int maxDepth= tree.maxDepth(root);
        System.out.println("Max depth of BT : "+maxDepth);

    }
}
