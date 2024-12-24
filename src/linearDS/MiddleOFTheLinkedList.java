package linearDS;

public class MiddleOFTheLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    //make a head node which is  basically work as a  pointer
    Node head;

    //create a function insertFirst so we can add new node to the list
    void insertFirst(int value){
        Node newNode =new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    public Node middleNode(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }

        return slow;
    }
    public static void main(String[] args) {
        MiddleOFTheLinkedList list =new MiddleOFTheLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        Node middleNode= list.middleNode(list.head);
        System.out.println(middleNode.data);
    }
}
