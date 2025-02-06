package february5;


//Given a stack of integers, sort it in ascending order using another temporary stack.
public class sortStackUsingAnotherStack {
    static int size = 10;

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


    static Stack sortStack(Stack input) {
        Stack tempStack = new Stack(size);
        while (!input.isEmpty()) {
            int temp = input.pop();
            while (!tempStack.isEmpty()) {
                if (temp > tempStack.top()) {
                    // Move elements from tempStack back to inputStack if they are greater than temp
                    input.push(tempStack.pop());
                }
                tempStack.push(temp);
            }
        }
        while (!tempStack.isEmpty()) {
            input.push(tempStack.pop());
        }
        return input;

    }

    public static void main(String[] args) {
        Stack input = new Stack(size);
        input.push(34);
        input.push(3);
        input.push(31);
        input.push(98);
        input.push(92);
        input.push(23);

        System.out.println("before sorting");
        input.display();
        System.out.println();
        input=sortStack(input);
        System.out.println("After  sorting");
        input.display();
    }
}
