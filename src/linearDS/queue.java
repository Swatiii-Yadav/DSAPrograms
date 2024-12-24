package linearDS;

public class queue {
    int[] data;
    int size = 10;
    int front;
    int rear;
    int currPosition;

    queue(int size) {
        this.size = size;
        this.data = new int[size];
        this.front = 0;
        this.rear = -1;
        this.currPosition = 0;

    }


    public void push(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        data[++rear] = item;
        currPosition++;


    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        int temp = data[front++];
        if (front == size) {
            front = 0;
        }
        return temp;
    }

    public boolean isFull() {
        return size == currPosition;
    }

    public boolean isEmpty() {
        return currPosition == 0;
    }

    public void display() {
        for (int i = 0; i < currPosition; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) {
        queue qu = new queue(10);
        qu.push(1);
        qu.push(2);
        qu.push(3);
        qu.push(4);
        qu.push(5);
        qu.display();
        System.out.println();
        System.out.println("delete --> "+qu.pop());
    }
}
