package february6;


public class AllOperationOnDoublyLinkedList {
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

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }


     void deleteAtFirst() {
         if (head == null) {
             return;
         }
         Node temp = head;
         head = head.next;
         if (head != null) {
             head.prev = null;
         }
         temp.next = null;
     }

    public void reverse() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        while (curr != null) {
            System.out.print(curr.data + " <---> ");
            curr = curr.prev;
        }
        System.out.println("null");
    }

    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"<---> ");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args) {
        AllOperationOnDoublyLinkedList list = new AllOperationOnDoublyLinkedList();
        list.InsertAtFirst(10);
        list.InsertAtFirst(20);
        list.InsertAtFirst(30);
        list.InsertAtFirst(40);
        list.InsertAtFirst(50);
        list.InsertAtFirst(60);
        list.print();
      list.deleteAtFirst();
      list.print();
      list.reverse();

    }
}
