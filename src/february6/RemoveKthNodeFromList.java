package february6;


import java.util.LinkedList;
import java.util.Queue;

public class RemoveKthNodeFromList {
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

    Node remove(int k) {

        if (head == null || k <= 0) return head;

        Queue<Node> queue = new LinkedList<>();
        Node curr = head;
        int temp = 1;

        while (curr != null) {
            if (temp % k != 0) {
                queue.add(curr);
            }
            curr = curr.next;
            temp++;
        }


        if (queue.isEmpty()) return null;

        Node newHead = queue.poll();
        Node tempNode = newHead;

        while (!queue.isEmpty()) {
            tempNode.next = queue.poll();
            tempNode = tempNode.next;
        }
        tempNode.next = null;

        return newHead;
    }

    public  void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveKthNodeFromList list = new RemoveKthNodeFromList();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.insertNode(50);
        list.insertNode(60);
        System.out.println("Original list");
        list.display(head);
        list.remove(3);
        System.out.println("list after deleting kth node");
        list.display(head);


    }
}
