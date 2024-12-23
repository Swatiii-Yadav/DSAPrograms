package linearDS;

public class stackUsingLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;
    stackUsingLL(){
this.head=null;
    }

    public boolean isEmpty(){
        return head == null;
    }
   public void push(int val){
        Node node=new Node(val);
        if(node==null){
            return ;
        }
        node.next=head;
        head=node;
   }
   public int pop(){
        if(isEmpty()){
            System.out.println("stack is Empty");
        }
        Node temp=head;
int remvoe=head.data;
        head=head.next;

 temp=null;
 return  remvoe;
   }
   public void display(){
Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ___");
            temp=temp.next;
        }
   }

    public static void main(String[] args) {
        stackUsingLL list=new stackUsingLL();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);

        System.out.println("Removed element " +list.pop());

        list.display();



    }

}
