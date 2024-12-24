package december24;

public class StackReversal {


        int[] data;
        int size = 10;
        int ptr = -1;


        StackReversal(int size) {
            this.data = new int[size];
        }

        public void push(int item) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            ptr++;
            data[ptr] = item;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // or throw an exception if necessary
            }
            int removed = data[ptr];
            ptr--;
            return removed;
        }


        public int returnTop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // or throw an exception if necessary
            }
            return data[ptr];
        }


        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
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

        // Method to reverse the stack using recursion
        public void reverse() {

            if (isEmpty()) {
                return;
            }

            int top = pop();
            reverse();
            insertAtBottom(top);
        }

        // Helper method to insert an element at the bottom of the stack
        public void insertAtBottom(int item) {
            // Base case: if the stack is empty, push the item
            if (isEmpty()) {
                push(item);
                return;
            }
            int top = pop();
            insertAtBottom(item);
            push(top);
        }


        public static void main(String[] args) {
            StackReversal stack = new StackReversal(10);


            stack.push(7);
            stack.push(1);
            stack.push(0);
            stack.push(5);
            stack.push(6);

            System.out.println("original Stack: ");
            stack.display();

            // Reverse the stack
            stack.reverse();

            System.out.println("reversed Stack: ");
            stack.display();
        }
    }



