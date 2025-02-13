package february12;

public class AstroidCollision {

    static public class Stack {
        int[] data;
        int size = 10;

        Stack(int size) {
            this.data = new int[size];
        }

        int ptr = -1;

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
            }
            int removes = data[ptr];
            ptr--;
            return removes;
        }

        public int returnTop() {
            if (isEmpty()) {
                System.out.println("List  is Empty");
            }
            int top = data[ptr];
            return top;

        }


        public boolean isFull() {

            return ptr == data.length - 1;
        }

        public boolean isEmpty() {
            return ptr == -1;
        }

        public int size() {
            return ptr+1;
        }
    }

         static int[] asteroidCollision(int[] arr) {
            Stack stack = new Stack(10);

            for (int a : arr) {

                while (a < 0 && !stack.isEmpty() && stack.returnTop() > 0) {
                    int top = stack.returnTop();

                    if (Math.abs(top) > Math.abs(a)) {
                        a = 0;
                    }

                    else if (Math.abs(top) == Math.abs(a)) {
                        stack.pop();
                        a = 0;
                    }
                    else {
                        stack.pop();
                    }
                }

                if (a != 0) {
                    stack.push(a);
                }
            }

            int[] result = new int[stack.size()];
            for (int i = stack.size() - 1; i >= 0; i--) {
                result[i] = stack.pop();
            }

            return result;
        }

        public static void main(String[] args) {
            int[] arr = {5, 10, -5};
            int[] result = asteroidCollision(arr);

            for (int a : result) {
                System.out.print(a + " ");
            }
        }


}
