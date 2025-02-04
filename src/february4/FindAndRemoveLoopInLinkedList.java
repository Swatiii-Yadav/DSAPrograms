package february4;
public class FindAndRemoveLoopInLinkedList {
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

    Node  findLoopPointInList(Node head){
        if (head==null || head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                slow=head;
                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    void removeLoop(Node loopNode) {
        if (loopNode == null) {
            return;
        }

        Node ptr1 = loopNode;
        Node ptr2 = loopNode;

        // Find the node before loopNode that points back into the cycle
        while (ptr2.next != loopNode) {
            ptr2 = ptr2.next;
        }

        ptr2.next = null;
    }


    public static void main(String[] args) {
        FindAndRemoveLoopInLinkedList list = new FindAndRemoveLoopInLinkedList();


        list.insertNode(14); // Head becomes -4
        list.insertNode(10);  // Head becomes 0
        list.insertNode(20);  // Head becomes 2
        list.insertNode(30);  // Head becomes 3


        Node  head = FindAndRemoveLoopInLinkedList.head;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head.next;
        Node cycle = list.findLoopPointInList(head);
        if (cycle != null) {
            System.out.println("Cycle detected at " + cycle.data);
            list.removeLoop(cycle);
            System.out.println("Loop removed.");
        } else {
            System.out.println("No cycle detected.");
        }


    }

}
