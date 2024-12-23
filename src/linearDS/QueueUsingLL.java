package linearDS;

public class QueueUsingLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            Node next = null;
        }
    }

    Node front, rear;

    QueueUsingLL() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public void enqueue(int data) {
        Node node = new Node(data);
        if (rear == null) {
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;

    }

    public int  dequeue() {
if (isEmpty()){
    System.out.println("Stack is Empty");
}
int  remove=front.data;
front=front.next;
return remove;
    }
public void displayFront(){
        Node tep=front;
        while (tep!=null){
            System.out.print(tep.data+" ");
            tep=tep.next;
        }
    System.out.println();
}
    public static void main(String[] args) {
        QueueUsingLL list = new QueueUsingLL();
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        list.enqueue(50);
        System.out.println(list.dequeue());
        list.displayFront();



    }
}
