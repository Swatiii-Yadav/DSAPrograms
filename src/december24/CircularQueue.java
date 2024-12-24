package december24;

public class CircularQueue {

        public class Queue {
            int[] data;
            int size;
            int front;
            int rear;
            int currPosition;

            Queue(int size) {
                this.size = size;
                this.data = new int[size];
                this.front = 0;
                this.rear = -1;
                this.currPosition = 0;
            }

            // Enqueue operation (add element to the rear)
            public void push(int item) {
                if (isFull()) {
                    System.out.println("Queue is Full");
                    return;
                }
                // Move rear to the next position circularly
                rear = (rear + 1) % size;
                data[rear] = item;
                currPosition++;
            }

            // Dequeue operation (remove element from the front)
            public int pop() {
                if (isEmpty()) {
                    System.out.println("Queue is Empty");
                    return -1;
                }
                int temp = data[front];
                // Move front to the next position circularly
                front = (front + 1) % size;
                currPosition--;
                return temp;
            }

            // Check if the queue is full
            public boolean isFull() {
                return currPosition == size;
            }

            // Check if the queue is empty
            public boolean isEmpty() {
                return currPosition == 0;
            }

            // Return the front element
            public int front() {
                if (isEmpty()) {
                    System.out.println("Queue is Empty");
                    return -1;
                }
                return data[front];
            }

            // Display elements in the queue (from front to rear)
            public void display() {
                if (isEmpty()) {
                    System.out.println("Queue is Empty");
                    return;
                }
                System.out.print("Queue elements: ");
                for (int i = 0; i < currPosition; i++) {
                    int index = (front + i) % size; // Circular index
                    System.out.print(data[index] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            CircularQueue cq = new CircularQueue();
            Queue queue = cq.new Queue(5);  // Creating circular queue of size 5

            // Enqueue some elements
            queue.push(10);
            queue.push(20);
            queue.push(30);
            queue.push(40);
            queue.push(50);


            queue.display();

            // Dequeue an element
            System.out.println("removed: " + queue.pop());

            // Display queue after dequeue operation
            queue.display();

        }


}
