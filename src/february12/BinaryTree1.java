package february12;


public class BinaryTree1 {
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

    static Node root;

   void insertValueIntoNode(){                                   //     40
        root=new Node(40);                                           //    /   \
        root.left=new Node(10);                                        //   10  25
        root.right=new Node(25);                                      //     \   /
        root.left.right=new Node(5);                                  //      5   15
       root.right.left=new Node(15);



   }
   void InOrdertraverse(Node curr){
       if (curr==null){
           return;
       }
       //root->left->left->right->right
       System.out.print(curr.data+" ");
       InOrdertraverse(curr.left);
       InOrdertraverse(curr.right);

       }


    public static void main(String[] args) {
        BinaryTree1 tree=new BinaryTree1();
        tree.insertValueIntoNode();
        tree.InOrdertraverse(root);

    }
}
