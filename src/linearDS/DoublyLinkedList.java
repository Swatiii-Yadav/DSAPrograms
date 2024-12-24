package linearDS;

public class DoublyLinkedList {
        public class Node {
            int value;
            Node next = null;
            Node prev = null;


            Node(int value) {
                this.value = value;
            }

            Node(int value, Node prev, Node next) {
                this.value = value;
                this.next = null;
                this.prev = null;
            }

        }

        Node head;

        public void insertElement(int value) {
            Node node = new Node(value);
            node.next = head;
            node.prev = null;
            if (head != null) {
                head.prev = node;
            }
            head = node;
        }

        public void display() {
            Node temp = head;
            Node last=null;
            while (temp != null) {
                last=temp;
                System.out.print("<- "+temp.value + " ->");
                temp = temp.next;
            }
            System.out.println();
            System.out.println("reversal of list");
            while (last != null) {

                System.out.print("<- "+last.value + " ->");
                last = last.prev;
            }
        }

        public static void main(String[] args) {
            DoublyLinkedList list = new DoublyLinkedList();
            list.insertElement(4);
            list.insertElement(3);
            list.insertElement(2);

            list.insertElement(1);
            list.display();
        }


}
