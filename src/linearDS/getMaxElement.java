package linearDS;

public class getMaxElement {
    int[] arr;
    int size;
    int max;
    int ptr;

    getMaxElement(int size) {
        this.arr = new int[size];
        this.ptr = -1;
        this.max = Integer.MIN_VALUE;
    }

    void push(int val) {
        if (isFull()) {
            System.out.println("Stack overFlow");
            return;
        }
        if (isEmpty()) {
            max = val;
        } else {
            max = Math.max(max, val);
        }
        System.out.print(val + "-->");
        arr[ptr++] = val;

    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        int x = arr[--ptr];
        if (x == max) {
            max = Integer.MIN_VALUE;
            for (int i = 0; i <= ptr; i++) {
                max = Math.max(max, arr[i]);
            }
        }
        return x;
    }

    int getMax() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return max;
    }

    boolean isFull() {
        return ptr == size - 1;
    }

    boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) {
        getMaxElement get = new getMaxElement(15);
        get.push(5);
        get.push(10);
        get.push(3);
        get.push(13);

        System.out.println("Get min --> "+get.getMax());
    }
}
