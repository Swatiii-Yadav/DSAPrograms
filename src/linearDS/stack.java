package linearDS;

public class stack {
    int[] data;
    int size = 10;

    stack(int size) {
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

    public static void main(String[] args) {
        stack st = new stack(10);
        st.push(16);
        st.push(26);
        st.push(36);
        st.push(46);
        st.push(56);
        st.display();
        System.out.println();
        System.out.println(st.pop());
        System.out.println("Top of stack "+st.returnTop());
    }
}
