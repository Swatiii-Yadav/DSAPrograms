package february7;



public class PairsWthSumIndoublyLL {

   static class Node {
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
    Node tail;
    void insertAtFirst(int data) {
//    {        Node node=new Node(data);
//
//        node.next=head;
//        if (head!=null){
//            head.prev=node;
//        }
//        head=node;

        Node node = new Node(data);

        if (head == null) {  // If list is empty, set both head and tail
            head = tail = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;

        // Ensure tail always points to the last node
        if (tail == null) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            tail = temp;

        }

    }
    void findPair(int target) {
        if (head == null || head.next == null) {
            System.out.println("No pairs");
            return;
        }
        if (tail == null) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            tail = temp;
        }

        Node start = head;
        Node end = tail;
        boolean flag = false;

        while (start != null && end != null && start != end && start.prev != end) {
            int sum = start.data + end.data;

            if (sum == target) {
                System.out.println("Pair found:" + start.data + " " + end.data);
                start = start.next;
                end = end.prev;
                flag = true;
            } else if (sum < target) {
                start = start.next;
            } else {
                end = end.prev;
            }
        }

        if (!flag) {
            System.out.println("No pairs found with sum " + target);
        }
    }


    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        PairsWthSumIndoublyLL list = new PairsWthSumIndoublyLL();
        list.insertAtFirst(5);
        list.insertAtFirst(10);
        list.insertAtFirst(15);
        list.insertAtFirst(20);
        list.insertAtFirst(25);
        list.insertAtFirst(30);
        list.insertAtFirst(35);
        list.print();
        list.findPair(30);
    }

}
