package february5;


public class maximumTwinSumofLinkedList {
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


    Node reverse(Node head) {
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
    Node midNode(){
        Node slow=head.next;
        Node fast=head.next;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

     int findMaxSumPair(Node head){
         Node mid = midNode();

         Node secondList = reverse(mid);
         Node firstList = head;
         int sum = 0;


         while (secondList != null) {
             int curr = firstList.data + secondList.data;
             sum = Math.max(sum, curr);
             firstList = firstList.next;
             secondList = secondList.next;
         }

         return sum;
     }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        maximumTwinSumofLinkedList list = new maximumTwinSumofLinkedList();

        list.insertNode(5);
        list.insertNode(4);
        list.insertNode(2);
        list.insertNode(1);

        System.out.println("Original list: ");
        list.display();

        int maxSum = list.findMaxSumPair(head);
        System.out.println("Sum: " + maxSum);
    }
}