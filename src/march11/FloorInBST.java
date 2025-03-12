package march11;

public class FloorInBST {


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    FloorInBST() {
        root = null;
    }

    int floorInBST(Node root, int key) {

        int floor = -1;

        while (root != null) {

            if (root.data == key) {
                floor = root.data;
                return floor;
            }

            if (key > root.data) {

                floor = root.data;
                root = root.right;
            } else {

                root = root.left;
            }
        }

        return floor;
    }


    public static void printInOrder(Node root) {

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

        System.out.println("Binary Search Tree:");
        printInOrder(root);
        System.out.println();
        FloorInBST tree = new FloorInBST();

        int target = 8;
        int ciel = tree.floorInBST(root, target);

        if (ciel != -1) {
            System.out.println("Floor of " + target + " is: " + ciel);
        } else {
            System.out.println("No floor found!");
        }
    }
}

