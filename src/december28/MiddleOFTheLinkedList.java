package december28;

public class MiddleOFTheLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    Node head;

    void addFirst(int value){
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
        list.addFirst(1);
        list.addFirst(8);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(9);
        Node middleNode= list.middleNode(list.head);
        System.out.println(middleNode.data);
    }
}
