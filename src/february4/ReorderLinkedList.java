package february4;

import february1.ReverseLinkedListAtKPartition;

/*original linked list
1->2->3->4->5
reorder list
1->5->2->4->3
* */
public class ReorderLinkedList {
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

    Node middleNode(Node head){
        Node slow=head.next;
        Node fast=head.next;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node newNode=null;
        while (curr!=null){
            newNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newNode;
        }
        return prev;
    }

    void reorderList(){
        if (head==null || head.next==null){
            return ;
        }
        Node mid=middleNode(head);
        Node reverseStartPoint=reverse(mid.next);
        mid.next=null;
        Node firstHalve=head;
        Node secondHalve=reverseStartPoint;
        Node firstListPointer=null;
        Node secondListPointer=null;

        while (firstHalve!=null && secondHalve!=null){

            firstListPointer=firstHalve.next;
            secondListPointer=secondHalve.next;

            firstHalve.next=secondHalve;
            secondHalve.next=firstListPointer;

            firstHalve=firstListPointer;
            secondHalve=secondListPointer;
        }

    }

    void printList(){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data +" -->");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        ReorderLinkedList list=new ReorderLinkedList();
        list.insertNode(6);
        list.insertNode(5);
        list.insertNode(4);
        list.insertNode(3);
        list.insertNode(2);
        list.insertNode(1);
        System.out.println("original list");
        list.printList();
        list.reorderList();
        System.out.println("Reorder list");
        list.printList();
    }
}
