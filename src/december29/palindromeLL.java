package december29;

public class palindromeLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



   static Node head;


    public void insertFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverse(slow.next); // reverse second list
        slow.next = null;
        while (rev != null) {
            if (head.data != rev.data) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
return true;
    }

    public static void main(String[] args) {
        palindromeLL list=new palindromeLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(1);
        boolean result=list.isPalindrome(head);
        System.out.println(result);
    }
}
