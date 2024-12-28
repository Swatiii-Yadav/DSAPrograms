package linearDS;

public class LinkedList {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node(int value){
            this.data=value;
            this.next=null;
        }
    }
    public static   void insertValueIntoNode(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void deleteNode(){

        if (head==null){
            System.out.println("List is Empty");
        }

        head=head.next;
    }
    public static void  printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertValueIntoNode(5);
        list.insertValueIntoNode(15);
        list.insertValueIntoNode(25);
        list.insertValueIntoNode(35);

        printList();
        deleteNode();
        printList();


    }

}
