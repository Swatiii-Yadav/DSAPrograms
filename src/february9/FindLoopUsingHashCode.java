package february9;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class FindLoopUsingHashCode
{
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

    public boolean checkLoop(Node head){
        HashSet<Integer> hashNode=new HashSet<>();
        Node curr=head;
        while (curr!=null){
            int hash=System.identityHashCode(curr);
            if (hashNode.contains(hash)){
                return true;
            }
            hashNode.add(hash);
            curr=curr.next;
        }
        return false;

    }

    public static void main(String[] args) {
        FindLoopUsingHashCode list=new FindLoopUsingHashCode();

        list.insertNode(14);
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);


        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head.next;
        if (list.checkLoop(head)){
            System.out.println("Loop detected in list");
        }
        else{
            System.out.println("Loop is not detected");
        }
    }
}
