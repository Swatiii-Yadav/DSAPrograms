package february4;

import java.util.List;

/* 2->1->5
output->  [5,5,0]
2-> 7-> 4-> 3-> 5
[7,0,5,5,0]
* */
public class NextGreaterElement {

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

    }

    int[] NextGreater(Node head) {
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        Node curr = head;
        int[] result = new int[len];
        int i = 0;
        while (curr != null) {
            Node nextNode = curr.next;
            while (nextNode != null) {
                if (nextNode.data > curr.data) {
                    result[i] = nextNode.data;

                    break;
                }
                nextNode = nextNode.next;
            }
            i++;
            curr = curr.next;

        }
        return result;

    }

    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -->");
            curr = curr.next;
        }
    }

    void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j+" ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        NextGreaterElement list = new NextGreaterElement();
        list.insertNode(2);
        list.insertNode(4);
        list.insertNode(1);
        list.insertNode(7);
        list.insertNode(0);
        list.insertNode(12);
        System.out.println("original list");
        list.printList();
        System.out.println();
        System.out.println("array of next greater element ");
        int[] result = list.NextGreater(head);
        list.printArr(result);

    }

}
