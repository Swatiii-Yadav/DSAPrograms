package december29;

import linearDS.LinkedList;

public class reverseLinkedList {
    class Node {
        int val;
       Node next;

      Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
     static Node head;


    public void insertFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }


        public static Node reverse(Node head) {
           Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            return prev;
        }


        public void printList(Node head) {
          Node temp = head;  // Temporary pointer to traverse the list
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;  // Move to the next node
            }
            System.out.println("null");  // End of the list
        }

        public static void main(String[] args) {
            reverseLinkedList rll = new reverseLinkedList();
            rll.insertFirst(5);
            rll.insertFirst(15);
            rll.insertFirst(25);
            rll.insertFirst(35);


            System.out.println("Original Linked List:");
            rll.printList(head);
          Node reversedHead = reverse(head);
            System.out.println("Reversed Linked List:");
            rll.printList(reversedHead);
        }
    }





