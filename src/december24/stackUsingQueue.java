package december24;


    public class stackUsingQueue {
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
                return currPosition == size;
            }

            public boolean isEmpty() {
                return currPosition == 0;
            }
        }

        private queue q1;
        private queue q2;

        stackUsingQueue(int size) {
            q1 = new queue(size);
            q2 = new queue(size);
        }

        // Push element x onto stack
        public void push(int x) {
            q2.push(x);

            // Transfer all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.push(q1.pop());
            }

            // Swap the references of q1 and q2
            queue temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // Removes the element on top of the stack and returns it
        public int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack underFlow");
                return -1;
            }
            return q1.pop();
        }

        // Get the top element
        public int top() {
            if (q1.isEmpty()) {
                System.out.println("Stack underFlow");
                return -1;
            }
            return q1.data[q1.front]; // The front of q1 is the top of the stack
        }

        // Return whether the stack is empty
        public boolean empty() {
            return q1.isEmpty();
        }

        // Display elements in the stack
        public void print() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            System.out.print("Stack elements: ");
            // Printing from the front to the rear of the queue
            for (int i = q1.front; i != q1.rear; i = (i + 1) % q1.size) {
                System.out.print(q1.data[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            stackUsingQueue stack = new stackUsingQueue(10);

            // Push elements onto the stack
            stack.push(1);
            stack.push(8);
            stack.push(3);
            stack.push(9);
            stack.push(15);


            stack.print();
            // Pop elements from the stack and display them
            stack.pop();
           stack.pop();
            stack.print();


        }
    }
