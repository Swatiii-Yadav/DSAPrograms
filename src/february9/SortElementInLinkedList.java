package february9;

import java.util.Stack;

public class SortElementInLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    int len = 0;

    void insertNode(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
        ++len;
    }

    void sortList() {
        Node temp = head;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (temp != null) {
            if (stack1.isEmpty() || temp.data <= stack1.peek()) {
                stack1.push(temp.data);
            }
            stack2.push(stack1.peek());
            temp = temp.next;
        }

        stack1.push(stack2.pop());
        Node curr = head;
        if (stack1.isEmpty()) {
            return;
        }
        while (!stack1.isEmpty()) {
            curr.data = stack1.pop();
            curr = curr.next;
        }
    }

    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -->");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        SortElementInLinkedList list = new SortElementInLinkedList();
        list.insertNode(0);
        list.insertNode(2);
        list.insertNode(1);
        list.insertNode(1);
        list.insertNode(2);
        list.printList();
        list.sortList();
        System.out.println();
        list.printList();

    }
}
