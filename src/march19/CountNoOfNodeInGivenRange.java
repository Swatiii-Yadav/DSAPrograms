package march19;

public class CountNoOfNodeInGivenRange {

  static   class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;

        }
    }

        Node root;

        int countNodesInRange(Node node, int low, int high) {
            if (node == null) {
                return 0;
            }
            if (node.data >= low && node.data <= high) {
               int  countLeft=countNodesInRange(node.left, low, high);
                int  countRight=countNodesInRange(node.right, low, high);
                return countLeft+countRight+1;
            }

            if (node.data < low) {
                return countNodesInRange(node.right, low, high);
            }

            return countNodesInRange(node.left, low, high);
        }

        public static void main(String[] args) {
         CountNoOfNodeInGivenRange tree=new CountNoOfNodeInGivenRange();
            tree.root = new Node(10);
            tree.root.left = new Node(5);
            tree.root.right = new Node(15);
            tree.root.left.left = new Node(3);
            tree.root.left.right = new Node(7);
            tree.root.right.left = new Node(13);
            tree.root.right.right = new Node(18);

            int low = 5, high = 15;
            int res=tree.countNodesInRange(tree.root, low, high);
            System.out.println("Number  of nodes in range " + low + " to " + high +" = "+res);
        }
    }


