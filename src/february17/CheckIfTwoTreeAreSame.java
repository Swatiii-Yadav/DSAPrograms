package february17;

import java.util.LinkedList;
import java.util.Queue;

public class CheckIfTwoTreeAreSame {
   static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int val){
           this.val=val;
       }

    }
     TreeNode root;
   static   boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q==null) {
            return false ;
        }
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(p);
        queue2.add(q);
        while (!queue1.isEmpty()  && !queue2.isEmpty()) {
            TreeNode curr1 = queue1.poll();
            TreeNode curr2=queue2.poll();
            if(curr1.val!=curr2.val){
                return false;
            }

            if (curr1.left != null && curr2.left != null) {
                queue1.add(curr1.left);
                queue2.add(curr2.left);
            }
            else if(curr1.left != null || curr2.left != null){
                return false;

            }
            if (curr1.right != null && curr2.right !=null) {
                queue1.add(curr1.right);
                queue2.add(curr2.right);
            }
            else if(curr1.right != null ||curr2.right !=null){
                return false;
            }
        }
        return queue1.isEmpty()&&queue2.isEmpty();
    }

    public static void main(String[] args) {
        CheckIfTwoTreeAreSame p=new CheckIfTwoTreeAreSame();
        CheckIfTwoTreeAreSame q=new CheckIfTwoTreeAreSame();
        p.root=new TreeNode(1);
        p.root.left=new TreeNode(3);
        p.root.right=new TreeNode(6);

        q.root=new TreeNode(1);
        q.root.left=new TreeNode(6);
        q.root.right=new TreeNode(3);

       boolean res= isSameTree(p.root,q.root);
       if (res){
           System.out.println("tree are same");
       }
       else {
           System.out.println("trees are not same");
       }
    }
}
