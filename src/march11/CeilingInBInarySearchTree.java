package march11;

public class CeilingInBInarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    CeilingInBInarySearchTree() {
        root = null;
    }

    public int findCeil(Node root, int key) {
        int ceil = -1;
        while (root != null) {

            if (root.data == key) {
                ceil = root.data;
                return ceil;
            }

            if (key > root.data) {
                root = root.right;
            } else {
                ceil = root.data;
                root = root.left;
            }
        }

        return ceil;
    }


    void printInOrder(Node root) {

        if (root == null) {
            return;
        }

        printInOrder(root.left);

        System.out.print(root.data + " ");

        printInOrder(root.right);

    }

    public static void main(String[] args) {

       Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(13);
        root.left.left = new Node(3);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);
        root.left.right.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(14);

        CeilingInBInarySearchTree tree=new CeilingInBInarySearchTree();
        System.out.println("Binary Search Tree: ");
        tree.printInOrder(root);
        System.out.println();


        int target = 8;
        int ceil = tree.findCeil(root, target);

        if (ceil != -1) {
            System.out.println("Ceiling of " + target + " is: " + ceil);
        } else {
            System.out.println("No ceiling found!");
        }
    }


}
