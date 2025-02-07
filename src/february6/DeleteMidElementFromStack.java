package february6;

public class DeleteMidElementFromStack {
    static int size;

    static class Stack {
        int[] data;


        Stack(int size) {
            this.data = new int[size];
        }

        int ptr = -1;

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
                System.out.println("Stack is Empty");
                return -1;
            }
            int removes = data[ptr];
            ptr--;
            return removes;
        }

        public int top() {
            if (isEmpty()) {
                System.out.println("List  is Empty");
            }
            int top = data[ptr];
            return top;

        }

        public void display() {
            for (int i = 0; i <= ptr; i++) {
                System.out.print(data[i] + " ");
            }

        }


        public boolean isFull() {
            return ptr == data.length - 1;
        }

        public boolean isEmpty() {
            return ptr == -1;
        }

    }

    static void deleteMid(Stack stack) {
        size = 7;
        int mid = size / 2;
        Stack tempStack = new Stack(size);
        for (int i = 0; i < mid; i++) {
            tempStack.push(stack.pop());

        }
        stack.pop();
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(3);
        stack.push(66);
        stack.push(90);
        stack.push(45);
        stack.push(15);
        System.out.println(" stack with mid element");
       stack.display();
       deleteMid(stack);
        System.out.println(" stack without mid element");
       stack.display();
    }

}


