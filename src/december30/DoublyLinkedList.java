package december30;

public class DoublyLinkedList {
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
    //add element from front
    //for this we have to  make a node with one data ,and 2 pointers say prev and next
    //in this function node.next is assign to head
    //now we connect next ,we have to connect prev too with other node
    //if(head !=null) i.e. is already present in list ,now we connect head.prev with new node "node"
    //now we assign node as our head
    //we do that for every node
        void InsertAtFirst(int data)
        {        Node node=new Node(data);

            node.next=head;
            if (head!=null){
                head.prev=node;
            }
            head=node;
        }


        //print this list
    //we take new Node temp ans assign it as head
    //now while temp is not null
    //we print the node  and pouint temp to next niode
    //we do it until we reach at end i.e. temp==null
void print(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"--> ");
                temp=temp.next;
            }
    System.out.println("end");
}
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.InsertAtFirst(4);
        list.InsertAtFirst(14);
        list.InsertAtFirst(24);
        list.print();
    }
}
