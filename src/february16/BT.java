package february16;

import february12.BinaryTree2;

import java.util.Scanner;

public class BT {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public void insertValues(Scanner sc) {

        System.out.println("Enter the root Node");
        int data = sc.nextInt();
        root = new Node(data);
        insertValues(sc,root);
    }

    private void insertValues(Scanner sc, Node node) {
        System.out.println("do you want to insert the left of " + node.data);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the  values of the left  of " + node.data);
            int data = sc.nextInt();
            node.left = new Node(data);
            insertValues(sc, node.left);
        }

        System.out.println("do you want to insert the right of " + node.data);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the  values of the right  of " + node.data);
            int data = sc.nextInt();
            node.right = new Node(data);
            insertValues(sc, node.right);
        }
    }

    void InOrderTraverse(Node curr) {
        if (curr == null) {
            return;
        }
        System.out.print(curr.data + " ");
        InOrderTraverse(curr.left);
        InOrderTraverse(curr.right);
    }

    public static void main(String[] args) {
        BT tree = new BT();
        Scanner sc=new Scanner(System.in);
        tree.insertValues(sc);
    }


}
