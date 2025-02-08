package february7;

public class StackReversalUsingQueue {

    static public class Stack {
        int[] data;
        int size = 10;
        int ptr = -1;

        Stack(int size) {
            this.data = new int[size];
        }

        public void push(int item) {
            if (isFull()) {
                System.out.println("Stack is full");
            }
            ptr++;
            data[ptr] = item;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int removed = data[ptr];
            ptr--;
            return removed;
        }

        public int returnTop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return data[ptr];
        }

        public void display() {
            for (int i = 0; i <= ptr; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        public boolean isFull() {
            return ptr == data.length - 1;
        }

        public boolean isEmpty() {
            return ptr == -1;
        }
    }

    public static class Queue {
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
                return -1;
            }
            int temp = data[front++];
            if (front == size) {
                front = 0;
            }
            currPosition--;
            return temp;
        }

        public boolean isFull() {
            return size == currPosition;
        }

        public boolean isEmpty() {
            return currPosition == 0;
        }

        public void display() {
            for (int i = front; i < front + currPosition; i++) {
                System.out.print(data[i % size] + " ");
            }
            System.out.println();
        }
    }

    public static class   MainClassForStackReversal {
        public static void reverseStack(Stack stack, Queue queue) {

            while (!stack.isEmpty()) {
                queue.push(stack.pop());
            }
            while (!queue.isEmpty()) {
                stack.push(queue.pop());
            }
        }

        public static void main(String[] args) {
            Stack stack = new Stack(10);
            Queue queue = new Queue(10);

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            System.out.println("Original Stack:");
            stack.display();
            reverseStack(stack, queue);

            System.out.println(" Stack after reversal :");
            stack.display();
        }
    }


}