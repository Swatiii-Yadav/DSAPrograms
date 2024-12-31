package december31;

public class removeDuplicatesInLL {
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
    void remove(){
        Node temp=head;
        while (temp.next!=null){
            if (temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else {
                temp=temp.next;
            }
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
        removeDuplicatesInLL list=new removeDuplicatesInLL();
        list.insertFromFront(11);
        list.insertFromFront(1);
        list.insertFromFront(22);
        list.insertFromFront(22);
        list.insertFromFront(45);
        list.insertFromFront(44);
        list.remove();
list.print();

        }


}
