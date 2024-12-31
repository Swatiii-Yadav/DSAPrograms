package december31;

public class sortLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    Node head;

    void insertFromFront(int data){
        Node node=new Node(data);
        if (head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;

    }
    void sort(){

        if (head == null || head.next == null) {
            return; // No need to sort if the list is empty or has only one node.
        }

        Node end = null;

        while (end != head) {
            Node temp = head;

            while (temp.next != end) {
                if (temp.data > temp.next.data) {

                    int curr = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = curr;
                }
                temp = temp.next;
            }
            end = temp;
        }
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
sortLL list=new sortLL();
        list.insertFromFront(3);
        list.insertFromFront(23);
        list.insertFromFront(13);
        list.insertFromFront(53);
        list.sort();
        list.print();



    }
}
