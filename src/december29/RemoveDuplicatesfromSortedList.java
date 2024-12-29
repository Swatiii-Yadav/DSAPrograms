package december29;

public class RemoveDuplicatesfromSortedList {
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }



    static ListNode head;


    public void insertFirst(int data){
         ListNode node=new ListNode(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }


    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        while (head != null && head.next != null) {
            if (head.data == head.next.data) {
                // Skip all duplicates
                while (head.next != null && head.data == head.next.data) {
                    head = head.next;
                }
                temp.next = head.next;
            } else {
                temp = temp.next;
            }
            head = head.next;
        }

        return dummy.next;


    }
    public void print(ListNode temp) {
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
RemoveDuplicatesfromSortedList list=new RemoveDuplicatesfromSortedList();
list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.deleteDuplicates(head);
        list.print(head);

    }
}
