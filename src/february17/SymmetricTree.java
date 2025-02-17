package february17;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
  TreeNode root;

    public  boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }

            if (left.val != right.val) {
                return false;
            }

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }

        return true;
    }

    public static void main(String[] args) {
        SymmetricTree tree=new SymmetricTree();
        tree.root=new TreeNode(1);
        tree.root.left=new TreeNode(3);
        tree.root.left.left=new TreeNode(3);
        tree.root.left.right=new TreeNode(3);
        tree.root.right=new TreeNode(3);
        tree.root.right.left=new TreeNode(8);
        tree.root.right.right=new TreeNode(3);



      boolean res=  tree.isSymmetric(tree.root);
      if (res){
          System.out.println("tree is symmetric");
      }
      else {
          System.out.println("Not symmetric");
      }
    }
}
