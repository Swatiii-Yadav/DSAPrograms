package february13;

import java.util.Scanner;

public class RightViewOfTree {
    class Node {
        int data;
        Node left;
        Node right;
        int height;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 0;
        }
    }
        static Node root;

        public int treeHeight(Node node) {
            if (node == null) {
                return -1;
            }
            return node.height;
        }

        public boolean isEmpty() {
            return root == null;
        }

        Scanner sc = new Scanner(System.in);

        public void insert(int data) {
            root = BuildTree(root, data);
        }

        private Node BuildTree(Node node, int data) {
            if (node == null) {
                return new Node(data);
            }
            if (data < node.data) {
                node.left = BuildTree(node.left, data);
            } else if (data > node.data) {
                node.right = BuildTree(node.right, data);
            }

            node.height = Math.max(treeHeight(node.left), treeHeight(node.right)) + 1;

            return node;
        }


        public void rightSideView(Node root) {
            System.out.print("Right View Traversal: ");
            printRightView(root, 0);
            System.out.println();
        }

        int maxLevelRight = -1;

        private void printRightView(Node root, int level) {
            if (root == null) {
                return;
            }
            if (level > maxLevelRight) {
                System.out.print(root.data + " ");
                maxLevelRight = level;
            }

            printRightView(root.right, level + 1);
        }

    public static void main(String[] args) {
        RightViewOfTree tree = new RightViewOfTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.rightSideView(root);
    }
}