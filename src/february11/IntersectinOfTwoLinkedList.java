package february11;


public class IntersectinOfTwoLinkedList {
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

   static Node intersectPoint(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            return null;
        }
        Node curr1=head1;
        Node curr2=head2;
        while (curr1!=curr2){
            if (curr1 == null) {
                curr1 = head2;
            } else {
                curr1 = curr1.next;
            }
            if (curr2 == null) {
                curr2 = head1;
            } else {
                curr2 = curr2.next;
            }
        }
        return  head1;
    }



}
