package february19;

public class ConvertSortedListToBST {
    static class Node {
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

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int val) {
            this.data = val;
            this.next = null;
        }
    }

    static ListNode head;


    private static int size(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    private static Node convert(int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        Node leftSubtree = convert(left, mid - 1);

        Node root = new Node(head.data);
        head = head.next;
        root.left = leftSubtree;
        root.right = convert(mid + 1, right);

        return root;
    }

    public static void inorderPrint(Node root) {
        if (root == null) return;
        inorderPrint(root.left);
        System.out.print(root.data + " ");
        inorderPrint(root.right);
    }

    public static void main(String[] args) {
         head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);
        int size = size(head);
        Node root = convert(0, size-1);

        System.out.print(" BST: ");
        inorderPrint(root);
    }
}
