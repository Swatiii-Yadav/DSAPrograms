package february5;



public class findLengthOfLoopInLinkedList {

    class Node {
        int data;
        Node next;

       Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;


    public void insertFirst(int data){
     Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public int lenOfLoop(Node head) {

        if (head == null) {
            return 0;
        }
        Node slow = head;
        Node fast = head;
        int count = 1;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = fast.next;
                while (slow != fast) {
                    count++;
                    fast = fast.next;

                }

                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        findLengthOfLoopInLinkedList list = new findLengthOfLoopInLinkedList();


        list.insertFirst(14);
        list.insertFirst(55);
        list.insertFirst(29);
        list.insertFirst(31);
        list.insertFirst(5);
        list.insertFirst(67);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head.next;

        int  len = list.lenOfLoop(head);
        System.out.println("Length of loop in: "+len);
    }
}
