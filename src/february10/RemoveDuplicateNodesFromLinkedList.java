package february10;

public class RemoveDuplicateNodesFromLinkedList {
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

    public static void removeDuplicates(Node head) {
        Node curr = head;

        while (curr != null) {
            Node temp = curr;
            while (temp.next != null) {
                if (temp.next.data == curr.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            curr = curr.next;
        }
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       RemoveDuplicateNodesFromLinkedList list=new RemoveDuplicateNodesFromLinkedList();
       list.insertNode(7);
        list.insertNode(17);
        list.insertNode(7);
        list.insertNode(70);
        list.insertNode(7);
        list.insertNode(17);
        System.out.println("original List:");
        printList(head);
        removeDuplicates(head);
        System.out.println("List after removing duplicates:");
        printList(head);

    }
}
