package december31;

public class separateEvenOdd {
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

    Node OddEVen() {
        if (head == null || head.next == null) {
            return head;
        }

        Node evenHead = null;
       Node  oddHead = null;
        Node evenCurrent = null;
         Node oddCurrent = null;
        Node curr = head;

        while (curr != null) {
            Node temp = curr;
            curr = curr.next;
            temp.next = null;

            if (temp.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = temp;
                    evenCurrent = evenHead;
                } else {
                    evenCurrent.next = temp;
                    evenCurrent = evenCurrent.next;
                }
            } else {

                if (oddHead == null) {
                    oddHead = temp; // Initialize odd list
                    oddCurrent = oddHead;
                } else {
                    oddCurrent.next = temp;
                    oddCurrent = oddCurrent.next;
                }
            }
        }

        if (evenHead == null) {
            return oddHead;
        }
        evenCurrent.next = oddHead;
        return evenHead;
    }


    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" -->");
            temp=temp.next;
        }
    System.out.println("End");
}
    public static void main(String[] args) {
separateEvenOdd list=new separateEvenOdd();
list.insertFirst(1);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(2);
        list.OddEVen();
        list.print();

    }
}

