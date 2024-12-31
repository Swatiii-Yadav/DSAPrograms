package december31;

import december30.DoublyLinkedList;

public class reverseDLL {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head;

    void InsertAtFirst(int data)
    {        Node node=new Node(data);

        node.next=head;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }


    Node reverse() {

        if (head == null || head.next == null) {

            return head;
        }


        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }


        return temp.prev;
    }


    public static void main(String[] args) {
        reverseDLL list=new reverseDLL();
        list.InsertAtFirst(4);
        list.InsertAtFirst(14);
        list.InsertAtFirst(24);
        list.InsertAtFirst(34);


    }
}
