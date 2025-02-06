package february5;

public class DoubleNumberRepresentedAsLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    int len = 0;

    void insertNode(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
        ++len;
    }

    Node reverse() {
        Node prev = null;
        Node curr = head;
        Node nextNode = null;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;

    }

    void doubleNumbers(Node head) {
        if (head == null) {
            return ;
        }
        head=reverse();
        Node curr = head;
        int carry = 0;
        while (curr != null) {
            int doubledValue = (curr.data * 2) + carry;
            curr.data = doubledValue % 10;
            carry = doubledValue / 10;

            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                break;
            }
            curr = curr.next;
        }
        head=reverse();
    }


    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        DoubleNumberRepresentedAsLinkedList list = new DoubleNumberRepresentedAsLinkedList();
        list.insertNode(9);
        list.insertNode(8);
        list.insertNode(1);
        System.out.println("Original list: ");
        list.display();
        list.doubleNumbers(head);


        System.out.println("after multiply it with 2");
        list.display();

    }
}
