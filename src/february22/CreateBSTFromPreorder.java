package february22;


public class CreateBSTFromPreorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }

    Node root;
        public Node constructBSTFromPreorder(int[] preorder) {
            Node root = null;
            for (int val : preorder) {
                root = insertIntoBST(root, val);
            }
            return root;
        }

        private Node insertIntoBST(Node root, int val) {
            if (root == null) return new Node(val);

            if (val < root.data) {
                root.left = insertIntoBST(root.left, val);
            } else {
                root.right = insertIntoBST(root.right, val);
            }

            return root;
        }


        public void inorderTraversal(Node root) {
            if (root == null) return;
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }

        public static void main(String[] args) {
            CreateBSTFromPreorder tree = new CreateBSTFromPreorder();

            int[] preorder = {8, 5, 1, 7, 10, 12};

            Node root = tree.constructBSTFromPreorder(preorder);

            System.out.print("Inorder Traversal of Constructed BST: ");
            tree.inorderTraversal(root);
        }
    }


