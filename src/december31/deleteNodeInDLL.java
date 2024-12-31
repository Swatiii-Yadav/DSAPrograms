package december31;

import december30.DoublyLinkedList;

public class deleteNodeInDLL {
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

    Node deleteFront(){
        if (head == null || head.next == null) {
            return null; //
        }

        Node temp = head;
        head = head.next;

        head.prev = null; // Set 'back' pointer of the new head to null
        temp.next = null; // Set 'next' pointer of 'prev' to null

        return head;
    }
    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"--> ");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args) {
        deleteNodeInDLL list=new deleteNodeInDLL();
        list.InsertAtFirst(4);
        list.InsertAtFirst(14);
        list.InsertAtFirst(24);
        list.print();
        list.deleteFront();
        list.print();
    }

}
