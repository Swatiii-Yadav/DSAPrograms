package linearDS;

public class LinkedLists {
    //create a class Node to store the data of the Node for Linked List
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    //make a head node which is  basically work as a  pointer
    Node head;

     //create a function insertFirst so we can add new node to the list
     void insertFirst(int value){
        Node newNode =new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    /*function to insert node from the last;
    for that we have to take another temp node which is work as a pointer ,it traverses the list and if temp.next
    is null and then insert node*/
    void insertLast(int val){
         Node newNode=new Node(val);
         if (head==null){
             head=newNode;
             return ;
         }
         Node temp=head;
         while (temp.next!=null){
             temp=temp.next;
         }
         temp.next=newNode;
    }

    /*delete node from first */
    void delete(){
        if (head==null){
            return;
        }
        head=head.next;
    }


//function to print the linked list
    void printList(){
         if (head==null){

             return;
         }
         Node temp=head;
         while (temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
    }
    public static void main(String[] args) {
         LinkedLists list =new LinkedLists();
         list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
    list.insertFirst(50);
    list.delete();
        list.printList();

    }
}
