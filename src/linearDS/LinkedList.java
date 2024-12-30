package linearDS;

public class LinkedList {
    //create a Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    Node head;
    public void insertFirst(int data){
Node node=new Node(data);
if(head==null){
    head=node;
    return;
}
node.next=head;
head=node;
    }
    public void insertFromLast(int data){
        Node node =new Node(data);
        if (head==null){
            head=node;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;

    }

    public  Node deleteFirst(){
        if (head==null){
            return null;
        }
        Node temp=head;
        head=head.next;
        return head;
    }
    public Node deleteLast(){
        if (head==null){
            return null;
        }
        if (head.next==null){
            head=null;
            return null;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
            temp.next=null;
            }
        return head;
    }
public void print(){
        Node temp=head;
        if (temp==null){
            return;
        }
        while (temp!=null) {
            System.out.print(temp.data+" ");

            temp = temp.next;
        }
}
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertFirst(5);
        list.insertFirst(15);
        list.insertFirst(25);
        list.insertFirst(35);
        list.insertFirst(45);


        list.insertFromLast(9);
        list.insertFromLast(19);
        list.insertFromLast(29);
        list.insertFromLast(39);
        list.insertFromLast(49);
        list.print();


    }
}
