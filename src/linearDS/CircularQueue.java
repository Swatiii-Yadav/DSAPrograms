package linearDS;

public class CircularQueue {
int []arr;
int size=5;
int front,rear;
CircularQueue(int size){
    this.arr=new int[size];
    int front =-1;
    int rear=-1;

}
boolean isEmpty(){
    return front==-1;
}
boolean isFull(){
    return ((rear+1)%size==front);

}
//insert item into circular queue
 void enQueue(int item){
    if (isFull()){
        System.out.println("queue is Full");
    return;
    }
    if (isEmpty()){
        front=0;
    }
    rear=(rear+1)%size;
    arr[rear]=item;
 }
    //delete or dequeue item fro circular queue
    int deQueue(){
    if (isEmpty()){
        System.out.println("Queue is Empty");

    }
    int remove=arr[front];
    arr[front]=0;
    if (front==rear){
        front=-1;
        rear=-1;
    }
    else{
        front=(front+1)%size;
    }
return remove;
}

void display(){
    int idx=front;
    while (true){
        System.out.print(arr[idx]+" ");
        if (idx==rear){
            break;
        }
        idx=(idx+1)%size;
    }
    System.out.println();

}

    public static void main(String[] args) {
        CircularQueue queue=new CircularQueue(10);
        queue.enQueue(14);
        queue.enQueue(28);
        queue.enQueue(42);
        queue.enQueue(56);

        queue.display();

        queue.deQueue();
        queue.deQueue();

        queue.display();

        queue.enQueue(4);
        queue.enQueue(8);
        queue.enQueue(12);

        queue.display();

    }
}
